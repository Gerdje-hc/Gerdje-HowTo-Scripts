package com.realdolmen.education.jav710.exercise10.a;

public class Submarine {
    private boolean safetyOn = true;

    public void receiveLaunchApproval() {
        safetyOn = false;
    }

    public void launchMissiles() throws LaunchException {
        System.out.println("Launching missiles.");
        if(safetyOn) {
            throw new LaunchException("Unable to launch missiles. The safety swich was on.");
        }
    }
}
