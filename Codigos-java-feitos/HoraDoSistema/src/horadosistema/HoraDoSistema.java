/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author israel
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        System.out.println(" ");
        
        Locale idioma = Locale.getDefault();
        String lang = idioma.getDisplayLanguage();
        String country = idioma.getDisplayCountry();
        System.out.print("Seu idioma é ");
        System.out.println(idioma.toString());
        System.out.println(" ");
        
        Toolkit tamanhoTela = Toolkit.getDefaultToolkit();
        Dimension d = tamanhoTela.getScreenSize();
        System.out.print("Sua resolução é " + d.width + " x " + d.height);
        System.out.println(" ");
        
    }
    
}
