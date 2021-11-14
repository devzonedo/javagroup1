
package com.stu.businesslogic;

import com.stu.bean.StudentBean;
import com.stu.bean.SubjectBean;
import com.stu.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SubjectLogic {
   
   public ArrayList<SubjectBean> getAllSubject() {
        ArrayList<SubjectBean> arrayList = new ArrayList<SubjectBean>();
        Connection con = null;
        try {
            con = new DBConnection().getConnection();
            String sql = "SELECT * FROM tbl_subject ";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SubjectBean s = new SubjectBean();
                s.setId(rs.getInt("id"));
                s.setSubject_name(rs.getString("subject_name"));
                arrayList.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
    
    
}
