package com.driver;

import java.util.HashMap;
import java.util.Map;

public class SolarSystemServiceMock implements SolarSystemService {
	 private final Map<String, Double> planetDistances;

	 public SolarSystemServiceMock() {
		 this.planetDistances = new HashMap<>();
		 planetDistances.put("Mercury", 57.9);
		 planetDistances.put("Venus", 108.2);
		 planetDistances.put("Earth", 149.6);
		 planetDistances.put("Mars", 227.9);
		 planetDistances.put("Jupiter", 778.3);
		 planetDistances.put("Saturn", 1427.0);
		 planetDistances.put("Uranus", 2871.0);
		 planetDistances.put("Neptune", 4497.1);
	 }

	 @Override
	 public double getDistanceFromSun(String planetName) {
		// your code goes here
		 return planetDistances.getOrDefault(planetName, 0.0);
	 }
}
