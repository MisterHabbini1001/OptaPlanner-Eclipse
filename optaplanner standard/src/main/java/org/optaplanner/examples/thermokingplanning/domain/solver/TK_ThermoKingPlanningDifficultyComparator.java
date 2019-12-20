package org.optaplanner.examples.thermokingplanning.domain.solver;
import java.util.Comparator;
import org.optaplanner.examples.taskassigning.domain.Task;

public class TK_ThermoKingPlanningDifficultyComparator extends ThermoKingPlanningComparator
{
    private static final Comparator<Task> COMPARATOR =
            Comparator.comparing(Task::getPriority)
                    .thenComparingInt(task -> task.getTaskType().getRequiredSkillList().size())
                    //.thenComparingInt(task -> task.getTaskType().getBaseDuration())
                    .thenComparingInt(task -> task.getDuration())
                    .thenComparingLong(Task::getId);

    public int compare(Task a, Task b) 
    {
        return COMPARATOR.compare(a, b);
    }
}