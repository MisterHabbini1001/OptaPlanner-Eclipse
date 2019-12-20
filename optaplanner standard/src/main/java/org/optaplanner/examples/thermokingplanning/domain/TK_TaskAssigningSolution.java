package org.optaplanner.examples.thermokingplanning.domain;
import java.text.NumberFormat;
import java.util.List;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;
import org.optaplanner.persistence.xstream.api.score.buildin.bendable.BendableScoreXStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@PlanningSolution
@XStreamAlias("TaTaskAssigningSolution")
public class TK_TaskAssigningSolution extends TaskAssigningSolution
{
    @ProblemFactCollectionProperty
    private List<Skill> skillList;
    @ProblemFactCollectionProperty
    private List<TaskType> taskTypeList;
    @ProblemFactCollectionProperty
    private List<Customer> customerList;
    //habbo+
    //@ProblemFactCollectionProperty
    private List<Capacity> capacityList;
    //habbo-
    @ValueRangeProvider(id = "employeeRange")
    @ProblemFactCollectionProperty
    private List<Employee> employeeList;

    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "taskRange")
    private List<Task> taskList;

    @XStreamConverter(BendableScoreXStreamConverter.class)
    @PlanningScore(bendableHardLevelsSize = 1, bendableSoftLevelsSize = 2)
    private BendableScore score;

    /** Relates to {@link Task#getStartTime()}. */
    private int frozenCutoff; // In minutes

    public TK_TaskAssigningSolution() 
    {
    }

    //habbo+
    public TK_TaskAssigningSolution(List<Skill> skillList, List<TaskType> taskTypeList,
            //List<Customer> customerList, List<Employee> employeeList, List<Task> taskList) {
           List<Customer> customerList, List<Employee> employeeList, List<Task> taskList, List<Capacity> capacityList) {
    	//habbo-
        this.skillList = skillList;
        this.taskTypeList = taskTypeList;
        this.customerList = customerList;
        this.employeeList = employeeList;
        this.taskList = taskList;
        this.capacityList = capacityList;//habbo+-
    }

    public List<Skill> getSkillList() 
    {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) 
    {
        this.skillList = skillList;
    }

    public List<TaskType> getTaskTypeList() 
    {
        return taskTypeList;
    }

    public void setTaskTypeList(List<TaskType> taskTypeList) 
    {
        this.taskTypeList = taskTypeList;
    }

    public List<Customer> getCustomerList() 
    {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) 
    {
        this.customerList = customerList;
    }

    public List<Employee> getEmployeeList() 
    {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) 
    {
        this.employeeList = employeeList;
    }

    public List<Task> getTaskList() 
    {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) 
    {
        this.taskList = taskList;
    }
    
    //habbo+
    public List<Capacity> getCapacityList() 
    {
    	System.out.println("Capacity get");
        return capacityList;
    }

    public void setCapacityList(List<Capacity> capacityList) 
    {
        this.capacityList = capacityList;
    	System.out.println(capacityList.size());
    	System.out.println("Capacity set");    	
    }
    
    //habbo-

    public BendableScore getScore() 
    {
        return score;
    }

    public void setScore(BendableScore score) 
    {
        this.score = score;
    }

    public int getFrozenCutoff() 
    {
        return frozenCutoff;
    }

    public void setFrozenCutoff(int frozenCutoff) 
    {
        this.frozenCutoff = frozenCutoff;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************
    
    public String getTravelDurationString(NumberFormat numberFormat) 
    {
        if (score == null) 
        {
            return null;
        }
        
        long travelDuration = - score.getSoftScore(1);
        return numberFormat.format(((double) travelDuration) / 60.0);
   }
}
