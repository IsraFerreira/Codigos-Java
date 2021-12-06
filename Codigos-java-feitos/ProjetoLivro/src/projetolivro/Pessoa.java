/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author israe
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String n, int i, String s){
    this.nome = n;
    this.idade = i;
    this.sexo = s;
    }
    
    public String getNome(){
    return this.nome;
    }
    public void setNome(String n){
    this.nome = n;
    }
    
    public int getIdade(){
    return this.idade;
    }
    public void setIdade(int id){
    this.idade = id;
    }
    
    public String getSexo(){
    return this.sexo;
    }
    public void setSexo(String s){
    this.sexo = s;
    }
    
    public void fazerAniver(){
        this.idade = this.idade + 1;
    
    }
    
}
