package com.mck.daoIMP;



import com.mck.bean.Student;
import com.mck.connection.DataBaseConnection;
import com.mck.dao.StudentDAO;
import org.junit.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentDAOIMP implements StudentDAO {
	@Override
	public void update(Student s) {
		String sql="update users set id=?,name=?";
		PreparedStatement pstmt = null;
		DataBaseConnection conn = null;
		//针对数据库的具体操作
		try{
			conn = new DataBaseConnection();

			pstmt = conn.getConnection().prepareStatement(sql);
			pstmt.setInt(1,s.getId());
			//pstmt.setString(1,s.getID());
			pstmt.setString(2,s.getName());

			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}
		catch(Exception e){  }
	}

	@Override
	public void delete(int iD) {
		String sql="delete  from student where id=?";
		PreparedStatement pstmt = null;
		DataBaseConnection conn = null;
		try{
			conn = new DataBaseConnection();
			pstmt = conn.getConnection().prepareStatement(sql);
			pstmt.setInt(1,iD);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Student findByID(int iD) {
		String sql = "select * from student where id=?";
		PreparedStatement pstmt = null;
		DataBaseConnection conn = null;
		Student student = new Student();
		//针对数据库的具体操作
		try{
			conn = new DataBaseConnection();
			pstmt = conn.getConnection().prepareStatement(sql);
			pstmt.setInt(1,iD);
			//pstmt.setString(1,s.getID());
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()){
				student.setId(resultSet.getInt("iD"));
				student.setName(resultSet.getString("name"));
			}
			pstmt.execute();
			pstmt.close();
			conn.close();
		}
		catch(Exception e){  }
		return student;
	}

	@Override
	public List<Student> findAll() {
		return null;
	}

	// 添加操作
	@Test
	    public void insert(Student s){
		String sql = "INSERT INTO student (id, name) values (?,?)";
	    PreparedStatement pstmt = null;
	    DataBaseConnection conn = null;
	    //针对数据库的具体操作
	    try{
	        conn = new DataBaseConnection();
	        
	        pstmt = conn.getConnection().prepareStatement(sql);
	        pstmt.setInt(1,s.getId());
	        //pstmt.setString(1,s.getID());
	        pstmt.setString(2,s.getName());
	  
	        pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	        }
	     catch(Exception e){  }
	      }
}
