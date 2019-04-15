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
public class Compra {
    private Cartao cartao;
    private Produto produto;
    

    public Compra() {
    }
    
    public Cartao getCartao() {
        return cartao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
