/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swich;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Swich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // condicional swich 
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entre 1 y 5"));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
                break;
            default:JOptionPane.showMessageDialog(null,"El numero no esta en el rango de 1 y 5");
                break;
        }
    }
    
}
