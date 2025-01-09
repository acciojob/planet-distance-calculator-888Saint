package com.driver;

public class PlanetDistanceCalculator {
	private final SolarSystemService solarSystemService;

    public PlanetDistanceCalculator(SolarSystemService solarSystemService) {
    	// your code goes here
        this.solarSystemService = solarSystemService;
    }

    public double getDistance(String planetName) {
    	// your code goes here
        return solarSystemService.getDistanceFromSun(planetName);
    }

    public double calculateRelativeDistance(String planet1, String planet2) {
    	// your code goes here
    	double distance1 = getDistance(planet1);
        double distance2 = getDistance(planet2);
        return Math.abs(distance1 - distance2);
    }
}
