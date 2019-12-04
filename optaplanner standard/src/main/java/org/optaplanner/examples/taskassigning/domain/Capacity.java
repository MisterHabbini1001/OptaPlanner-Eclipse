package org.optaplanner.examples.taskassigning.domain;
import org.optaplanner.examples.common.domain.AbstractPersistable;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("TaCapacity")
public class Capacity extends AbstractPersistable 
{
	private Integer startTime;
	private Integer endTime;

	public Capacity() 
	{
	}

	public Capacity(long id, Integer startTime, Integer endTime) 
	{	
        super(id);
        this.startTime = startTime;
        this.endTime = endTime;
    }
   
    public void setStartTime(int startTime) 
    {
        this.startTime = startTime;
    }

    public int getStartTime() 
    {
        return startTime;
    }

    public void setEndTime(int endTime) 
    {
        this.endTime = endTime;
    }

    public int getEndTime() 
    {
        return endTime;
    }   
}
