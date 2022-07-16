package br.edu.ifsul.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jakelyny Sousa
 */

public class Util {

    public static String getMensagemErro(Exception e){
        
        while (e.getCause() != null){
            e = (Exception) e.getCause();
        }
        String retorno = e.getMessage();
        
        if (retorno.contains("violates foreign key")){
            retorno = "Registro não pode ser excluido por possuir referências em outras partes do sistema!";
        }
        return retorno;
    }
    
    public static void mensagemInformacao(String mensagem){
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.getExternalContext().getFlash().setKeepMessages(true);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, "");
        contexto.addMessage(null, msg);        
    }
    
    public static void mensagemErro(String mensagem){
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.getExternalContext().getFlash().setKeepMessages(true);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, "");
        contexto.addMessage(null, msg);        
    }     
}
