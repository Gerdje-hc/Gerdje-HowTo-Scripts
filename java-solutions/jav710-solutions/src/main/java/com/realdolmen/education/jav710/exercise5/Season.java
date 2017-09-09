package com.realdolmen.education.jav710.exercise5;

public enum Season {
    winter(0.85),
    spring(0.62),
    summer(0.07),
    fall(0.75);

    public final double snowProbability;

    Season(double snowProbability) {
        this.snowProbability = snowProbability;
    }
}
