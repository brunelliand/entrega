export default class ListController {
  constructor($stateParams, $state, LancamentoServico, Notification) {
    this.filter = "";
    this.records = [];
    this._service = LancamentoServico;
    this._notify = Notification;
    this.nome = 'Lançamentos';
    this.load();
    this.record = {};
    this.title = "Adicionando registro";
    this._service = LancamentoServico;
    if ($stateParams.id) {
      this.title = "Editando registro";
      this._service.findById($stateParams.id).then(data => {
        this.record = data;
      });
    }
    this._state = $state;
    this._notify = Notification;
  }

  load() {
    this._service
      .findAll()
      .then(data => {
        this.records = data;
      })
      .catch(error => {
        console.log(error);
      });
  }
  add() {
    this.records.push({
      recibo: "",
      descricao: "",
      tipo: "",
      moeda: "",
      bandeira: "",
      valor: ""
    });
  }

  edit() {
    this.editar = !this.editar;
  }

  removeLinha(index) {
    this.records.splice(index, 1);
  }

  save(record) {
    this._service
      .save(record)
      .then(resp => {
        this._notify.success("Lancamento salvo com sucesso!");
        this._state.go("lancamentos.list");
      })
      .catch(erro => {
        this._notify(
          { message: erro.message || "Problemas ao salvar o registro" },
          erro.type || "error"
        );
      });
  }

  excluir(index, id) {
    if (!id) {
      this.records.splice(index, 1);
    } else {
      this._service
        .remove(id)
        .then(response => {
          this.load();
          this._notify.success("Registro excluído com sucesso");
        })
        .catch(erro => {
          this._notify(
            { message: erro.message || "Problemas ao excluir o registro" },
            erro.type || "error"
          );
        });
    }
  }
}

ListController.$inject = [
  "$stateParams",
  "$state",
  "LancamentoServico",
  "Notification"
];
