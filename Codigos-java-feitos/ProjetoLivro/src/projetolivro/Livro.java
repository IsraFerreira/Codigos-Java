/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author israe
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String t, String a, int tp, Pessoa l){
    this.titulo = t;
    this.autor = a;
    this.totPaginas = tp;
    this.aberto = false;
    this.pagAtual = 0;
    this.leitor = l;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }
    public void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean getAberto() {
        return this.aberto;
    }
    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }
    
    public String detalhes(){
        return "Livro" + ", Titulo= " + titulo + ", Autor= " + autor + "\nTotPaginas= " + totPaginas + ", PagAtual= " + pagAtual + ", Aberto= " + aberto + 
                "\nLeitor= " + leitor.getNome() + ", Idade= " + leitor.getIdade() + ", Sexo= " + leitor.getSexo();
    
    }

    @Override
    public void abrir() {
        this.aberto = true;
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fechar() {
        this.aberto = false;
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        }
        else {
        this.pagAtual = p;
        }
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
