/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.examples.thermokingplanning.swingui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ImageIcon;

import org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScore;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;

import org.optaplanner.examples.common.swingui.latitudelongitude.LatitudeLongitudeTranslator;
import org.optaplanner.examples.taskassigning.domain.Employee;
import org.optaplanner.examples.taskassigning.domain.Task;
import org.optaplanner.examples.taskassigning.domain.TaskOrEmployee;
import org.optaplanner.examples.technicianscheduling.domain.TechnicianSchedulingSolution;
import org.optaplanner.examples.taskassigning.domain.TaskAssigningSolution;
import org.optaplanner.examples.technicianscheduling.domain.location.AirLocation;
import org.optaplanner.examples.technicianscheduling.domain.location.DistanceType;
import org.optaplanner.examples.technicianscheduling.domain.location.Location;
import org.optaplanner.swing.impl.TangoColorFactory;

public class ThermoKingPlanningSolutionPainter {

    private static final int TEXT_SIZE = 12;
    private static final int TIME_WINDOW_DIAMETER = 26;
    private static final NumberFormat NUMBER_FORMAT = new DecimalFormat("#,##0.00");

    private static final String IMAGE_PATH_PREFIX = "/org/optaplanner/examples/taskassigning/swingui/";

    private ImageIcon depotImageIcon;
    private ImageIcon[] vehicleImageIcons;

    private BufferedImage canvas = null;
    private LatitudeLongitudeTranslator translator = null;
    private Long minimumTimeWindowTime = null;
    private Long maximumTimeWindowTime = null;

    public ThermoKingPlanningSolutionPainter() {
        depotImageIcon = new ImageIcon(getClass().getResource(IMAGE_PATH_PREFIX + "depot.png"));
        vehicleImageIcons = new ImageIcon[]{new ImageIcon(getClass().getResource(IMAGE_PATH_PREFIX + "vehicleChameleon.png")), new ImageIcon(getClass().getResource(IMAGE_PATH_PREFIX + "vehicleButter.png")), new ImageIcon(getClass().getResource(IMAGE_PATH_PREFIX + "vehicleSkyBlue.png")), new ImageIcon(getClass().getResource(IMAGE_PATH_PREFIX + "vehicleChocolate.png")), new ImageIcon(getClass().getResource(IMAGE_PATH_PREFIX + "vehiclePlum.png")),
        };
        if (vehicleImageIcons.length != TangoColorFactory.SEQUENCE_1.length) {
            throw new IllegalStateException("The vehicleImageIcons length (" + vehicleImageIcons.length + ") should be equal to the TangoColorFactory.SEQUENCE length (" + TangoColorFactory.SEQUENCE_1.length + ").");
        }
    }

    public BufferedImage getCanvas() {
        return canvas;
    }

    public LatitudeLongitudeTranslator getTranslator() {
        return translator;
    }

    public void reset(TaskAssigningSolution solution, Dimension size, ImageObserver imageObserver) {
        translator = new LatitudeLongitudeTranslator();
        for (Task task : solution.getTaskList() ) {
        	translator.addCoordinates(task.getLatitude(), task.getLongitude());
        }
        for (Employee employee : solution.getEmployeeList()) {
        	translator.addCoordinates(employee.getLatitude(), employee.getLongitude());
        }
        determineMinimumAndMaximumTimeWindowTime(solution);
        double width = size.getWidth();
        double height = size.getHeight();
        translator.prepareFor(width, height - 10 - TEXT_SIZE);
        Graphics2D g = createCanvas(width, height);
        g.setFont(g.getFont().deriveFont((float) TEXT_SIZE));
        g.setStroke(TangoColorFactory.NORMAL_STROKE);
        g.setColor(TangoColorFactory.ALUMINIUM_3);
        
        g.setColor(Color.BLACK);
        for (Employee employee : solution.getEmployeeList()) {
            int x = translator.translateLongitudeToX(employee.getLongitude());
            int y = translator.translateLatitudeToY(employee.getLatitude());
            g.fillRect(x - 2, y - 2, 5, 5);
            g.drawString(employee.getFullName(), x , y - 50);
            g.drawImage(depotImageIcon.getImage(), x - depotImageIcon.getIconWidth() / 2, y - 2 - depotImageIcon.getIconHeight(), imageObserver);
        }
        
        //draw tasks
        for (Task task : solution.getTaskList() ) {
        	if (task.getEndTime() != null) {
        		int endTime = task.getEndTime();
        		if (endTime <= 1440) {
        			int x = translator.translateLongitudeToX(task.getLongitude());
        			int y = translator.translateLatitudeToY(task.getLatitude());
        			g.setColor(TangoColorFactory.ALUMINIUM_4);
        			g.fillRect(x - 1, y - 1, 3, 3);
        			g.drawString((task.getCode() != null ? task.getCode() : "?"), x, y);
        		}
        	}
        }

        //draw vehicle
        int colorIndex = 0;
        for (Employee vehicle : solution.getEmployeeList()) {
            g.setColor(TangoColorFactory.SEQUENCE_2[colorIndex]);
            Task vehicleInfoCustomer = null;
            long longestNonDepotDistance = -1L;
            for (Task task : solution.getTaskList()) {
            	if (task.getEndTime() != null) {
	            	int endTime = task.getEndTime();
	            	if (endTime <= 1440) {
		            	TaskOrEmployee previous;
		                if (task.getEmployee() == vehicle) {
		                	previous = task.getPreviousTaskOrEmployee();
		                    translator.drawRoute(g, previous.getLongitude(), previous.getLatitude(), task.getLongitude(), task.getLatitude(), true, false);
		                    //If there is no other task or on the next day then drive home
		                    Task nextTask = task.getNextTask();
		                    if (nextTask == null || nextTask.getStartTime() > 1440) {
		                        translator.drawRoute(g, task.getLongitude(), task.getLatitude(), vehicle.getLongitude(), vehicle.getLatitude(), true, true);
		                    }
		                }
	            	}
                }
            }
            /*
            int x = translator.translateLongitudeToX(vehicle.getLongitude());
            int y = translator.translateLatitudeToY(vehicle.getLatitude());
            g.setColor(TangoColorFactory.SEQUENCE_2[colorIndex]);
            g.fillRect(x - 1, y - 1, 3, 3);
            ImageIcon vehicleImageIcon = vehicleImageIcons[colorIndex];
            int vehicleInfoHeight = vehicleImageIcon.getIconHeight() + 2 + TEXT_SIZE;
            boolean ascending = false;
            g.drawImage(vehicleImageIcon.getImage(), x + 1, (ascending ? y - vehicleInfoHeight - 1 : y + 1), imageObserver);
            */
            colorIndex = (colorIndex + 1) % TangoColorFactory.SEQUENCE_2.length;
        }
    	
    
        /*
        for (Task customer : solution.getTaskList()) {
            Location location = customer.getLocation();
            int x = translator.translateLongitudeToX(location.getLongitude());
            int y = translator.translateLatitudeToY(location.getLatitude());
            g.setColor(TangoColorFactory.ALUMINIUM_4);
            g.fillRect(x - 1, y - 1, 3, 3);
            if (customer instanceof Task) {
                Task timeWindowedCustomer = customer;
                g.setColor(TangoColorFactory.ALUMINIUM_3);
                int circleX = x - (TIME_WINDOW_DIAMETER / 2);
                int circleY = y + 5;
                g.drawOval(circleX, circleY, TIME_WINDOW_DIAMETER, TIME_WINDOW_DIAMETER);
                g.fillArc(circleX, circleY, TIME_WINDOW_DIAMETER, TIME_WINDOW_DIAMETER, 90 - calculateTimeWindowDegree(timeWindowedCustomer.getReadyTime()), calculateTimeWindowDegree(timeWindowedCustomer.getReadyTime()) - calculateTimeWindowDegree(timeWindowedCustomer.getDueTime()));
                if (timeWindowedCustomer.getArrivalTime() != null) {
                    if (timeWindowedCustomer.isArrivalAfterDueTime()) {
                        g.setColor(TangoColorFactory.SCARLET_2);
                    } else if (timeWindowedCustomer.isArrivalBeforeReadyTime()) {
                        g.setColor(TangoColorFactory.ORANGE_2);
                    } else {
                        g.setColor(TangoColorFactory.ALUMINIUM_6);
                    }
                    g.setStroke(TangoColorFactory.THICK_STROKE);
                    int circleCenterY = y + 5 + TIME_WINDOW_DIAMETER / 2;
                    int angle = calculateTimeWindowDegree(timeWindowedCustomer.getArrivalTime());
                    g.drawLine(x, circleCenterY, x + (int) (Math.sin(Math.toRadians(angle)) * (TIME_WINDOW_DIAMETER / 2 + 3)), circleCenterY - (int) (Math.cos(Math.toRadians(angle)) * (TIME_WINDOW_DIAMETER / 2 + 3)));
                    g.setStroke(TangoColorFactory.NORMAL_STROKE);
                }
            }
        }

        int colorIndex = 0;
        // TODO Too many nested for loops
        for (Technician vehicle : solution.getTechnicianList()) {
            g.setColor(TangoColorFactory.SEQUENCE_2[colorIndex]);
            Task vehicleInfoCustomer = null;
            long longestNonDepotDistance = -1L;
            int load = 0;
            for (Task customer : solution.getTaskList()) {
                if (customer.getPreviousStandstill() != null && customer.getTechnician() == vehicle) {
                    Location previousLocation = customer.getPreviousStandstill().getLocation();
                    Location location = customer.getLocation();
                    translator.drawRoute(g, previousLocation.getLongitude(), previousLocation.getLatitude(), location.getLongitude(), location.getLatitude(), location instanceof AirLocation, false);
                    // Determine where to draw the vehicle info
                    long distance = customer.getDistanceFromPreviousStandstill();
                    if (customer.getPreviousStandstill() instanceof Task) {
                        if (longestNonDepotDistance < distance) {
                            longestNonDepotDistance = distance;
                            vehicleInfoCustomer = customer;
                        }
                    } else if (vehicleInfoCustomer == null) {
                        // If there is only 1 customer in this chain, draw it on a line to the Depot anyway
                        vehicleInfoCustomer = customer;
                    }
                    // Line back to the vehicle depot
                    if (customer.getNextTask() == null) {
                        Location vehicleLocation = vehicle.getLocation();
                        translator.drawRoute(g, location.getLongitude(), location.getLatitude(), vehicleLocation.getLongitude(), vehicleLocation.getLatitude(), location instanceof AirLocation, true);
                    }
                }
            }
            // Draw vehicle info
            if (vehicleInfoCustomer != null) {
                Location previousLocation = vehicleInfoCustomer.getPreviousStandstill().getLocation();
                Location location = vehicleInfoCustomer.getLocation();
                double longitude = (previousLocation.getLongitude() + location.getLongitude()) / 2.0;
                int x = translator.translateLongitudeToX(longitude);
                double latitude = (previousLocation.getLatitude() + location.getLatitude()) / 2.0;
                int y = translator.translateLatitudeToY(latitude);
                boolean ascending = (previousLocation.getLongitude() < location.getLongitude()) ^ (previousLocation.getLatitude() < location.getLatitude());

                ImageIcon vehicleImageIcon = vehicleImageIcons[colorIndex];
                int vehicleInfoHeight = vehicleImageIcon.getIconHeight() + 2 + TEXT_SIZE;
                g.drawImage(vehicleImageIcon.getImage(), x + 1, (ascending ? y - vehicleInfoHeight - 1 : y + 1), imageObserver);
            }
            colorIndex = (colorIndex + 1) % TangoColorFactory.SEQUENCE_2.length;
        }

        // Legend
        g.setColor(TangoColorFactory.ALUMINIUM_3);
        g.fillRect(5, (int) height - 12 - TEXT_SIZE - (TEXT_SIZE / 2), 5, 5);
        g.drawString("Depot", 15, (int) height - 10 - TEXT_SIZE);
        String vehiclesSizeString = solution.getTechnicianList().size() + " vehicles";
        g.drawString(vehiclesSizeString, ((int) width - g.getFontMetrics().stringWidth(vehiclesSizeString)) / 2, (int) height - 10 - TEXT_SIZE);
        g.setColor(TangoColorFactory.ALUMINIUM_4);
        g.fillRect(6, (int) height - 6 - (TEXT_SIZE / 2), 3, 3);
        g.drawString((solution instanceof TechnicianSchedulingSolution) ? "Customer: demand, time window and arrival time" : "Customer: demand", 15, (int) height - 5);
        String customersSizeString = solution.getTaskList().size() + " customers";
        g.drawString(customersSizeString, ((int) width - g.getFontMetrics().stringWidth(customersSizeString)) / 2, (int) height - 5);
        if (solution.getDistanceType() == DistanceType.AIR_DISTANCE) {
            String clickString = "Right click anywhere on the map to add a customer.";
            g.drawString(clickString, (int) width - 5 - g.getFontMetrics().stringWidth(clickString), (int) height - 5);
        }
        */
        
        // Show soft score
        g.setColor(TangoColorFactory.ORANGE_3);
        BendableScore score = solution.getScore();
        if (score != null) {
            String travelDurationString;
            if (!score.isFeasible()) {
                travelDurationString = "Not feasible";
            } else {
                travelDurationString = solution.getTravelDurationString(NUMBER_FORMAT);
            }
            g.setFont(g.getFont().deriveFont(Font.BOLD, (float) TEXT_SIZE * 2));
            g.drawString(travelDurationString, (int) width - g.getFontMetrics().stringWidth(travelDurationString) - 10, (int) height - 10 - TEXT_SIZE);
        }
    }

    private void determineMinimumAndMaximumTimeWindowTime(TaskAssigningSolution solution) {
        minimumTimeWindowTime = Long.MAX_VALUE;
        maximumTimeWindowTime = Long.MIN_VALUE;
        /*
        for (Depot depot : solution.getDepotList()) {
            Depot timeWindowedDepot = depot;
            long readyTime = timeWindowedDepot.getReadyTime();
            if (readyTime < minimumTimeWindowTime) {
                minimumTimeWindowTime = readyTime;
            }
            long dueTime = timeWindowedDepot.getDueTime();
            if (dueTime > maximumTimeWindowTime) {
                maximumTimeWindowTime = dueTime;
            }
        }
        for (Task customer : solution.getTaskList()) {
            if (customer instanceof Task) {
                Task timeWindowedCustomer = (Task) customer;
                long readyTime = timeWindowedCustomer.getReadyTime();
                if (readyTime < minimumTimeWindowTime) {
                    minimumTimeWindowTime = readyTime;
                }
                long dueTime = timeWindowedCustomer.getDueTime();
                if (dueTime > maximumTimeWindowTime) {
                    maximumTimeWindowTime = dueTime;
                }
            }
        }
        */
    }

    private int calculateTimeWindowDegree(long timeWindowTime) {
        return (int) (360L * (timeWindowTime - minimumTimeWindowTime) / (maximumTimeWindowTime - minimumTimeWindowTime));
    }

    public Graphics2D createCanvas(double width, double height) {
        int canvasWidth = (int) Math.ceil(width) + 1;
        int canvasHeight = (int) Math.ceil(height) + 1;
        canvas = new BufferedImage(canvasWidth, canvasHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = canvas.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvasWidth, canvasHeight);
        return g;
    }

}