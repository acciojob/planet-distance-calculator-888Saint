package com.driver;

public class PlanetDistanceCalculator {
	private final SolarSystemService solarSystemService;

    public PlanetDistanceCalculator(SolarSystemService solarSystemService) {
    	// your code goes here
    }

    public double getDistance(String planetName) {
    	// your code goes here
        return solarSystemService.getDistanceFromSun(planetName);
    }

    public double calculateRelativeDistance(String planet1, String planet2) {
    	// your code goes here
    	return 0.0;
    }
}
