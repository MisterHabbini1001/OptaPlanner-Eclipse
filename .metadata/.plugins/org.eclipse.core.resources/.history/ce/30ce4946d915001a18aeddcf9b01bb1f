/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
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

package org.optaplanner.examples.taskassigning.domain.solver;

import java.util.Objects;

import org.optaplanner.core.impl.domain.variable.listener.VariableListener;
import org.optaplanner.core.impl.score.director.ScoreDirector;
import org.optaplanner.examples.taskassigning.domain.Employee;
import org.optaplanner.examples.taskassigning.domain.Task;
import org.optaplanner.examples.taskassigning.domain.TaskOrEmployee;
import org.optaplanner.examples.taskassigning.domain.TaskType;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;


public class StartTimeUpdatingVariableListener implements VariableListener<Task> {
	
    @Override
    public void beforeEntityAdded(ScoreDirector scoreDirector, Task task) {
        // Do nothing
    }

    @Override
    public void afterEntityAdded(ScoreDirector scoreDirector, Task task) {
        updateStartTime(scoreDirector, task);
    }

    @Override
    public void beforeVariableChanged(ScoreDirector scoreDirector, Task task) {
        // Do nothing
    }

    @Override
    public void afterVariableChanged(ScoreDirector scoreDirector, Task task) {
        updateStartTime(scoreDirector, task);
    }

    @Override
    public void beforeEntityRemoved(ScoreDirector scoreDirector, Task task) {
        // Do nothing
    }

    @Override
    public void afterEntityRemoved(ScoreDirector scoreDirector, Task task) {
        // Do nothing
    }

    protected void updateStartTime(ScoreDirector scoreDirector, Task sourceTask) {
        TaskOrEmployee previous = sourceTask.getPreviousTaskOrEmployee();
        Task shadowTask = sourceTask;
        Integer previousEndTime = (previous == null ? null : previous.getEndTime());
        Integer startTime = calculateStartTime(shadowTask, previousEndTime);
        while (shadowTask != null && !Objects.equals(shadowTask.getStartTime(), startTime)) {
            scoreDirector.beforeVariableChanged(shadowTask, "startTime");
    		shadowTask.setStartTime(startTime);
            scoreDirector.afterVariableChanged(shadowTask, "startTime");
            previousEndTime = shadowTask.getEndTime();
            shadowTask = shadowTask.getNextTask();
            startTime = calculateStartTime(shadowTask, previousEndTime);
        }
    }
    
    
    private Integer calculateStartTime(Task task, Integer previousEndTime) {
        if (task == null || previousEndTime == null) {
            return null;
        }
        //habbo+
        int startTime = Math.max(task.getReadyTime(), previousEndTime);
        Employee employee = task.getEmployee();
        //start is after start of capacity 
        startTime = Math.max(startTime, employee.getWorkStart(startTime));
        int duration = task.getDuration();
        int travelHome = task.getTravelHomeDuration();
        //get to next capacity until you reached 4 weeks, so tasks which take longer than current capacity can still be planned
        while ((startTime + duration + travelHome > employee.getCapacityEndTime()) && startTime < 1440 * 28) {
        	startTime = employee.getCapacityEndTime() + 1;
            startTime = Math.max(startTime,  employee.getWorkStart(startTime));
        }
        return startTime;
        //habbo-
    }
    

}
