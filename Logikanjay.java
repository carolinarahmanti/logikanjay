/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logikanjay;

import java.util.Scanner;
/**
 *
 * @author newid
 */
public class Logikanjay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int bilangan1;
        int bilangan2;
        
        System.out.print("");
        bilangan1 = input.nextInt();
        
        System.out.print("");
        bilangan2 = input.nextInt();
        
        if(bilangan1 < bilangan2){
            System.out.println(bilangan2);
        }else{
            System.out.println(bilangan1);
        }
    }
    
}
