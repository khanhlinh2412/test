/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_1;

import Phan_2.NoTaxProduct;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main_bai4 {

    public static void main(String[] args) {
        ArrayList<Product> lsnt = new ArrayList<>();

        System.out.println("Nhap 3 san pham:");
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                Product pr = new Product();
                pr.nhaptt();
                pr.insert();
                pr.update();
                pr.delete();
                pr.select();
                lsnt.add(pr);
           
            } else {
                NoTaxProduct nt = new NoTaxProduct();
                nt.nhaptt();
                nt.insert();
                nt.update();
                nt.delete();
                nt.select();
                lsnt.add(nt);
            }
        }
        System.out.println("");
        System.out.println("Xuat danh sach:");
        for (Product product : lsnt) {
            product.xuattt();
        }
    }
}
