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
import model.District;

public class DaoDistrict {
    Connection connection = Koneksi.getConnection();
    
    public boolean insert(District district) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(
                    "INSERT INTO district (district_id , kota/kab, "
                    + "district_name, province_id) VALUES (?, ?, ?, ?);");
            statement.setInt(1, district.getDistrictId()); //set
            statement.setString(2, district.getKotaKab()); //set
            statement.setString(3, district.getKotaKab()); //set
            statement.setInt(4, district.getProvinceId()); //set
            statement.executeUpdate(); //execute
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public List<District> getAll() {
        List<District> listDistrict = new ArrayList<District>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SUBDISTRICT");
            while (rs.next()) {
                listDistrict.add(new District(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listDistrict;
    }
}
