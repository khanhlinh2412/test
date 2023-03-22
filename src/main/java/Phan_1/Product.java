/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Product implements DAO {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getImportTax() {
        return 0.1 * price;
    }

    public void nhaptt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Name: ");
        this.name = sc.nextLine();

        System.out.print("  Price: ");
        this.price = Double.parseDouble(sc.nextLine());
    }

    public void xuattt() {
        System.out.println("- Name: " + name);
        System.out.println("  Price: " + price);
        System.out.println("  Tax: " + getImportTax());
        System.out.println("");
    }

    @Override
    public void insert() {
        System.out.println("insert sucess");
    }

    @Override
    public void update() {
        System.out.println("update sucess");
    }

    @Override
    public void delete() {
        System.out.println("delete sucess");
    }

    @Override
    public void select() {
        System.out.println("select sucess");
    }
}
