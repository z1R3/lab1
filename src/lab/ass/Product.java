/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ass;
import java.util.ArrayList;
/**
 *
 * @author Mr Duc
 */
public class Product {
   private int id;
   private String Name;
   private int year;
   private int listPrice;

    public Product() {
    }

    public Product(int id, String Name, int year, int listPrice) {
        this.id = id;
        this.Name = Name;
        this.year = year;
        this.listPrice = listPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return year;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", Name=" + Name + ", year=" + year + ", listPrice=" + listPrice + '}';
    }
   public void nhapso(){
       
   }
  

   
}
