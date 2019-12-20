package org.optaplanner.examples.taskassigning.domain;

public enum TK_Affinity 
{
    NONE(4),
    LOW(3),
    MEDIUM(2),
    HIGH(1);

    private final int durationMultiplier;

    TK_Affinity(int durationMultiplier) 
    {
        this.durationMultiplier = durationMultiplier;
    }

    public int getDurationMultiplier() 
    {
    	//habbo+
        //return durationMultiplier;
    	return 2;
    	//habbo-
    }

    public String getLabel() 
    {
        switch (this) {
            case NONE:
                return "No affinity";
            case LOW:
                return "Low affinity";
            case MEDIUM:
                return "Medium affinity";
            case HIGH:
                return "High affinity";
            default:
                throw new IllegalStateException("The affinity (" + this + ") is not implemented.");
        }
    }
}
