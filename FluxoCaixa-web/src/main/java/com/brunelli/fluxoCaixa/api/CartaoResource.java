package com.brunelli.fluxoCaixa.api;

import com.brunelli.fluxoCaixa.model.Cartao;
import com.brunelli.fluxoCaixa.service.AbstractCrudService;
import com.brunelli.fluxoCaixa.service.CartaoService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("cartoes")
public class CartaoResource extends AbstractCrudResource<Cartao> {

    @Inject
    private CartaoService service;

    @Override
    protected AbstractCrudService<Cartao> getService() {
        return service;
    }

}
