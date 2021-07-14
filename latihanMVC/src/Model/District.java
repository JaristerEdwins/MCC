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
public class District {
    private int district_id, province_id;
    private String kota_kab, district_name;

    public District(int district_id, String kota_kab, String district_name, int province_id) {
        this.district_id = district_id;
        this.province_id = province_id;
        this.kota_kab = kota_kab;
        this.district_name = district_name;
    }
    
    public District(){
    }

    public int getDistrictId() {
        return district_id;
    }

    public void setDistrictId(int district_id) {
        this.district_id = district_id;
    }

    public int getProvinceId() {
        return province_id;
    }

    public void setProvinceId(int province_id) {
        this.province_id = province_id;
    }

    public String getKotaKab() {
        return kota_kab;
    }

    public void setKotaKab(String kota_kab) {
        this.kota_kab = kota_kab;
    }

    public String getDistrictName() {
        return district_name;
    }

    public void setDistrictName(String district_name) {
        this.district_name = district_name;
    }
    
    
}
