package br.edu.ifsul.dao;

import br.edu.ifsul.condominiomodel.Permissao;
import br.edu.ifsul.converters.ConverterOrdem;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Jakelyny Sousa
 */

@Stateful
public class PermissaoDAO<TIPO>  extends DAOGenerico<Permissao> implements Serializable {
    
    public PermissaoDAO(){
        
        super();
        classePersistente = Permissao.class;
        listaOrdem.add(new Ordem("nome", "Nome", "like"));
        listaOrdem.add(new Ordem("descricao", "Descrição", "like"));
        ordemAtual = listaOrdem.get(0);
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);              
    }
}
