/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorProduto;

import Modelos.Produto;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class GerenciadorProduto {

    private ArrayList<Produto> produtos;
    private static GerenciadorProduto genProduto;

    private GerenciadorProduto() {
    }

    public static GerenciadorProduto getInstancia() {
        if (genProduto == null) {
            genProduto = new GerenciadorProduto();
        }
        return genProduto;
    }

    private void listaProdutos() {

        Produto cafe = new Produto("cafe", "1", 15.56f);
        Produto acucar = new Produto("acucar", "2", 8.89f);
        Produto leite = new Produto("leite", "3", 3.60f);
        Produto bolacha = new Produto("bolacha", "4", 2.30f);
        Produto macarrao = new Produto("macarrao", "5", 4.0f);
        Produto arroz = new Produto("arroz", "6", 5.87f);
        Produto feijao = new Produto("feijao", "7", 3.67f);
        Produto agua = new Produto("agua", "8", 2.20f);

        produtos.add(cafe);
        produtos.add(acucar);
        produtos.add(leite);
        produtos.add(bolacha);
        produtos.add(macarrao);
        produtos.add(arroz);
        produtos.add(feijao);
        produtos.add(agua);
    }

    public ArrayList<Produto> getProdutos() {
        if (produtos == null) {
            produtos = new ArrayList<>();
            listaProdutos();
        }
        return produtos;
    }

    public Produto getProdutoPeloCodigo(String codigo) {
        Produto produto = null;

        for (Produto p : produtos) {
            if (p.getCodgigo().contentEquals(codigo)) {
                produto = p;
                return produto;
            }
        }
        return produto;
    }
    
    public Produto getProdutoPeloNome(String nome){
        Produto produto = null;
        
        for(Produto p : produtos){
            if(p.getNome().contentEquals(nome)){
                produto = p;
            }
        }        
        return produto;
    }
    
    public String getNomeProduto(String codigo) {
        String produto = null;

        for (Produto p : produtos) {
            if (p.getCodgigo().contentEquals(codigo)) {
                produto = p.getNome();
                return produto;
            }
        }
        return produto;
    }
    

}
