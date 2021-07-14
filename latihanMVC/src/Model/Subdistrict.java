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
public class Subdistrict {
    private int subdistric_id, district_id;
    private String subdistrict_name;

    public Subdistrict(int subdistric_id, String subdistrict_name, int district_id) {
        this.subdistric_id = subdistric_id;
        this.district_id = district_id;
        this.subdistrict_name = subdistrict_name;
    }
    public Subdistrict(){
    }

    public int getSubdistricId() {
        return subdistric_id;
    }

    public void setSubdistricId(int subdistric_id) {
        this.subdistric_id = subdistric_id;
    }

    public int getDistrictId() {
        return district_id;
    }

    public void setDistrictId(int district_id) {
        this.district_id = district_id;
    }

    public String getSubdistrictName() {
        return subdistrict_name;
    }

    public void setSubdistrictName(String subdistrict_name) {
        this.subdistrict_name = subdistrict_name;
    }
    
    
}
