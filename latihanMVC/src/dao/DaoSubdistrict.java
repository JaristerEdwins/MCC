/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author ASUS
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.Subdistrict;

public class DaoSubdistrict {
    Connection connection = Koneksi.getConnection();
    
    public boolean insert(Subdistrict subdistrict) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(
                    "INSERT INTO subdistrict (subdistrict_id , subdistrict_name, "
                    + "district_id) VALUES (?, ?, ?);");
            statement.setInt(1, subdistrict.getSubdistricId()); //set
            statement.setString(2, subdistrict.getSubdistrictName()); //set
            statement.setInt(3, subdistrict.getDistrictId()); //set
            statement.executeUpdate(); //execute
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public List<Subdistrict> getAll() {
        List<Subdistrict> listSubdistrict = new ArrayList<Subdistrict>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SUBDISTRICT");
            while (rs.next()) {
                listSubdistrict.add(new Subdistrict(rs.getInt(1), rs.getString(2), rs.getInt(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listSubdistrict;
    }
}
