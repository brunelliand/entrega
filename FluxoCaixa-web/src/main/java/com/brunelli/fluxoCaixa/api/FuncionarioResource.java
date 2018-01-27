package com.brunelli.fluxoCaixa.api;

import com.brunelli.fluxoCaixa.model.Funcionario;
import com.brunelli.fluxoCaixa.service.AbstractCrudService;
import com.brunelli.fluxoCaixa.service.FuncionarioService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("funcionarios")
public class FuncionarioResource extends AbstractCrudResource<Funcionario> {

    @Inject
    private FuncionarioService service;

    @Override
    protected AbstractCrudService<Funcionario> getService() {
        return service;
    }

}
