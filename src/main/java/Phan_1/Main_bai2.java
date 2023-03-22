/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_1;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main_bai2 {

    public static void main(String[] args) {
        ArrayList<Product> lspr = new ArrayList<>();
        
        System.out.println("Nhap 5 san pham:");
        for (int i = 0; i < 2; i++) {
            Product pr = new Product();
            pr.nhaptt();
            lspr.add(pr);
        }
        
        System.out.println("");
        System.out.println("Xuat danh sach:");
        for (Product product : lspr) {
            product.xuattt();
        }
    }
}
