package com.brunelli.fluxoCaixa.service;

import com.brunelli.fluxoCaixa.model.Banco;
import com.brunelli.fluxoCaixa.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class BancoService extends AbstractCrudService<Banco> {
    
    @Inject
    private GenericDao<Banco> dao;

    @Override
    protected GenericDao<Banco> getDao() {
        return dao;
    }
    
}
