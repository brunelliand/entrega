package com.brunelli.fluxoCaixa.service;

import com.brunelli.fluxoCaixa.model.Funcionario;
import com.brunelli.fluxoCaixa.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class FuncionarioService extends AbstractCrudService<Funcionario> {
    
    @Inject
    private GenericDao<Funcionario> dao;

    @Override
    protected GenericDao<Funcionario> getDao() {
        return dao;
    }
    
}
