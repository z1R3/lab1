/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ass;

import java.util.Scanner;

/**
 *
 * @author Mr Duc
 */
public class main {
    public static void main(String[] args) {
        // tao ra mot thuc the moiw
        ArraylistP danhSachSinhVien = new ArraylistP();
        System.out.println("1. Add a product. \n" +
                           "2. Search product by product name, return a list of all products that same name. \n" +
                           "3. Update product. \n" +
                           "4. Delete product. \n" +
                           "5. Save products to file. \n" +
                           "6. Print list produc");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch (c){
           case 1:
               /**
                * nhap array list
                * test lan 1
                */
               for (int i = 0; i < 2; i++) {
                    System.out.print("nhap : ");
                    System.out.print("ID: ");
                    int ID = sc.nextInt();
                    System.out.print("Tên: ");
                    //de khong bi nha dau cach
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("ngay: ");
                    int yead = sc.nextInt();
                    System.out.print("gia: ");
                    int listPrice = sc.nextInt();
                    Product sv = new Product(ID, name, yead,listPrice);
                    //them thuc the vao
                    danhSachSinhVien.addSinhVien(sv);
                    
               }
               danhSachSinhVien.hienThiDanhSach();
           
            break;
           case 2:
            break;
           case 3:
            break;
           case 4:
            break;
           case 5:
            break;
           case 6:
            break;
           default:
               break;
        }
            
                
                
    }
    
}
