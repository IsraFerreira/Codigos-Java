/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author israe
 */
public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo){
    this.titulo = titulo;
    this.avaliacao = 1;
    this.views = 0;
    this.curtidas = 0;
    this.reproduzindo = false;
    
    }
    
    public String getTitulo(){
    return this.titulo;
    }
    public void setTitulo(String t){
    this.titulo = t;
    }
    
    public int getAvaliacao(){
    return this.avaliacao;
    }
    public void setAvaliacao(int a){
    this.avaliacao = a;
    }
    
    public int getViews(){
    return this.views;
    }
    public void setViews(int v){
    this.views = v;
    }
    
    public int getCurtidas(){
    return this.curtidas;
    }
    public void setCurtidas(int c){
    this.curtidas = c;
    }
    
    public boolean getReproduzindo(){
    return this.reproduzindo;
    }
    public void setReproduzindo(boolean r){
    this.reproduzindo = r;
    }

    @Override
    public void play() {
        if (this.reproduzindo == false){
        this.reproduzindo = true;
        }
        else {
            System.out.println("Já está reproduzindo");
        }
    }

    @Override
    public void pause() {
        if (this.reproduzindo == true){
        this.reproduzindo = false;
        }
        else {
            System.out.println("Já está pausado");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
    
}
