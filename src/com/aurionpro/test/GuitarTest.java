package com.aurionpro.test;

import com.aurionpro.model.Builder;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarTest {

	public static void main(String[] args) {

		Inventory i1 = new Inventory();
		i1.addGuitar("101", 500, new GuitarSpec(Builder.COLLINGS, "Aris", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 12));
		i1.addGuitar("102", 600, new GuitarSpec(Builder.COLLINGS, "Aris", Type.ELECTRIC, Wood.CEDAR, Wood.ALDER, 12));
		i1.addGuitar("103", 700, new GuitarSpec(Builder.COLLINGS, "A1", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 12));
		i1.addGuitar("104", 800, new GuitarSpec(Builder.COLLINGS, "A1", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 12));
		i1.addGuitar("105", 300, new GuitarSpec(Builder.COLLINGS, "A1", Type.ELECTRIC, Wood.CEDAR, Wood.ALDER, 12));

		System.out.println(i1.getGuitar("102"));
		GuitarSpec g1 = new GuitarSpec(Builder.COLLINGS, "A1", Type.ELECTRIC, Wood.CEDAR, Wood.ALDER, 12);
		System.out.println(i1.searchGuitar(g1));
	}
}
