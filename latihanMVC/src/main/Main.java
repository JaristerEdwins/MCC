/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.DaoProvince;
import java.util.ArrayList;
import java.util.List;
import model.Province;

/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        DaoProvince daoprovince = new DaoProvince();
        Province province = new Province();
        province.setProvinceId(8);
        province.setProvinceName("Sumatera Utara");
//        if(daoprovince.insert(province)){
//            System.out.println("Data berhasil diinput");
//        }else{
//            System.out.println("Data gagal diinput");
//        }
        System.out.println(daoprovince.insert(province) ? "berhasil" : "gagal");

//        List<Province> provinces = daoprovince.getAll();
//        provinces = daoprovince.getAll();
        for (Province a : daoprovince.getAll()) {
            System.out.println(a.getProvinceId());
            System.out.println(a.getProvinceName());
        }
    }

}
