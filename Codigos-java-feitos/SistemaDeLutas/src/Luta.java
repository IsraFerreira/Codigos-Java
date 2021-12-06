
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author israe
 */
public class Luta {
     //Lutadores são instâncias da classe lutador
    private Lutador desafiado; //tipo abstrato de dados 
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    public Luta(){
    
    }
    
    public Lutador getDesafiado(){
    return this.desafiado;
    }
    public void setDesafiado (Lutador dd){
    this.desafiado = dd;
    }
    
    public Lutador getDesafiante(){
    return this.desafiante;
    }
    public void setDesafiante(Lutador de){
    this.desafiante = de;
    }
    
    public int getRounds(){
    return this.rounds;
    }
    public void setRounds(int r){
    this.rounds = r;
    }
    
    public boolean getAprovada(){
    return this.aprovada;
    }
    public void setAprovada(boolean ap){
    this.aprovada = ap;
    }
    
    
    
    
    
    public void marcarLuta(Lutador l1, Lutador l2){
     if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
         this.setAprovada(true);
         this.desafiado = l1;
         this.desafiante = l2;
     }   
     else {
         this.setAprovada(false);
         this.desafiado = null;
         this.desafiante = null;
     }
    
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            //double vencedor = Math.random();
            //int n = (int) (0 + vencedor *(2 - 0));
            
            Random aleatorio = new Random();
            int n = aleatorio.nextInt(3);   //vai gerar 0, 1 ou 2
            
            System.out.println("====== RESULTADO DA LUTA ======");
            
                switch (n){
                    case 0:
                        System.out.println("Empatou!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("Vitória do " + this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println("Vitória do " + this.desafiante.getNome());
                        this.desafiante.ganharLuta();
                        this.desafiado.perderLuta();
                        break;
                }
                System.out.println("===============================");
        }
        else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    
}
