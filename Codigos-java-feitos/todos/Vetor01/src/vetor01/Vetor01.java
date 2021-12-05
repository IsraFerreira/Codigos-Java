/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author israe
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N é " + n.length);
        
        Arrays.sort(n); // deixa o vetor em ordem

        int pos = Arrays.binarySearch(n, 5);
        System.out.println(pos);
        
        
        for (int valor: n){
            System.out.println(valor);
        }
 
    }
    
}
