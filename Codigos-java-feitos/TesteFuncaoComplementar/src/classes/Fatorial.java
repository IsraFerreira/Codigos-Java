/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author israe
 */
public class Fatorial {
   
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n){   //não retorna valor
    num = n;
    int f = 1;
    String s = "";
        for (int c = n; c> 1; c--){
            f *= c;
            s += c + " x ";
     
    }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    
    public int getFatorial(){   //retorna valor
    return fat;
    }
    
    public String getFormula(){   //retorna valor
    return formula;
    }
    
}
