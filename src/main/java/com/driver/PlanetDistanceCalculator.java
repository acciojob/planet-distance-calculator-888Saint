package com.driver;

public class PlanetDistanceCalculator {
	private final SolarSystemService solarSystemService;

    public PlanetDistanceCalculator(SolarSystemService solarSystemService) {
    	// your code goes here
        this.solarSystemService = solarSystemService;
    }

    public double getDistance(String planetName) {
    	// your code goes here
        double distance = solarSystemService.getDistanceFromSun(planetName);

        if (distance <= 0.0) {
            throw new IllegalArgumentException("Unknown planet: " + planetName);
        }

        return distance;
    }

    public double calculateRelativeDistance(String planet1, String planet2) {
    	// your code goes here
    	double distance1 = getDistance(planet1);
        double distance2 = getDistance(planet2);
        return Math.round(Math.abs(distance1 - distance2)*10.0)/10.0;
    }
}
