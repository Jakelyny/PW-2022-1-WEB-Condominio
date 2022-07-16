package br.edu.ifsul.dao;

import br.edu.ifsul.condominiomodel.Locatario;
import br.edu.ifsul.converters.ConverterOrdem;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Jakelyny Sousa
 */

@Stateful
public class LocatarioDAO <TIPO> extends DAOGenerico<Locatario> implements Serializable {
    
    public LocatarioDAO(){
        
        super();
        classePersistente = Locatario.class;
        listaOrdem.add(new Ordem("cpf", "Cpf", "like"));
        listaOrdem.add(new Ordem("nome", "Nome", "like"));
        ordemAtual = listaOrdem.get(1);
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);  
    }
}
