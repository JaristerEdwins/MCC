/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.DaoProvince;
import dao.DaoSubdistrict;
import dao.DaoVillage;
import java.util.ArrayList;
import java.util.List;
import model.Province;
import model.Village;
import java.util.Scanner;
import model.Subdistrict;

/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        DaoProvince daoprovince = new DaoProvince();
        Province province = new Province();
        DaoVillage daovillage = new DaoVillage();
        Village village = new Village();        
        Scanner in = new Scanner(System.in);

        System.out.println("\n1. Province \n" + "2. Village \n" + "0. Exit \n"
			  + "Select the table that you want to change:");
        int n = in.nextInt();
        
        while(n != 0){
 //         options for province
            if (n==1){
                System.out.println("\n1. Insert \n" + "2. Update \n" + "3. Delete \n" + "4. Back \n" 
                + "0. Exit \n" + "Select the table that you want to change:");
                int m = in.nextInt();
                while(m!=0){
                    if(m==1){//insert option
                        System.out.println("\nProvince ID : ");
                        province.setProvinceId(in.nextInt());
                        System.out.println("Province name : ");
                        province.setProvinceName(in.next());
                        System.out.println(daoprovince.insert(province) ? "Successful\n" : "fail\n");
                    }
                    else if(m==2){//update option
                        System.out.println("\nProvince ID : ");
                        province.setProvinceId(in.nextInt());
                        System.out.println("Province name : ");
                        province.setProvinceName(in.next());
                        System.out.println(daoprovince.update(province) ? "Successful\n" : "fail\n");                
                    }
                    else if(m==3){//delete option
                        System.out.println("\nProvince ID : ");
                        province.setProvinceId(in.nextInt());
                        System.out.println(daoprovince.delete(province) ? "Successful\n" : "fail\n");                
                    }else if(m==0){
                        break;
                    }
            //      SELECT * FROM PROVINCE
                    for (Province p : daoprovince.getAll()) {
                        System.out.println(p);
                    }
                }
            
            } else if(n==2){    //provide options for village
                System.out.println("Village");
                System.out.println("\n1. Insert \n" + "2. Update \n" + "3. Delete \n" + "4. Back \n" 
                    + "0. Exit \n" + "Select the table that you want to change:");
                int m = in.nextInt();
                while(m!=0){
                    if(m==1){//insert option
                        System.out.println("\nVillage ID : ");
                        village.setVillageId(in.nextInt());
                        System.out.println("Village name : ");
                        village.setVillageName(in.next());
                        System.out.println("Zipcode : ");
                        village.setZipCode(in.next());
                        System.out.println("Subdistrict Id : ");
//                      int s_id = in.nextInt();
                        village.setSubdistrictId(in.nextInt());
                
//                      DaoSubdistrict daosubdistrict = new DaoSubdistrict();
//                      List<Subdistrict> subdistrict = daosubdistrict.getAll();
//                      for (int i=0; i<subdistrict.size(); i++){
//                          if (subdistrict.get(i).equals(s_id)){
//                              System.out.println("");
//                          }
//                      }
                        System.out.println(daovillage.insert(village) ? "Successful\n" : "fail\n");
                    }else if(m==2){//update option
                        System.out.println("\nVillage ID : ");
                        village.setVillageId(in.nextInt());
                        System.out.println("Village name : ");
                        village.setVillageName(in.next());
                        System.out.println("Zipcode : ");
                        village.setZipCode(in.next());
                        System.out.println("Subdistrict ID : ");
                        village.setSubdistrictId(in.nextInt());
                        System.out.println(daovillage.update(village) ? "Successful\n" : "fail\n");
                    }else if(m==3){//delete option
                        System.out.println("\nVillage ID : ");
                        village.setVillageId(in.nextInt());
                        System.out.println(daovillage.delete(village) ? "Successful\n" : "fail\n");
                    }else if(m==0){
                        break;
                    }
                //      SELECT * FROM VILLAGE
                    for (Village v : daovillage.getAll()) {
                        System.out.println(v);
                    }
                }
            }else {
		System.out.println("invalid input");
                System.out.println("\n1. Province \n" + "2. Village \n" + "0. Exit \n"
			  + "Select the table that you want to change:");
                n = in.nextInt();
            }
        }
        System.out.println("Thank you!");
	in.close();
    }
}
