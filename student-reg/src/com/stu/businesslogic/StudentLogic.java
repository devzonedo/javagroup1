package com.stu.businesslogic;

import com.stu.bean.StudentBean;
import com.stu.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentLogic {

    public int registerNewStudent(StudentBean bn) {
        Connection con = null;
        int lastID = 0;

        try {
            con = new DBConnection().getConnection();
            String sql = "INSERT INTO tbl_student (fname,lname,gender,tp,address,city,nic) "
                    + " VALUES (?,?,?,?,?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bn.getFname());
            ps.setString(2, bn.getLname());
            ps.setString(3, bn.getGender());
            ps.setString(4, bn.getTp());
            ps.setString(5, bn.getAddress());
            ps.setString(6, bn.getCity());
            ps.setString(7, bn.getNic());
            System.out.println("ps:" + ps);
            System.out.println("Ready Execute");

            if (ps.executeUpdate() == 1) {
                ResultSet rs = ps.getGeneratedKeys();
                rs.next();
                lastID = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lastID;
    }

    public StudentBean getStudetDetail(int id) throws SQLException {
        Connection con = null;
        StudentBean sb = null;
        try {
            con = new DBConnection().getConnection();
            String sql = "SELECT * FROM tbl_student WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                sb = new StudentBean();
                sb.setId(rs.getInt("id"));
                sb.setFname(rs.getString("fname"));
                sb.setLname(rs.getString("lname"));
                sb.setGender(rs.getString("gender"));
                sb.setTp(rs.getString("tp"));
                sb.setAddress(rs.getString("address"));
                sb.setCity(rs.getString("city"));
                sb.setNic(rs.getString("nic"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return sb;
    }

    public boolean setStudentUpdate(StudentBean stubean) {
        boolean flag = true;
        Connection con = null;
        try {
            con = new DBConnection().getConnection();
            String sql = "UPDATE tbl_student SET fname = ? , lname = ? , gender = ? , tp = ? , address = ? , city = ? , nic = ? \n"
                    + " WHERE id = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, stubean.getFname());
            ps.setString(2, stubean.getLname());
            ps.setString(3, stubean.getGender());
            ps.setString(4, stubean.getTp());
            ps.setString(5, stubean.getAddress());
            ps.setString(6, stubean.getCity());
            ps.setString(7, stubean.getNic());
            ps.setInt(8, stubean.getId());
            System.out.println("ps:" + ps);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }

        return flag;
    }

    public boolean setStudentDelete(int id) {
        boolean flag = true;
        Connection con = null;
        try {
            con = new DBConnection().getConnection();
            String sql = "DELETE FROM tbl_student WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            System.out.println("ps:" + ps);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

   public ArrayList<StudentBean> getAllStudent() {
        ArrayList<StudentBean> arrayList = new ArrayList<StudentBean>();
        Connection con = null;
        try {
            con = new DBConnection().getConnection();
            String sql = "SELECT * FROM tbl_student INNER JOIN tbl_subject ON tbl_student.subject_id = tbl_subject.id ";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                StudentBean s = new StudentBean();
                s.setId(rs.getInt("id"));
                s.setFname(rs.getString("fname"));
                s.setLname(rs.getString("lname"));
                s.setGender(rs.getString("gender"));
                s.setTp(rs.getString("tp"));
                s.setAddress(rs.getString("address"));
                s.setCity(rs.getString("city"));
                s.setNic(rs.getString("nic"));
                s.setSubject_id(rs.getInt("subject_id"));
                
                arrayList.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return arrayList;

    }
    
   public ArrayList<StudentBean> getAllStudent(int noofstu){
   return null;
   }

}
