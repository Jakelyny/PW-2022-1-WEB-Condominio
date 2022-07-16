package br.edu.ifsul.converters;

import br.edu.ifsul.condominiomodel.Pessoa;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jakelyny Sousa
 */

@Named(value = "converterProprietario")
@RequestScoped
public class ConverterPessoa implements Serializable, Converter {

    @PersistenceContext(unitName = "PW-2022-1-Model-CondominioPU")
    protected EntityManager em;
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null || string.equals("Selecione um registro")){
            return null;
        }
        return em.find(Pessoa.class, string);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        if (t == null){
            return null;
        }
        Pessoa obj = (Pessoa) t;
        return obj.getCpf();
    }
}