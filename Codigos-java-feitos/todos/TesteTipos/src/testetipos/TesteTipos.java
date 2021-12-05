/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author israe
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Integração entre diferentes tipos
        int idade = 30;
        String valor = Integer.toString(idade);  //É um número inteiro (Integer) para String (.toString)
        System.out.println(valor);
        
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
    }
    
}
