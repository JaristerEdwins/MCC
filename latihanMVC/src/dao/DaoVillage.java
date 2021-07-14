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
import model.Village;

public class DaoVillage {
    Connection connection = Koneksi.getConnection();
    
    public boolean insert(Village village) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement("INSERT INTO village (village_id, village_name, "
                    + "zip_code, subdistrict_id) VALUES (?, ?, ?, ?);");
            statement.setInt(1, village.getVillageId()); //set
            statement.setString(2, village.getVillageName()); //set
            statement.setString(3, village.getZipCode()); //set
            statement.setInt(4, village.getSubdistrictId()); //set
            statement.executeUpdate(); //execute
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean update(Village village) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement("UPDATE village SET village_name=?, zip_code=?, "
                    + "subdistrict_id=? WHERE village_id=?;");
            statement.setString(1, village.getVillageName()); //set
            statement.setString(2, village.getZipCode()); //set
            statement.setInt(3, village.getSubdistrictId()); //set
            statement.setInt(4, village.getVillageId()); //set
            statement.executeUpdate(); //execute
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(Village village) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement("DELETE FROM village WHERE village_id=?;");
            statement.setInt(1, village.getVillageId()); //set
            statement.executeUpdate(); //execute
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public List<Village> getAll() {
        List<Village> listVillage = new ArrayList<Village>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VILLAGE");
            while (rs.next()) {
//                village village = new village(rs.getInt(1),rs.getString(2));
//                village.setvillageId(rs.getInt(1));
//                village.setvillageName(rs.getString(2));
//                listvillage.add(village);
                listVillage.add(new Village(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listVillage;
    }
}
