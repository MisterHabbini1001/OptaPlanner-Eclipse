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

import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import org.optaplanner.examples.common.swingui.latitudelongitude.LatitudeLongitudeTranslator;
import org.optaplanner.examples.taskassigning.domain.TaskAssigningSolution;
import org.optaplanner.examples.technicianscheduling.domain.TechnicianSchedulingSolution;
import org.optaplanner.examples.technicianscheduling.swingui.TechnicianSchedulingWorldPanel;

public class ThermoKingPlanningWorldPanel extends JPanel {

	private final ThermoKingPlanningPanel taskAssigningPanel;
	private ThermoKingPlanningSolutionPainter solutionPainter = new ThermoKingPlanningSolutionPainter(); 
   
	public ThermoKingPlanningWorldPanel(ThermoKingPlanningPanel taskAssigningPanel) {
		this.taskAssigningPanel = taskAssigningPanel;
		solutionPainter = new ThermoKingPlanningSolutionPainter();
		addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // TODO Not thread-safe during solving
                TaskAssigningSolution solution = ThermoKingPlanningWorldPanel.this.taskAssigningPanel.getTaskAssigningSolution();
                if (solution != null) {
                    resetPanel(solution);
                }
            }
        });
        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON2 || e.getButton() == MouseEvent.BUTTON3) {
                    LatitudeLongitudeTranslator translator = solutionPainter.getTranslator();
                    if (translator != null) {
                        double longitude = translator.translateXToLongitude(e.getX());
                        double latitude = translator.translateYToLatitude(e.getY());
                        ThermoKingPlanningWorldPanel.this.taskAssigningPanel.insertLocationAndCustomer(longitude, latitude);
                    }
                }
            }
        });
	}

    public void resetPanel(TaskAssigningSolution solution) {
        solutionPainter.reset(solution, getSize(), this);
        repaint();
    }

    public void updatePanel(TaskAssigningSolution solution) {
        resetPanel(solution);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage canvas = solutionPainter.getCanvas();
        if (canvas != null) {
            g.drawImage(canvas, 0, 0, this);
        }
    }
	
}	
