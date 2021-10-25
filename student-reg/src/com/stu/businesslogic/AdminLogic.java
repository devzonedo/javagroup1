package com.stu.businesslogic;

import com.stu.bean.StudentBean;
import com.stu.bean.UserBean;
import com.stu.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLogic {

    public boolean setNewUser(UserBean bn) {
        boolean flag = true;
        Connection con = null;
        int lastID = 0;

        try {
            con = new DBConnection().getConnection();
            String sql = " INSERT INTO tbl_user\n"
                    + "            (nic,\n"
                    + "             pword,\n"
                    + "             user_role,\n"
                    + "             student_id)\n"
                    + "VALUES (?,\n"
                    + "        PASSWORD(?),\n"
                    + "        ?,\n"
                    + "        ?) ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, bn.getNic());
            ps.setString(2, bn.getNic());
            ps.setString(3, bn.getUser_role());
            ps.setInt(4, bn.getStudent_id());
            System.out.println("ps:" + ps);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }

        return flag;
    }
    
    
    
    
    public UserBean getLogin(UserBean ub) throws SQLException {
        Connection con = null;
        UserBean u = null;
        
        try {
            con = new DBConnection().getConnection();
            String sql = "SELECT * FROM tbl_user WHERE nic = ? AND pword = PASSWORD(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ub.getNic());
            ps.setString(2, ub.getPword());
            
            System.out.println("ps:"+ps);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                u = new UserBean();
                u.setId(rs.getInt("id"));
                u.setStudent_id(rs.getInt("student_id"));
                u.setNic(rs.getString("nic"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return u;
    }

}
