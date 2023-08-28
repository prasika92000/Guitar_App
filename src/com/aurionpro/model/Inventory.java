package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	List<Guitar> guitars = new ArrayList<Guitar>();

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar newGuitar = new Guitar(serialNumber, price, spec);
		guitars.add(newGuitar);
	}

	public List<Guitar> getInventory() {
		return guitars;
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

//	public List<Guitar> searchGuitar(GuitarSpec spec) {
//		List<Guitar> searchResults = new ArrayList<Guitar>();
//	//	System.out.println("Inside");
//		for (Guitar guitar : searchResults) {
//			if (spec.matches(guitar.getSpecs())) {
//				searchResults.add(guitar);
//				System.out.println(searchResults);
//			}
//		}
//		return searchResults;
//	}
	public boolean searchGuitar(GuitarSpec searchGuitar) {
		  boolean isFound=false;
		  List<Guitar> results=new ArrayList<Guitar>();
		  for(Guitar guitarOG:guitars) {
		   if(searchGuitar.matches(guitarOG.getSpecs())) 
		   {
		    results.add(guitarOG);
		    isFound=true;
		   }
		  }
		  if(isFound==false) {
		   System.out.println("Sorry, we have nothing in inventory for you!");
		  }
		  if(isFound==true) 
		  {
		   System.out.println("We have these Guitars for you:");
		   System.out.println(results);
		  }
		return isFound;
}
}
