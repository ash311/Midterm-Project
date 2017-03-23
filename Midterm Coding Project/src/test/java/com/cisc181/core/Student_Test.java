package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.core.*;



public class Student_Test extends Section {

	ArrayList<Course> course = new ArrayList<Course>();
	ArrayList<Semester> semester = new ArrayList<Semester>();
	ArrayList<Section> section = new ArrayList<Section>();
	ArrayList<Student> student = new ArrayList<Student>();
	ArrayList<Enrollment> Enrollment = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() {
			
		private UUID courseid1 = UUID.randomUUID();
		private UUID courseid2 = UUID.randomUUID();
		private UUID courseid3 = UUID.randomUUID();
		
		
		Course course1 = new Course(courseid1, "How To Be Respectful", 2);
		Course course2 = new Course(courseid2, "Taking Out The Trash", 2);
		Course course3 = new Course(courseid3, "Weight Room Etiquette", 2);
		ArrayList<Course> course = new ArrayList<Course>(); {
			course.add(course1);
			course.add(course2);
			course.add(course3);
		}

		private UUID semesterid1 = UUID.randomUUID();
		private UUID semesterid2 = UUID.randomUUID();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String FallStart = "2014-08-29 00:00:00.0";
		String FallEnd = "2014-12-15 00:00:00.0";
		String SpringStart = "2015-02-02 00:00:00.0";
		String SpringEnd = "2015-02-02 00:00:00.0";
		
		Semester fsemester = new Semester(semesterid1, FallStart, FallEnd);
		Semester ssemester = new Semester(semesterid2, SpringStart, SpringEnd);
		ArrayList<Semester> semester = new ArrayList<Semester>(); {
			semester.add(fsemester);
			semester.add(ssemester);
		}
		
		private UUID sectionid1 = UUID.randomUUID();
		private UUID sectionid2 = UUID.randomUUID();
		
		Section sc1 = new Section(courseid1, semesterid1, sectionid1, 1);
		Section sc2 = new Section(courseid1, semesterid1, sectionid2, 2);
		Section sc3 = new Section(courseid2, semesterid1, sectionid1, 1);
		Section sc4 = new Section(courseid2, semesterid2, sectionid2, 2);
		Section sc5 = new Section(courseid3, semesterid2, sectionid1, 1);
		Section sc6 = new Section(courseid3, semesterid2, sectionid2, 2);
		ArrayList<Section> section = new ArrayList<Section>(); {
			section.add(sc1);
			section.add(sc2);
			section.add(sc3);
			section.add(sc4);
			section.add(sc5);
			section.add(sc6);
		}
		
		Student s1 = new Student("Barb", "Ecue", "Lays", new Date(1995,1,1), eMajor.PHYSICS, "15 Bag Lane", 
				"(567)-890-1234", "belays@udel.edu");
		Student s2 = new Student("Chile", "Limon", "Lays", new Date(1996,2,2), eMajor.NURSING, "16 Bag Drive",
				"(678)-901-2345", "cllays@udel.edu");
		Student s3 = new Student("Pico", "Gallo", "Lays", new Date(1995,3,3), eMajor.CHEM, "17 Bag Ave",
				"(789)-012-3456", "pglays@udel.edu");
		Student s4 = new Student("Salt", "Vinegar", "Lays", new Date(1996,4,4), eMajor.COMPSI, "18 Bag Alley",
				"(890)-123-4567", "svlays@udel.edu");
		Student s5 = new Student("Biscuits", "Gravy", "Lays", new Date(1995,5,5), eMajor.BUSINESS, "19 Bag Way",
				"(901)-234-5678", "bglays@udel.edu");
		Student s6 = new Student("Lightly", "Salted", "Lays", new Date(1996,6,6), eMajor.CHEM, "20 Bag Road",
				"(012)-345-6789", "lslays@udel.edu");
		Student s7 = new Student("Dark", "Chocolate", "Lays", new Date(1995,7,7), eMajor.NURSING, "21 Bag Street",
				"(123)-456-7890", "dclays@udel.edu");
		Student s8 = new Student("Honey", "BBQ", "Lays", new Date(1996,8,8), eMajor.CHEM, "22 Chip Lane",
				"(234)-567-8901", "hblays@udel.edu");
		Student s9 = new Student("Wavy", "Ranch", "Lays", new Date(1995,9,9), eMajor.BUSINESS, "23 Chip Drive",
				"(345)-678-9012", "wrlays@udel.edu");
		Student s10 = new Student("Flamin'", "Hot", "Lays", new Date(1996,10,10), eMajor.COMPSI, "24 Chip Ave",
				"(456)-789-0123", "fhlays@udel.edu");
		ArrayList<Student> student = new ArrayList<Student>(); {			
			student.add(s1);
			student.add(s2);
			student.add(s3);
			student.add(s4);
			student.add(s5);
			student.add(s6);
			student.add(s7);
			student.add(s8);
			student.add(s9);
			student.add(s10);
		}
			
		}

	
	@Test
	public void testGPA() {
		
		Enrollment e01 = new Enrollment(student.get(0).getStudentID(), section.get(0).getSectionID());
		e01.SetGrade(70);
		Enrollment.add(e01);
		
		Enrollment e02 = new Enrollment(student.get(1).getStudentID(), section.get(0).getSectionID());
		e02.SetGrade(71);
		Enrollment.add(e02);
		
		Enrollment e03 = new Enrollment(student.get(2).getStudentID(), section.get(0).getSectionID());
		e03.SetGrade(72);
		Enrollment.add(e03);
		
		Enrollment e04 = new Enrollment(student.get(3).getStudentID(), section.get(0).getSectionID());
		e04.SetGrade(73);
		Enrollment.add(e04);
		
		Enrollment e05 = new Enrollment(student.get(4).getStudentID(), section.get(0).getSectionID());
		e05.SetGrade(74);
		Enrollment.add(e05);
		
		Enrollment e06 = new Enrollment(student.get(5).getStudentID(), section.get(0).getSectionID());
		e06.SetGrade(75);
		Enrollment.add(e06);
		
		Enrollment e07 = new Enrollment(student.get(6).getStudentID(), section.get(0).getSectionID());
		e07.SetGrade(76);
		Enrollment.add(e07);
		
		Enrollment e08 = new Enrollment(student.get(7).getStudentID(), section.get(0).getSectionID());
		e08.SetGrade(77);
		Enrollment.add(e08);
		
		Enrollment e09 = new Enrollment(student.get(8).getStudentID(), section.get(0).getSectionID());
		e09.SetGrade(78);
		Enrollment.add(e09);
		
		Enrollment e010 = new Enrollment(student.get(9).getStudentID(), section.get(0).getSectionID());
		e010.SetGrade(79);
		Enrollment.add(e010);
		
		
		Enrollment e11 = new Enrollment(student.get(0).getStudentID(), section.get(1).getSectionID());
		e11.SetGrade(70);
		Enrollment.add(e11);
		
		Enrollment e12 = new Enrollment(student.get(1).getStudentID(), section.get(1).getSectionID());
		e12.SetGrade(71);
		Enrollment.add(e12);
		
		Enrollment e13 = new Enrollment(student.get(2).getStudentID(), section.get(1).getSectionID());
		e13.SetGrade(72);
		Enrollment.add(e13);
		
		Enrollment e14 = new Enrollment(student.get(3).getStudentID(), section.get(1).getSectionID());
		e14.SetGrade(73);
		Enrollment.add(e14);
		
		Enrollment e15 = new Enrollment(student.get(4).getStudentID(), section.get(1).getSectionID());
		e15.SetGrade(74);
		Enrollment.add(e15);
		
		Enrollment e16 = new Enrollment(student.get(5).getStudentID(), section.get(1).getSectionID());
		e16.SetGrade(75);
		Enrollment.add(e16);
		
		Enrollment e17 = new Enrollment(student.get(6).getStudentID(), section.get(1).getSectionID());
		e17.SetGrade(76);
		Enrollment.add(e17);
		
		Enrollment e18 = new Enrollment(student.get(7).getStudentID(), section.get(1).getSectionID());
		e18.SetGrade(77);
		Enrollment.add(e18);
		
		Enrollment e19 = new Enrollment(student.get(8).getStudentID(), section.get(1).getSectionID());
		e19.SetGrade(78);
		Enrollment.add(e19);
		
		Enrollment e110 = new Enrollment(student.get(9).getStudentID(), section.get(1).getSectionID());
		e110.SetGrade(79);
		Enrollment.add(e110);
		
		
		Enrollment e21 = new Enrollment(student.get(0).getStudentID(), section.get(2).getSectionID());
		e21.SetGrade(70);
		Enrollment.add(e21);
		
		Enrollment e22 = new Enrollment(student.get(1).getStudentID(), section.get(2).getSectionID());
		e22.SetGrade(71);
		Enrollment.add(e22);
		
		Enrollment e23 = new Enrollment(student.get(2).getStudentID(), section.get(2).getSectionID());
		e23.SetGrade(72);
		Enrollment.add(e23);
		
		Enrollment e24 = new Enrollment(student.get(3).getStudentID(), section.get(2).getSectionID());
		e24.SetGrade(73);
		Enrollment.add(e24);
		
		Enrollment e25 = new Enrollment(student.get(4).getStudentID(), section.get(2).getSectionID());
		e25.SetGrade(74);
		Enrollment.add(e25);
		
		Enrollment e26 = new Enrollment(student.get(5).getStudentID(), section.get(2).getSectionID());
		e26.SetGrade(75);
		Enrollment.add(e26);
		
		Enrollment e27 = new Enrollment(student.get(6).getStudentID(), section.get(2).getSectionID());
		e27.SetGrade(76);
		Enrollment.add(e27);
		
		Enrollment e28 = new Enrollment(student.get(7).getStudentID(), section.get(2).getSectionID());
		e28.SetGrade(77);
		Enrollment.add(e28);
		
		Enrollment e29 = new Enrollment(student.get(8).getStudentID(), section.get(2).getSectionID());
		e29.SetGrade(78);
		Enrollment.add(e29);
		
		Enrollment e210 = new Enrollment(student.get(9).getStudentID(), section.get(2).getSectionID());
		e210.SetGrade(79);
		Enrollment.add(e210);
		
		
		Enrollment e31 = new Enrollment(student.get(0).getStudentID(), section.get(3).getSectionID());
		e31.SetGrade(70);
		Enrollment.add(e31);
		
		Enrollment e32 = new Enrollment(student.get(1).getStudentID(), section.get(3).getSectionID());
		e32.SetGrade(71);
		Enrollment.add(e32);
		
		Enrollment e33 = new Enrollment(student.get(2).getStudentID(), section.get(3).getSectionID());
		e33.SetGrade(72);
		Enrollment.add(e33);
		
		Enrollment e34 = new Enrollment(student.get(3).getStudentID(), section.get(3).getSectionID());
		e34.SetGrade(73);
		Enrollment.add(e34);
		
		Enrollment e35 = new Enrollment(student.get(4).getStudentID(), section.get(3).getSectionID());
		e35.SetGrade(74);
		Enrollment.add(e35);
		
		Enrollment e36 = new Enrollment(student.get(5).getStudentID(), section.get(3).getSectionID());
		e36.SetGrade(75);
		Enrollment.add(e36);
		
		Enrollment e37 = new Enrollment(student.get(6).getStudentID(), section.get(3).getSectionID());
		e37.SetGrade(76);
		Enrollment.add(e37);
		
		Enrollment e38 = new Enrollment(student.get(7).getStudentID(), section.get(3).getSectionID());
		e38.SetGrade(77);
		Enrollment.add(e38);
		
		Enrollment e39 = new Enrollment(student.get(8).getStudentID(), section.get(3).getSectionID());
		e39.SetGrade(78);
		Enrollment.add(e39);
		
		Enrollment e310 = new Enrollment(student.get(9).getStudentID(), section.get(3).getSectionID());
		e310.SetGrade(79);
		Enrollment.add(e310);
		
		
		Enrollment e41 = new Enrollment(student.get(0).getStudentID(), section.get(4).getSectionID());
		e41.SetGrade(70);
		Enrollment.add(e41);
		
		Enrollment e42 = new Enrollment(student.get(1).getStudentID(), section.get(4).getSectionID());
		e42.SetGrade(71);
		Enrollment.add(e42);
		
		Enrollment e43 = new Enrollment(student.get(2).getStudentID(), section.get(4).getSectionID());
		e43.SetGrade(72);
		Enrollment.add(e43);
		
		Enrollment e44 = new Enrollment(student.get(3).getStudentID(), section.get(4).getSectionID());
		e44.SetGrade(73);
		Enrollment.add(e44);
		
		Enrollment e45 = new Enrollment(student.get(4).getStudentID(), section.get(4).getSectionID());
		e45.SetGrade(74);
		Enrollment.add(e45);
		
		Enrollment e46 = new Enrollment(student.get(5).getStudentID(), section.get(4).getSectionID());
		e46.SetGrade(75);
		Enrollment.add(e46);
		
		Enrollment e47 = new Enrollment(student.get(6).getStudentID(), section.get(4).getSectionID());
		e47.SetGrade(76);
		Enrollment.add(e47);
		
		Enrollment e48 = new Enrollment(student.get(7).getStudentID(), section.get(4).getSectionID());
		e48.SetGrade(77);
		Enrollment.add(e48);
		
		Enrollment e49 = new Enrollment(student.get(8).getStudentID(), section.get(4).getSectionID());
		e49.SetGrade(78);
		Enrollment.add(e49);
		
		Enrollment e410 = new Enrollment(student.get(9).getStudentID(), section.get(4).getSectionID());
		e410.SetGrade(79);
		Enrollment.add(e410);
		
		
		Enrollment e51 = new Enrollment(student.get(0).getStudentID(), section.get(5).getSectionID());
		e51.SetGrade(70);
		Enrollment.add(e51);
		
		Enrollment e52 = new Enrollment(student.get(1).getStudentID(), section.get(5).getSectionID());
		e52.SetGrade(71);
		Enrollment.add(e52);
		
		Enrollment e53 = new Enrollment(student.get(2).getStudentID(), section.get(5).getSectionID());
		e53.SetGrade(72);
		Enrollment.add(e53);
		
		Enrollment e54 = new Enrollment(student.get(3).getStudentID(), section.get(5).getSectionID());
		e54.SetGrade(73);
		Enrollment.add(e54);
		
		Enrollment e55 = new Enrollment(student.get(4).getStudentID(), section.get(5).getSectionID());
		e55.SetGrade(74);
		Enrollment.add(e55);
		
		Enrollment e56 = new Enrollment(student.get(5).getStudentID(), section.get(5).getSectionID());
		e56.SetGrade(75);
		Enrollment.add(e56);
		
		Enrollment e57 = new Enrollment(student.get(6).getStudentID(), section.get(5).getSectionID());
		e57.SetGrade(76);
		Enrollment.add(e57);
		
		Enrollment e58 = new Enrollment(student.get(7).getStudentID(), section.get(5).getSectionID());
		e58.SetGrade(77);
		Enrollment.add(e58);
		
		Enrollment e59 = new Enrollment(student.get(8).getStudentID(), section.get(5).getSectionID());
		e59.SetGrade(78);
		Enrollment.add(e59);
		
		Enrollment e510 = new Enrollment(student.get(9).getStudentID(), section.get(5).getSectionID());
		e510.SetGrade(79);
		Enrollment.add(e510);
		
		double GPA = 0;
		int totalcreds = 6;
		
		for (int i = 0; i < student.size(); i++) {
			
			if (Enrollment.get(i).StudentID == student.get(i).getStudentID()) {
				GPA += Enrollment.get(i).Grade;
			}
			student.get(i).setGPA(GPA);
			assertEquals(student.get(i).getGPA(),(GPA*6)/(6*4));
			
		}
	}
	
	//all courses have avg grade of 74.5
	
	@Test
	public void testCourseAvgGrade1() {
		

		assertEquals(x, 74.5);
	}
	
	@Test
	public void testCourseAvgGrade2() {
		
		assertEquals(y, 74.5);
	}
	
	@Test
	public void testCourseAvgGrade3() {
		
		assertEquals(z, 74.5);
	}
	
	public void changeMajor(eMajor Major, Student student) {
		
		student.setMajor(Major);
	}
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}