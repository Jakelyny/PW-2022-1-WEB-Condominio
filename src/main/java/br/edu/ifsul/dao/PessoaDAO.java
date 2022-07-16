package br.edu.ifsul.dao;

import br.edu.ifsul.condominiomodel.Pessoa;
import br.edu.ifsul.converters.ConverterOrdem;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Jakelyny Sousa
 */

@Stateful
public class PessoaDAO <TIPO> extends DAOGenerico<Pessoa> implements Serializable {
    
    public PessoaDAO(){
        
        super();
        classePersistente = Pessoa.class;
        listaOrdem.add(new Ordem("cpf", "Cpf", "="));
        listaOrdem.add(new Ordem("nome", "Nome", "like"));
        ordemAtual = listaOrdem.get(1);
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);  
    }
}
