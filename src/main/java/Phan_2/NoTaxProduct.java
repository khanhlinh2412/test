/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_2;

/**
 *
 * @author PC
 */
public class NoTaxProduct extends Phan_1.Product {

    public NoTaxProduct() {
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

    
    @Override
    public double getImportTax() {
        return 0;
    }

    @Override
    public void xuattt() {
        super.xuattt(); 
    }

    @Override
    public void nhaptt() {
        super.nhaptt();
    }
    
    

}
