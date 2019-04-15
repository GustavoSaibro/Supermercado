/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorCompra;

import Modelos.Produto;
import Modelos.Venda;
import java.util.ArrayList;
import GerenciadorProduto.GerenciadorProduto;
/**
 *
 * @author Gustavo
 */
public class GerenciadorCompra {

    private ArrayList<Venda> vendas;
    private ArrayList<Produto> prodComprados;
    private static GerenciadorCompra genCompra;

    private GerenciadorCompra() {
        vendas = new ArrayList<>();
        prodComprados = new ArrayList<>();
        
    }

    public static GerenciadorCompra getInstance() {
        if (genCompra == null) {
            genCompra = new GerenciadorCompra();
        }
        return genCompra;
    }

    public float totalizacaoDia() {
        float total = 0;

        for (Venda venda : vendas) {
            total += venda.getValorCompra();
        }
        return total;
    }

    public void addValorCompra(float valorCompra) {
        Venda v = new Venda();
        v.setValorCompra(valorCompra);
        vendas.add(v);

    }

    public float valorPagamento(ArrayList<Produto> produtos) {
        float valorTotal = 0;

        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        
        return valorTotal;
    }  
    
    public void adicionarProduto(Produto produto) {
        prodComprados.add(produto);
    }
    
    public ArrayList<Produto> getCompra(){
        return prodComprados;        
    }
    
    
    public void cancelarProduto(String id){
      
        for(Produto p : prodComprados){
            if(p.getCodgigo().contentEquals(id)){
                prodComprados.remove(p);
                break;
            }
      }
    }
    
    public void cancelarCompra(){
        prodComprados = new ArrayList<>();
    }
    
}
