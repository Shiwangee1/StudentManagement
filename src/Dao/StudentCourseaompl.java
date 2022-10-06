package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utility.DButil;

public class StudentCourseaompl implements StudentCourseDao {

	@Override
	public String registerStudentIntoCourse(int cid, int sid) {
		String message="Not Allocate course to student";
		try(Connection con=DButil.getConnection()){
			PreparedStatement ps =con.prepareStatement("insert into student_c values(?,?)");
			ps.setInt(1, cid);
			ps.setInt(2, sid);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="student allocate to course";
			}
		}catch(Exception e) {
			
		}
		
		return message;
	}

}
