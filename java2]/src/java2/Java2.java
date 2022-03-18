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
        int x = 0, result = 0, qtdNum = 0;
        Scanner num = new Scanner(System.in);
        
       
        while(x >=0) {
            System.out.print("Digite um número inteiro: ");
                    x = num.nextInt();
                    qtdNum += 1;
            if(x >=0){
            result+= x;
            }
            else {
            result = result/(qtdNum - 1);
            System.out.print(result);
            }
             
        } 
        
        
     
  
    }


}

