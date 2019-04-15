/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Gustavo
 */
public class Produto {
    private String nome;
    private String codgigo;
    private float preco;
    private int qtd;
    public Produto() {
    }

    public Produto(String nome, String codgigo, float preco) {
        this.nome = nome;
        this.codgigo = codgigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodgigo() {
        return codgigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodgigo(String codgigo) {
        this.codgigo = codgigo;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }    

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
            
}
