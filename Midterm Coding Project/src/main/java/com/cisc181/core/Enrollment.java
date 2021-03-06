package com.cisc181.core;

import java.util.*;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {}
		
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		EnrollmentID = UUID.randomUUID();
		
	}
	
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}
	
	public void SetGrade (double Grade) {
		
		this.Grade = Grade;
	}
}