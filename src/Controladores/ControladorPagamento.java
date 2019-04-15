/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import GerenciadorPagamento.GerenciadorPagamento;
import SupermercadoGUI.TelaPagamento;
import SupermercadoGUI.TelaPrincipal;
/**
 *
 * @author Gustavo
 */
public class ControladorPagamento {   
    private static ControladorPagamento ctrlPagamento;
    private String senha;
    private String numCartao;
    
    
    private ControladorPagamento(){
    }
    
    public static ControladorPagamento getInstance(){
        if(ctrlPagamento == null){
            ctrlPagamento = new ControladorPagamento();
        }        
        return ctrlPagamento;
    }

    public String getSenha() {
        return senha;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
    
    public boolean finalizarCompra(){
        boolean finalizou = false;   
        
        if(GerenciadorPagamento.getInstance().autentificaCartao(numCartao) &&
        GerenciadorPagamento.getInstance().autentificaSenhaCartao(senha)){
            finalizou = true;
            return finalizou;
        }        
        return finalizou;
    }
    
    public void abrirTelaPagamento(){
        TelaPagamento.getInstance().setVisible(true);
    }
    public void fecharTelaPagamento(){
        TelaPagamento.getInstance().setVisible(false);
    }
    
    public TelaPagamento mostrarTelaPagamento(){
        return TelaPagamento.getInstance();        
    }
    public TelaPrincipal mostrarTelaPrincipal(){
        TelaPrincipal tela = ControladorPrincipal.getInstance().mostrarTelaPrincipal();
        ControladorPrincipal.getInstance().abrirTelaPrincipal();
        return tela;
    }
  
}
