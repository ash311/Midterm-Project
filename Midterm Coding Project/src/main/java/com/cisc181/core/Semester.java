package com.cisc181.core;
import java.util.Date;
import java.util.*;

public class Semester {

	private UUID CourseID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(){
		
	}
	
	public Semester(UUID CourseID, Date StartDate, Date EndDate) {
		this.CourseID = CourseID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}

	public void setCouseID(UUID CourseD) {
		CourseID = CourseID;
	}
	
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date StartDate) {
		StartDate = StartDate;
	}
	
	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date EndDate) {
		EndDate = EndDate;
	}
}
