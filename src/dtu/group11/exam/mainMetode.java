package dtu.group11.exam;

import java.util.ArrayList;

public class mainMetode {
	public static ArrayList<Projekt> projekter = new ArrayList<Projekt>();
	
	public static void main (String[] args){

		projekter.add(0, "TestProjekt1", "ProjektAnsvarlig1", 1234, 2345);
	}
}
