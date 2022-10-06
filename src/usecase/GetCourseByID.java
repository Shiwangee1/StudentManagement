package usecase;

import java.util.Scanner;

import Dao.CourseDao;
import Dao.CourseDaoImpl;
import module.Course;

public class GetCourseByID {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id of course");
	    int Id=sc.nextInt();
	   
	    CourseDao c=new CourseDaoImpl();
	    
	    Course course=c.getCourseByID(Id);
	    
	    
	    if(course==null) {
	    	System.out.println("no course with this id");
	    }
	    else {
	    	System.out.println(course);
	    }
	    
		
		

	}

}
