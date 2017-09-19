/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

/**
 *
 * @author Pedro
 */
public class Produto {

    private int id;
    private float valor;
    private String nome;
    private int qtd;
    

    public Produto() {
       
    }

   
    public Produto(int id, float valor, String nome, int qtd) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
        this.qtd = qtd;
    }

    
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
