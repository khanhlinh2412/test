/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_2;

import Phan_1.Product;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main_bai3 {

    public static void main(String[] args) {
        ArrayList<Product> lsnt = new ArrayList<>();

        System.out.println("Nhap 3 san pham:");
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                Product pr = new Product();
                pr.nhaptt();
                lsnt.add(pr);
            } else {
                NoTaxProduct nt = new NoTaxProduct();
                nt.nhaptt();
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
