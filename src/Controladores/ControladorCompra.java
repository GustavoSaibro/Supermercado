/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import GerenciadorCompra.GerenciadorCompra;
import GerenciadorProduto.GerenciadorProduto;
import SupermercadoGUI.TelaCompra;
import GerenciadorPagamento.GerenciadorPagamento;

/**
 *
 * @author Gustavo
 */
public class ControladorCompra {

    private static ControladorCompra ctrlCompra;
    private String senha;

    private ControladorCompra() {
    }

    public static ControladorCompra getInstance() {
        if (ctrlCompra == null) {
            ctrlCompra = new ControladorCompra();
        }
        return ctrlCompra;
    }

    public void adicionarProduto(String nome) {
        GerenciadorCompra.getInstance().adicionarProduto(GerenciadorProduto.getInstancia().getProdutoPeloNome(nome));
    }
    
    public void cancelarCompra(){
        GerenciadorCompra.getInstance().cancelarCompra();
    }
    
    public String getValorTotal(){
        float conta = GerenciadorCompra.getInstance().valorPagamento(GerenciadorCompra.getInstance().getCompra());
        String valor = String.valueOf(conta);
        return valor;
    }
    
    public TelaCompra mostrarTelaCompra(){
        return TelaCompra.getInstance();
    }
    
    public void abrirTelaCompra(){
        TelaCompra.getInstance().setVisible(true);
    }
    
    public void fecharTelaCompra(){
        TelaCompra.getInstance().setVisible(false);
    }
    
    public void cancelarProduto(String id){
        GerenciadorCompra.getInstance().cancelarProduto(id);        
    }
    
    public String getNomeProduto(String id){
       String nome = GerenciadorProduto.getInstancia().getNomeProduto(id);
       return nome;       
    }
    public boolean autentificaSenhaGerente(String senha){
        return GerenciadorPagamento.getInstance().autentificaSenhaGerente(senha);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void addValorCompra(String valorCompra){
        float valor  = Float.parseFloat(valorCompra);
        GerenciadorCompra.getInstance().addValorCompra(valor);
    }
    
   public String getTotalDoDia(){
       String total = String.valueOf(GerenciadorCompra.getInstance().totalizacaoDia());
       return total;
   }  
  

}
