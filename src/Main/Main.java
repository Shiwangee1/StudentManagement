package Main;

import java.util.Scanner;

import usecase.AllocateStudentIntoCourse;
import usecase.DeleteCourse;
import usecase.DeleteStudent;
import usecase.GetAllCourse;
import usecase.GetAllStudent;
import usecase.GetCourseByID;
import usecase.GetStudentById;
import usecase.RegisterCourse;
import usecase.RegisterStudent;
import usecase.StudentsByCourse;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to student management system");
		System.out.println();
		
		while(true) {
			
			System.out.println("1. Register student");
			System.out.println("2. Register Course");
			System.out.println("3. Delete Student");
			System.out.println("4. Delete Course");
			System.out.println("5. Allote course to student");
			System.out.println("6. Student in Course");
			System.out.println("7. Get all course");
			System.out.println("8. get all student");
			System.out.println("9. get course by id");
			System.out.println("10 get student by id");
			System.out.println("11 exit");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				RegisterStudent.main(null);
				break;
			case 2:
				RegisterCourse.main(null);
				break;
			case 3:
				DeleteStudent.main(null);
				break;
			case 4:
				DeleteCourse.main(null);
				break;
			case 5:
				AllocateStudentIntoCourse.main(null);
				break;
			case 6:
				StudentsByCourse.main(null);
				break;
			case 7:
				GetAllCourse.main(null);
				break;
			case 8:
				GetAllStudent.main(null);
				break;
			case 9:
				GetCourseByID.main(null);
				break;
			case 10:
				GetStudentById.main(null);
				break;
			case 11:
				System.out.println("Thank you");
				System.exit(0);
				break;
				default :
					System.out.println("Wrong input");
			}
			
			
		}
		
		

	}

}
