// Created by 21343040_alixa arivya tofer
package com.mycompany.uts;
import javax.swing.JOptionPane;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class soal3 {
    public static void main(String args[]){
        int bilangan;
        String a;
        
        a = JOptionPane.showInputDialog("Masukkan Angka : ");
        bilangan = Integer.parseInt(a);
        
        if(bilangan > 0){
            JOptionPane.showMessageDialog(null, "Angka " +bilangan+ " Bernilai Positif");
        }
        else if(bilangan < 0){
            JOptionPane.showMessageDialog(null, "Angka " +bilangan+ " Bernilai Negatif");
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka " +bilangan+ " Tidak Bernilai Positif / Negatif");
        }
    }    
}
