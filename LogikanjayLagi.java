/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logikanjay.lagi;

import java.util.Scanner;
/**
 *
 * @author newid
 */
public class LogikanjayLagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int bilangan;
        System.out.print("");
        bilangan = input.nextInt();
        
        if(bilangan % 2 == 0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
    }
    
}
