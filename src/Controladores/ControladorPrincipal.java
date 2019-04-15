/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import SupermercadoGUI.TelaCompra;
import SupermercadoGUI.TelaPagamento;
import SupermercadoGUI.TelaPrincipal;
/**
 *
 * @author Gustavo
 */
public class ControladorPrincipal {
    
    private static ControladorPrincipal ctrlPrincipal;

    private ControladorPrincipal() {
    }
    
    public static ControladorPrincipal getInstance(){
        if(ctrlPrincipal == null){
            ctrlPrincipal = new ControladorPrincipal();
        }
        return ctrlPrincipal;
    }
    
    public TelaPagamento mostrarTelaPagamento(){
        TelaPagamento tela = ControladorPagamento.getInstance().mostrarTelaPagamento();
        ControladorPagamento.getInstance().abrirTelaPagamento();
        return tela;
    }    
    
    public TelaPrincipal mostrarTelaPrincipal(){
        return TelaPrincipal.getInstance();
    }
    
    public void abrirTelaPrincipal(){
        TelaPrincipal.getInstance().setVisible(true);
    }
    
    public void fecharTelaPrincipal(){
        TelaPrincipal.getInstance().setVisible(false);
    }
    
    public TelaCompra mostrarTelaCompra(){
        TelaCompra tela = ControladorCompra.getInstance().mostrarTelaCompra();
        ControladorCompra.getInstance().abrirTelaCompra();
        return tela;
    }
}
