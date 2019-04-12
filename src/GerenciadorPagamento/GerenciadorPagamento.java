/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorPagamento;

import Modelos.Cartao;
import Modelos.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class GerenciadorPagamento {

    private ArrayList<Cartao> cartoes;
    private static GerenciadorPagamento genPagamento;
    private Funcionario gerente;
   
    private GerenciadorPagamento() {
        gerente = new Funcionario("Cleison", "123456");       
        cartoes = new ArrayList<>();
        listaCatoes();
    }

    public static GerenciadorPagamento getInstance() {
        if (genPagamento == null) {
            genPagamento = new GerenciadorPagamento();
        }
        return genPagamento;
    }

    private void listaCatoes() {
        Cartao cartao1 = new Cartao("789", "Cleison", "123");
        Cartao cartao2 = new Cartao("963", "João","456");
        Cartao cartao3 = new Cartao("321", "Zé","789");       

        cartoes.add(cartao1);
        cartoes.add(cartao2);
        cartoes.add(cartao3);       
    }

    public ArrayList<Cartao> getCartoes() {     
        return cartoes;
    }

    public String getSenhaGerente() {
        String senha = "";
        if (gerente != null) {
            senha = gerente.getSenha();
        }
        return senha;
    }

    public boolean autentificaCartao(String numCartao) {
        boolean encontrou = false;
        String nCartao = "";

        for (Cartao cartao : cartoes) {
            nCartao = cartao.getNumCartao();
            if (nCartao.equals(numCartao)) {
                return true;
            }
        }
        return false;
    }

    public boolean autentificaSenhaCartao(String senha) {
        boolean encontrou = false;
        String nSenha = "";

        for (Cartao cartao : cartoes) {
            nSenha = cartao.getNumCartao();
            if (nSenha.equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public boolean autentificaSenhaFuncionario(String senha) {
        boolean encontrou = false;

        if (senha.equals(gerente.getSenha())) {
            encontrou = true;
        }
        return false;
    }

   

}
