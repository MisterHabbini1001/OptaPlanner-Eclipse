package org.optaplanner.examples.thermokingplanning.domain;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;

public class TK_TaskOrEmployee 
{
    // Shadow variables
    @InverseRelationShadowVariable(sourceVariableName = "previousTaskOrEmployee")
    protected Task nextTask;
    private Integer endtime;
    private Employee employee;
    private double latitude;
    private double longitude;

    public TK_TaskOrEmployee() 
    {
    	
    }

    public Task getNextTask() 
    {
        return nextTask;
    }

    public void setNextTask(Task nextTask) 
    {
        this.nextTask = nextTask;
    }

    public Integer getEndTime()
    {
    	return endtime;
    }
    
    public Employee getEmployee()
    {
    	return employee;
    }
    
    public double getLatitude()
    {
    	return latitude;
    }
    
    public double getLongitude()
    {
    	return longitude;
    }
}
