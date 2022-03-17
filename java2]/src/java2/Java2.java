/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner num = new Scanner(System.in);
        
        int num1;

        num1 = num.nextInt();
        do {
            System.out.print("Digite outro número: ");
            Scanner num2 = new Scanner(System.in);
            int num2i = num2.nextInt();
             
        } while(num1 >= 0 );
        
        
     
  
    }


}

