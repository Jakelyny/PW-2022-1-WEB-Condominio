package br.edu.ifsul.dao;

import br.edu.ifsul.condominiomodel.Mensalidades;
import br.edu.ifsul.converters.ConverterOrdem;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Jakelyny Sousa
 */

@Stateful
public class MensalidadesDAO <TIPO> extends DAOGenerico<Mensalidades> implements Serializable {
    
    public MensalidadesDAO(){
        
        super();
        classePersistente = Mensalidades.class;
        listaOrdem.add(new Ordem("id", "ID", "="));
        listaOrdem.add(new Ordem("valor", "Valor", "like"));
        ordemAtual = listaOrdem.get(1);
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);  
    }
}