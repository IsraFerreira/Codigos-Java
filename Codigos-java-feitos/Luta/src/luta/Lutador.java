/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luta;

/**
 *
 * @author israe
 */
public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;
    }
    
    public String getNome(){
    return this.nome;
    }
    public void setNome(String n){
    this.nome = n;
    }
    
    public String getNacionalidade(){
    return this.nacionalidade;
    }
    public void setNacionalidade(String nac){
    this.nacionalidade = nac;
    }
    
    public int getIdade(){
    return this.idade;
    }
    public void setIdade(int id){
    this.idade = id;
    }
    
    public float getAltura(){
    return this.altura;
    }
    public void setAltura(float alt){
    this.altura = alt;
    }
    
    public float getPeso(){
    return this.peso;
    }
    public void setPeso(float p){
    this.peso = p;
    this.setCategoria();
    }
    
    public String getCategoria(){
    return this.categoria;
    }
    private void setCategoria(){
        if (this.peso<52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
        
    }
    
    public int getVitorias(){
    return this.vitorias;
    }
    public void setVitorias(int vit){
    this.vitorias = vit;
    }
    
    public int getDerrotas(){
    return this.derrotas;
    }
    public void setDerrotas(int der){
    this.derrotas = der;
    }
    
    public int getEmpates(){
    return this.empates;
    }
    public void setEmpates(int emp){
    this.empates = emp;
    }
    
    
    
    public void apresentar(){
        System.out.println("------------------------------------");
        System.out.println("CHEGOU A HORA!!!!");
        System.out.println("Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura());
        System.out.println("Pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
