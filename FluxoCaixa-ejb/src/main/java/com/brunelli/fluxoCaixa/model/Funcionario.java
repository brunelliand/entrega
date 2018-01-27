package com.brunelli.fluxoCaixa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "funcionarios")
public class Funcionario implements Serializable, Entidade {

    @Id
    @Column(name = "id_funcionario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo", length = 15, nullable = false, unique = true)
    private String codigo;
    @NotNull(message = "{Funcionario.codigo.NotNull}")
    @Column(name = "nm_funcionario", length = 100, nullable = false)
    private String nome;
    @NotNull(message = "{Funcionario.nome.NotNull}")
    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;
    @NotNull(message = "{Funcionario.cpf.NotNull}")
    @Column(name = "ctps", length = 15)
    private String ctps;
    @Column(name = "seriectps")
    private Integer seriectps;
    @Column(name = "ufctps", length = 2)
    private String ufctps;
    @Column(name = "estado_civil")
    private String estadocivil;
    @Column(name = "rg")
    private String rg;
    @Column(name = "orgaorg")
    private String orgaorg;
    @Column(name = "ufrg", length = 2)
    private String ufrg;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "data_adm", nullable = false)
    @NotNull(message = "{Funcionario.data_adm.NotNull}")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAdmissao;
    @Column(name = "data_nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "salario")
    private BigDecimal salario;
    @Column(name = "telefone_ddd", length = 2)
    private String telefone_ddd;
    @Column(name = "telefone", length = 9)
    private String telefone;
    @Column(name = "celular_ddd", length = 2)
    private String celular_ddd;
    @Column(name = "celular", length = 9)
    private String celular;
    @Column(name = "ds_email")
    private String email;
    @Column(name = "nm_estado")
    private String nome_estado;
    @Column(name = "nm_bairro")
    private String bairro;
    @Column(name = "nm_cidade")
    private String cidade;
    @Column(name = "nm_logradouro")
    private String logradouro;
    @Column(name = "cidade_cep")
    private String cep;
    @Column(name = "estado")
    private String estado;
    @Column(name = "uf_estado")
    private String ufestado;
    @Column(name = "nro_logradouro")
    private String nro;
    @Column(name = "observacao", length = 30)
    private String observacao;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Integer getSeriectps() {
        return seriectps;
    }

    public void setSeriectps(Integer seriectps) {
        this.seriectps = seriectps;
    }

    public String getUfctps() {
        return ufctps;
    }

    public void setUfctps(String ufctps) {
        this.ufctps = ufctps;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaorg() {
        return orgaorg;
    }

    public void setOrgaorg(String orgaorg) {
        this.orgaorg = orgaorg;
    }

    public String getUfrg() {
        return ufrg;
    }

    public void setUfrg(String ufrg) {
        this.ufrg = ufrg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getTelefone_ddd() {
        return telefone_ddd;
    }

    public void setTelefone_ddd(String telefone_ddd) {
        this.telefone_ddd = telefone_ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular_ddd() {
        return celular_ddd;
    }

    public void setCelular_ddd(String celular_ddd) {
        this.celular_ddd = celular_ddd;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUfestado() {
        return ufestado;
    }

    public void setUfestado(String ufestado) {
        this.ufestado = ufestado;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.codigo);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.cpf);
        hash = 59 * hash + Objects.hashCode(this.ctps);
        hash = 59 * hash + Objects.hashCode(this.seriectps);
        hash = 59 * hash + Objects.hashCode(this.ufctps);
        hash = 59 * hash + Objects.hashCode(this.estadocivil);
        hash = 59 * hash + Objects.hashCode(this.rg);
        hash = 59 * hash + Objects.hashCode(this.orgaorg);
        hash = 59 * hash + Objects.hashCode(this.ufrg);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        hash = 59 * hash + Objects.hashCode(this.dataAdmissao);
        hash = 59 * hash + Objects.hashCode(this.dataNascimento);
        hash = 59 * hash + Objects.hashCode(this.salario);
        hash = 59 * hash + Objects.hashCode(this.telefone_ddd);
        hash = 59 * hash + Objects.hashCode(this.telefone);
        hash = 59 * hash + Objects.hashCode(this.celular_ddd);
        hash = 59 * hash + Objects.hashCode(this.celular);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.nome_estado);
        hash = 59 * hash + Objects.hashCode(this.bairro);
        hash = 59 * hash + Objects.hashCode(this.cidade);
        hash = 59 * hash + Objects.hashCode(this.logradouro);
        hash = 59 * hash + Objects.hashCode(this.cep);
        hash = 59 * hash + Objects.hashCode(this.estado);
        hash = 59 * hash + Objects.hashCode(this.ufestado);
        hash = 59 * hash + Objects.hashCode(this.nro);
        hash = 59 * hash + Objects.hashCode(this.observacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.ctps, other.ctps)) {
            return false;
        }
        if (!Objects.equals(this.ufctps, other.ufctps)) {
            return false;
        }
        if (!Objects.equals(this.estadocivil, other.estadocivil)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.orgaorg, other.orgaorg)) {
            return false;
        }
        if (!Objects.equals(this.ufrg, other.ufrg)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.telefone_ddd, other.telefone_ddd)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.celular_ddd, other.celular_ddd)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.nome_estado, other.nome_estado)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.ufestado, other.ufestado)) {
            return false;
        }
        if (!Objects.equals(this.nro, other.nro)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.seriectps, other.seriectps)) {
            return false;
        }
        if (!Objects.equals(this.dataAdmissao, other.dataAdmissao)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        return true;
    }
    
    

}
