package org.optaplanner.examples.vehiclerouting.domain.timewindowed;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("VrpTimeWindowedDepot")
public class TK_TimeWindowedDepot extends TimeWindowedDepot
{
    // Times are multiplied by 1000 to avoid floating point arithmetic rounding errors
    private long readyTime;
    private long dueTime;

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
}
