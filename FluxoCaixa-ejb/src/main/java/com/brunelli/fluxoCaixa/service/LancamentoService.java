package com.brunelli.fluxoCaixa.service;

import com.brunelli.fluxoCaixa.model.Lancamento;
import com.brunelli.fluxoCaixa.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class LancamentoService extends AbstractCrudService<Lancamento> {
    
    @Inject
    private GenericDao<Lancamento> dao;

    @Override
    protected GenericDao<Lancamento> getDao() {
        return dao;
    }
    
}
