/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ass;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Mr Duc
 */
class ArraylistP extends Product{
/**
 * dang tao danh sanh cac thuc the
 */
    private ArrayList<Product> sinhVienList;
    public ArraylistP() {
        this.sinhVienList = new ArrayList<>();
    }
    //them thuc the vao danh sach
    public void addSinhVien(Product PL) {
        sinhVienList.add(PL);
    }
    //hien thi danh sach
    public void hienThiDanhSach() {
        System.out.println("\nDanh sách sinh viên:");
        for (Product PL : sinhVienList) {
            System.out.println(PL);
        }
    }
}
