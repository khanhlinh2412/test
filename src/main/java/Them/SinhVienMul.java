/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them;

/**
 *
 * @author PC
 */
public class SinhVienMul extends SinhVien {

    public double diemMUL, diemMoB;

    public SinhVienMul() {
    }

    public SinhVienMul(double diemMUL, double diemMoB, String ten) {
        super(ten);
        this.diemMUL = diemMUL;
        this.diemMoB = diemMoB;
    }

    @Override
    public double getDiemTB() {
        return (diemMUL * 2 + diemMoB) / 3;
    }

    public void xuattt() {
        System.out.println("Ten: " + ten);
        System.out.println("Diem MUl: " + diemMUL);
        System.out.println("Diem MOB: " + diemMoB);
        System.out.printf("Diem TB: %.2f ", getDiemTB());
    }

}
