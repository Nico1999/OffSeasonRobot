package org.usfirst.frc.team4322.beachblitzrobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGroup_CrossRamparts extends CommandGroup
{
    public AutoGroup_CrossRamparts()
    {
        addSequential(new DriveBase_DriveDistance(180, 1));
        addSequential(new Auto_AntiTortuga(this));
    }
}
