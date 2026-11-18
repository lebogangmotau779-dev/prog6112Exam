/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Arrays;
import java.util.Scanner;
public class SalesReport {
    
    // Declaration of attributes
    String[] months = {"month 1", "month2", "month 3"};
    String[] mattress = {"Monarch", "Barbados", "Sealky Phuket"};
    int[][] sales ={
        {25,18,20},
        {15,10,12},
        {18, 15,20}
    };
    for(int i = 0; i<sales.length;i++){
                    for(int j = 0; j<sales[i].length; j++){
                        System.out.println("sales.length[i][j]");
      }
                    System.out.println("\n=== Product Sales Report====");
                    System.out.println("1.Enter the mattress");
                    System.out.println("2.Enter the month");
                    System.out.println("3.Enter the sale amount");
                    System.out.println("4.Exit");
                    
                         System.out.println("Choose AN OPTION");
        int choice = input.nextInt();
        
        if(choice == 1){
            mattress();
        }
        else if(choice == 2){
            month1.displayMonth();
            System.exit(0);
         }
        else if(choice == 3){
            int sales = mattress + month;
            System.out.println("Mattress: "+mattress);
            System.out.println("Months: "+months);
        }
        else if(choice == 4){
            System.exit(0);
}
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the name of a mattress");
    this.mattress = mattress;
    
    System.out.println("Enter the month");
    this.months= months;
        
    System.out.println("Enter total sales");
    this.sales = sales;
    }
}
