/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Village {
    private int village_id; 
    private String village_name, zip_code;
    private int subdistrict_id;

    public Village(int village_id, String village_name, String zip_code, int subdistrict_id){
        this.village_id = village_id;
        this.village_name = village_name;
        this.zip_code = zip_code;
        this.subdistrict_id = subdistrict_id;
    }

    public Village() {
    }

    public int getVillageId() {
        return village_id;
    }

    public void setVillageId(int village_id) {
        this.village_id = village_id;
    }

    public String getVillageName() {
        return village_name;
    }

    public void setVillageName(String village_name) {
        this.village_name = village_name;
    }

    public String getZipCode() {
        return zip_code;
    }

    public void setZipCode(String zip_code) {
        this.zip_code = zip_code;
    }

    public int getSubdistrictId() {
        return subdistrict_id;
    }

    public void setSubdistrictId(int subdistrict_id) {
        this.subdistrict_id = subdistrict_id;
    }

    @Override
    public String toString() {
        return "Village{" + "village_id=" + village_id + ", village_name=" + village_name + ", zip_code=" + zip_code + ", subdistrict_id=" + subdistrict_id + '}';
    }

    
}
