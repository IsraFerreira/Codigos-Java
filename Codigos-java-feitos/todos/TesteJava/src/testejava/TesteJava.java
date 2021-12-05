/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testejava;

/**
 *
 * @author israe
 */
public class TesteJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Como declarar variáveis (maneiras básicas)
        
        
        //Maneira mais simples - variável
        int idade1 = 3;
        float sal1 = 1825.54f;
        char letra1 = 'G';
        boolean casado1 = false;
        
        //Em Typecast (para especificar) - variável
        int idade2 = (int) 3;  //(int) - considere esse 3 como inteiro
        float sal2 = (float) 1825.54;
        char letra2 = (char) 'G';
        boolean casado2 = (boolean) false;
       
        //Usando Wrapper classes (envólocro) - objeto
        Integer idade3 = new Integer(3);  //Integer = classe    idade = objeto   new = declara Idade como objeto   Integer(3)-inteiro e colocado no objeto idade 
        Float sal3 = new Float(1825.54);
        Character letra3 = new Character('G');
        Boolean casado3 = new Boolean(false);
        
        System.out.println(idade);
        
        
        
        
        
    }
}
