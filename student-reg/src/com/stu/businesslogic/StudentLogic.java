package com.stu.businesslogic;

import com.stu.bean.StudentBean;
import com.stu.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
            
            while(rs.next()){
             sb =  new StudentBean();
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
        }finally{
            if(con != null){
             con.close();
            }
        }
        return sb;
    }

}
