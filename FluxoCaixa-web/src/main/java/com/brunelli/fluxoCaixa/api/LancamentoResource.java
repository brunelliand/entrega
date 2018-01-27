package com.brunelli.fluxoCaixa.api;

import com.brunelli.fluxoCaixa.model.Lancamento;
import com.brunelli.fluxoCaixa.service.AbstractCrudService;
import com.brunelli.fluxoCaixa.service.LancamentoService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("lancamentos")
public class LancamentoResource extends AbstractCrudResource<Lancamento> {

    @Inject
    private LancamentoService service;

    @Override
    protected AbstractCrudService<Lancamento> getService() {
        return service;
    }

}
