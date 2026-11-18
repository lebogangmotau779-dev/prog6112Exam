/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.List;
public class Product {
    double average;
    String product;
    
    
    
    public interface IProduct{
    int GetTotalproductSold();
    double GetAverageProductSold();
    String GetMostPopularProduct();
    
    List<String> product = Listof("Monarch", "Restonic Barbados","Sealky Phuket");
    
    }
}
