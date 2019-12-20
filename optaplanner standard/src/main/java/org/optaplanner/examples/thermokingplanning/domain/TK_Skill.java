package org.optaplanner.examples.thermokingplanning.domain;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("TaSkill")
public class TK_Skill extends Skill
{
    private String name;

    public TK_Skill() 
    {
    }

    public TK_Skill(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

    @Override
    public String getLabel() 
    {
        return name;
    }

    @Override
    public String toString() 
    {
        return name;
    }
}
