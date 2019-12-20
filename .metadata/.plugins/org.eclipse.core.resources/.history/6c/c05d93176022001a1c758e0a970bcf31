package org.optaplanner.examples.taskassigning.domain.solver;
import java.util.Objects;
import org.optaplanner.core.impl.score.director.ScoreDirector;
import org.optaplanner.examples.taskassigning.domain.Employee;
import org.optaplanner.examples.taskassigning.domain.Task;
import org.optaplanner.examples.taskassigning.domain.TaskOrEmployee;

public class TK_StartTimeUpdatingVariableListener extends StartTimeUpdatingVariableListener
{
    public void beforeEntityAdded(ScoreDirector scoreDirector, Task task) 
    {
        // Do nothing
    }

    public void afterEntityAdded(ScoreDirector scoreDirector, Task task) 
    {
        updateStartTime(scoreDirector, task);
    }

    public void beforeVariableChanged(ScoreDirector scoreDirector, Task task) 
    {
        // Do nothing
    }

    public void afterVariableChanged(ScoreDirector scoreDirector, Task task) 
    {
        updateStartTime(scoreDirector, task);
    }

    public void beforeEntityRemoved(ScoreDirector scoreDirector, Task task) 
    {
        // Do nothing
    }

    public void afterEntityRemoved(ScoreDirector scoreDirector, Task task) 
    {
        // Do nothing
    }

    protected void updateStartTime(ScoreDirector scoreDirector, Task sourceTask) 
    {
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
        
    private Integer calculateStartTime(Task task, Integer previousEndTime) 
    {
        if (task == null || previousEndTime == null) 
        {
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
        while ((startTime + duration + travelHome > employee.getCapacityEndTime()) && startTime < 1440 * 28) 
        {
        	startTime = employee.getCapacityEndTime() + 1;
            startTime = Math.max(startTime,  employee.getWorkStart(startTime));
        }
        
        return startTime;
        //habbo-
    }
}
