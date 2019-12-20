package org.optaplanner.examples.thermokingplanning.domain;

public enum TK_Priority 
{
    MINOR,
    MAJOR,
    CRITICAL;

    public String getLabel() 
    {
        switch (this) 
        {
            case MINOR:
                return "Minor priority";
            case MAJOR:
                return "Major priority";
            case CRITICAL:
                return "Critical priority";
            default:
                throw new IllegalStateException("The priority (" + this + ") is not implemented.");
        }
    }
}
