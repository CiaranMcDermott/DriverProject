package DriverProject;
import CI_Pipeline.Module;
import CI_Pipeline.Student;

import org.joda.time.LocalDate;

import CI_Pipeline.Course;


public class Test {

	public static void main(String args[]) {
		
		System.out.println("\n****Jitpack Test****");
		
		//Create some modules
		Module module0 = new Module("System on Chip", "EE451");
		Module module1 = new Module("Signals and Communication Systems", "EE123");
		Module module2 = new Module("Embedded Systems", "EE456");
		
		//Create some students to add to the module
		Student student0 = new Student("Ciaran", 22, "15-02-1999", "18379421", "Electronic Engineering");
        Student student1 = new Student("Aoife", 22, "09-01-1999", "17534682", "Electronic Engineering");
        Student student2 = new Student("Sisi", 22, "04-02-1999", "16534742", "Electronic Engineering");
        Student student3 = new Student("Roshan", 21, "12-05-2000", "17348256", "Electronic Engineering");
        
        //Add students to module0
        module0.addStudent(student0);
        module0.addStudent(student1);
        module0.addStudent(student2);
        module0.addStudent(student3);
        
        //Add students to module1
        module1.addStudent(student0);
        module1.addStudent(student1);
        module1.addStudent(student2);
        module1.addStudent(student3);
        
        //Add students to module0
        module2.addStudent(student0);
        module2.addStudent(student1);
        module2.addStudent(student2);
        module2.addStudent(student3);
        
        LocalDate startDate = LocalDate.parse("2021-09-08");
  	    LocalDate endDate = LocalDate.parse("2022-05-06");
		
		//create Course object
		Course course = new Course("Electronic Engineering", startDate, endDate);
		
		//Add modules to course
		course.addModule(module0);
		course.addModule(module1);
		course.addModule(module2);
		
		//Print out list of all courses
		System.out.println(course.getCourseName());
		
		//Print out all modules associated with the course
		System.out.println("Modules in " + course.getCourseName() + ": ");
		for(Module module: course.getModules()) {
			System.out.println(module.getModuleName()+ ", ");
			for(Student student: module.getStudents()) {
				System.out.print("\n\tUsername: " + student.getUsername());
				System.out.print("\tModules: ");
				for(Module mod: student.getModule()) {
					System.out.print(mod.getModuleName() + ", ");
				}
				for(Course co: student.getCourse()) {
					System.out.println("\n\tCourse: " + co.getCourseName());
				}
			}
			System.out.println("\n\n");
		}
	}
	
	
		
	
}