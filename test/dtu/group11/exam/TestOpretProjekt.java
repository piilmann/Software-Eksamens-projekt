package dtu.group11.exam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestOpretProjekt {
	
	public void TestProjekt(){
		Projekt testprojekt1 = new Projekt(0, "TestProjekt1", "ProjektAnsvarlig1", 1234, 2345);
		mainMetode.projekter.add(0, testprojekt1);
	}

}
