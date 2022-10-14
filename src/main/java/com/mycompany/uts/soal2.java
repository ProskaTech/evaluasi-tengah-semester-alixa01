// Created by 21343040_alixa arivya tofer
package com.mycompany.uts;
import java.util.Scanner;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class soal2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
         
        System.out.print("Masukan Jumlah baris :");
        int n = in.nextInt();
         
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <=n; k++)
            {
                System.out.print(" #");
            }
                System.out.println(" ");
        }
        
        for (int i = n; i >=1; i--){
            for (int j = 1; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <=n; k++)
            {
                System.out.print(" *");
            }
                System.out.println(" ");
        }
    }   
}
