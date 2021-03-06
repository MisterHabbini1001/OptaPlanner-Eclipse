package org.optaplanner.examples.vehiclerouting.domain.timewindowed;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.CustomShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableReference;
import org.optaplanner.examples.vehiclerouting.domain.timewindowed.solver.ArrivalTimeUpdatingVariableListener;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@PlanningEntity
@XStreamAlias("VrpTimeWindowedCustomer")
public class TK_TimeWindowedCustomer extends TimeWindowedCustomer
{
    // Times are multiplied by 1000 to avoid floating point arithmetic rounding errors
    private long readyTime;
    private long dueTime;
    private long serviceDuration;

    // Shadow variable
    private Long arrivalTime;

    public long getReadyTime() 
    {
        return readyTime;
    }

    public void setReadyTime(long readyTime) 
    {
        this.readyTime = readyTime;
    }

    public long getDueTime() 
    {
        return dueTime;
    }

    public void setDueTime(long dueTime) 
    {
        this.dueTime = dueTime;
    }

    public long getServiceDuration() 
    {
        return serviceDuration;
    }

    public void setServiceDuration(long serviceDuration) 
    {
        this.serviceDuration = serviceDuration;
    }

    @CustomShadowVariable(variableListenerClass = ArrivalTimeUpdatingVariableListener.class,
            // Arguable, to adhere to API specs (although this works), nextCustomer should also be a source,
            // because this shadow must be triggered after nextCustomer (but there is no need to be triggered by nextCustomer)
            sources = {@PlanningVariableReference(variableName = "previousStandstill")})
    public Long getArrivalTime() 
    {
        return arrivalTime;
    }

    public void setArrivalTime(Long arrivalTime) 
    {
        this.arrivalTime = arrivalTime;
    }

    public Long getDepartureTime() 
    {
        if (arrivalTime == null) 
        {
            return null;
        }
        return Math.max(arrivalTime, readyTime) + serviceDuration;
    }

    public boolean isArrivalBeforeReadyTime() 
    {
        return arrivalTime != null
                && arrivalTime < readyTime;
    }

    public boolean isArrivalAfterDueTime() 
    {
        return arrivalTime != null
                && dueTime < arrivalTime;
    }

    @Override
    public TimeWindowedCustomer getNextCustomer() 
    {
        return (TimeWindowedCustomer) super.getNextCustomer();
    }

    public long getTimeWindowGapTo(TimeWindowedCustomer other) 
    {
        // dueTime doesn't account for serviceDuration
        long latestDepartureTime = dueTime + serviceDuration;
        long otherLatestDepartureTime = other.getDueTime() + other.getServiceDuration();
        if (latestDepartureTime < other.getReadyTime()) 
        {
            return other.getReadyTime() - latestDepartureTime;
        }
        
        if (otherLatestDepartureTime < readyTime) 
        {
            return readyTime - otherLatestDepartureTime;
        }
        
        return 0L;
    }
}
