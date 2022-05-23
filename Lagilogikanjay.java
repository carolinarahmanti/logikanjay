/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lagilogikanjay;

import java.util.Scanner;
/**
 *
 * @author newid
 */
public class Lagilogikanjay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        
        System.out.println("");
        int angka = input.nextInt();
        
        for(int r =1; r<=angka; r++){
            jumlah += r;
            System.out.println("jumlah = " +jumlah);
        }
    }
    
}
