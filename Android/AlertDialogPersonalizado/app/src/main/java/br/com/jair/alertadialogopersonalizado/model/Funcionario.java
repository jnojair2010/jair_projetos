package br.com.jair.alertadialogopersonalizado.model;

public class Funcionario extends Pessoa{

    private int id;
    private String atividadeProfissional;
    private String dataAdminssao;
    private String dataDemissao;
    private String funcao;
    private AtribuicaoFuncionario atribuicaoAExecutar = new AtribuicaoFuncionario();
    private Login login = new Login();

    public Funcionario(){

    }

    public Funcionario(int id, String atividadeProfissional, String dataAdminssao, String dataDemissao, String funcao, AtribuicaoFuncionario atribuicaoAExecutar, Login login) {
        this.id = id;
        this.atividadeProfissional = atividadeProfissional;
        this.dataAdminssao = dataAdminssao;
        this.dataDemissao = dataDemissao;
        this.funcao = funcao;
        this.atribuicaoAExecutar = atribuicaoAExecutar;
        this.login = login;
    }

    public Funcionario(int id, String nome, String sobreNome, int registroGeral, int cpf, String nomeMae, String nomePai, String dataNascimento, Endereco endereco, int id1, String atividadeProfissional, String dataAdminssao, String dataDemissao, String funcao, AtribuicaoFuncionario atribuicaoAExecutar, Login login) {
        super(id, nome, sobreNome, registroGeral, cpf, nomeMae, nomePai, dataNascimento, endereco);
        this.id = id1;
        this.atividadeProfissional = atividadeProfissional;
        this.dataAdminssao = dataAdminssao;
        this.dataDemissao = dataDemissao;
        this.funcao = funcao;
        this.atribuicaoAExecutar = atribuicaoAExecutar;
        this.login = login;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getAtividadeProfissional() {
        return atividadeProfissional;
    }

    public void setAtividadeProfissional(String atividadeProfissional) {
        this.atividadeProfissional = atividadeProfissional;
    }

    public String getDataAdminssao() {
        return dataAdminssao;
    }

    public void setDataAdminssao(String dataAdminssao) {
        this.dataAdminssao = dataAdminssao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public AtribuicaoFuncionario getAtribuicaoAExecutar() {
        return atribuicaoAExecutar;
    }

    public void setAtribuicaoAExecutar(AtribuicaoFuncionario atribuicaoAExecutar) {
        this.atribuicaoAExecutar = atribuicaoAExecutar;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
