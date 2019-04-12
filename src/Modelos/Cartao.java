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
public class Cartao {
    private String numCartao;
    private String nome;
    private String senha;

    public Cartao() {
    }

    public Cartao(String numCartao, String nome, String senha) {
        this.numCartao = numCartao;
        this.nome = nome;
        this.senha = senha;
    }

   

    public String getNumCartao() {
        return numCartao;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
    
}
