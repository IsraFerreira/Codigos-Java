/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author israe
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0, par = 0, impar = 0, acima100 = 0, media, contadorn= 0;
        
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
        s = s + n;
        
        if(n % 2 == 0){
          par = par+1;  
        }
        else{
          impar = impar + 1;  
        }
        
        if(n > 100){
          acima100 = acima100 + 1;  
        }
        
       
        contadorn ++;
        }while (n != 0);
        media = s / (contadorn - 1);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + 
                "<br>Total de valores: " + s +
                "<br>Total de Pares: " + (par - 1) +
                "<br>Total de Impares: " + impar + 
                "<br>Acima de 100: " + acima100 + 
                "<br>Média dos valores: " + media + 
                "</html>", "Resultado Final", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);
    }
    
}
