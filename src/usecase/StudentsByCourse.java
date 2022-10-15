package usecase;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.StudentDao;
import Dao.StudentDaoImpl;
import module.Student;
public class StudentsByCourse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id of course");
		int id=sc.nextInt();
		
		StudentDao s=new StudentDaoImpl();
		
		List<Student>list=s.studentByCourse(id);
		
		for(Student stu:list) {
			System.out.println(stu);
		}

	}

}
