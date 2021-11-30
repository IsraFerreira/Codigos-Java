/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao;

/**
 *
 * @author israe
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    static void soma (int a, int b){   //Método (void) não retorna resultado
    int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    static int soma2 (int a, int b){   //Procedimento com tipo primitivo - retorna resultado
    int s = a + b;
    return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Começou o programa");
        //int sm = soma2(5,2);
        //System.out.println("A soma vale: "+ sm);
        
        Fatorial f = new Fatorial();
        f.setValor(10);
        System.out.println(f.getFormula()+ " " +f.getFatorial());
        
        
    }
    
}
