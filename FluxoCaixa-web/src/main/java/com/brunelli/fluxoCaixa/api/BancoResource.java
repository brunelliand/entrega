package com.brunelli.fluxoCaixa.api;

import com.brunelli.fluxoCaixa.model.Banco;
import com.brunelli.fluxoCaixa.service.AbstractCrudService;
import com.brunelli.fluxoCaixa.service.BancoService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("bancos")
public class BancoResource extends AbstractCrudResource<Banco> {

    @Inject
    private BancoService service;

    @Override
    protected AbstractCrudService<Banco> getService() {
        return service;
    }

}
