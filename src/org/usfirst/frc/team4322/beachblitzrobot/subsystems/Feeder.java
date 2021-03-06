package org.usfirst.frc.team4322.beachblitzrobot.subsystems;

import org.usfirst.frc.team4322.beachblitzrobot.RobotMap;
import org.usfirst.frc.team4322.beachblitzrobot.commands.Feeder_StopFeeder;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Feeder extends Subsystem {
    
    private Talon feederTalon;
   
    public Feeder()
    {
        feederTalon = new Talon(RobotMap.FEEDER_WHEEL_TALONSR_ID);
    }

    public void set(double speed)
    {
        feederTalon.set(speed);
    }
    
    /*@Override
    protected Command getDefaultCommand()
    {
        return new Feeder_StopFeeder();
    }*/

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

