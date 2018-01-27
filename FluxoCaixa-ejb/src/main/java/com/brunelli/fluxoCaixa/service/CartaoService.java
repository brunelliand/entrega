package com.brunelli.fluxoCaixa.service;

import com.brunelli.fluxoCaixa.model.Cartao;
import com.brunelli.fluxoCaixa.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class CartaoService extends AbstractCrudService<Cartao> {
    
    @Inject
    private GenericDao<Cartao> dao;

    @Override
    protected GenericDao<Cartao> getDao() {
        return dao;
    }
    
}
