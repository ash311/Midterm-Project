package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.core.PersonException;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
		

	@Test
	public void testSalary() throws PersonException {
		Staff staff1 = new Staff("Honey", "Nut", "Cheerios", new Date(0,0,0), 
				"11 Box Road", "1234567891", "hncheerios@udel.edu", "Monday 11am", 1, 50000, new Date(0,0,0), eTitle.MR);
		Staff staff2 = new Staff("Very", "Berry", "Cheerios", new Date(0,0,0), "12 Box Street", "1987654321", "vbcheerios@udel.edu",
				"Tuesday 12pm", 2, 51000, new Date(0,0,0), eTitle.MS);
		Staff staff3 = new Staff ("Mutli", "Grain", "Cheerios", new Date(0,0,0), "13 Box Ave", "2345678912", "mgcheerios@udel.edu",
				"Wednesday 1pm", 3, 52000, new Date(0,0,0), eTitle.MRS);
		Staff staff4 = new Staff("Apple", "Cinnamon", "Cheerios", new Date(0,0,0), "14 Box Drive", "3456789123", "accheerios@udel.edu",
				"Thursday 2pm", 4, 53000, new Date(0,0,0), eTitle.MS);
		Staff staff5 = new Staff("Yogurt", "Burst", "Cheerios", new Date(0,0,0), "15 Box Lane", "4567891234", "ybcheerios@udel.edu",
				"Friday 3pm", 5, 54000, new Date(0,0,0), eTitle.MR);
		
		ArrayList<Staff> staffmembers = new ArrayList<Staff>();
			staffmembers.add(staff1);
			staffmembers.add(staff2);
			staffmembers.add(staff3);
			staffmembers.add(staff4);
			staffmembers.add(staff5);
			
	//average salary is: 52000
	
	int salarytotal = 0;
	int stafftotal = 0;
	for (Staff Staff: staffmembers) {
		salarytotal += Staff.getSalary();
		stafftotal += 1;
	}
	
	int avgsalary = (salarytotal/stafftotal);
		
	assertEquals(avgsalary,5200);
	}
	
	@Test (expected = PersonException.class)
	public void testPhoneNumber() throws PersonException {
		
		Staff staff = new Staff("a", "b", "c", new Date(0,0,0), "100 Putin Lane", "1-2-3", "abc@udel.edu",
				"Never", 6, 0, new Date(0,0,0), eTitle.MR);
	}
	
	@Test (expected = PersonException.class)
	public void testDOB() throws PersonException {
		
		Staff staff = new Staff("a", "b", "c", new Date(0,0,0), "100 Putin Lane", "(231)-456-7890", "abc@udel.edu",
				"Never", 6, 0, new Date(2,2,2), eTitle.MR);
	}
}
