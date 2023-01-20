package br.com.jair.alertadialogopersonalizado.model;

public class AtribuicaoFuncionario {

    private int id;
    private boolean daDesconto;
    private boolean daDescontoMaiorQue3;
    private boolean cadastrarProduto;
    private boolean deletarProduto;
    private boolean precificarProduto;
    private boolean cadastraPrecoFornecedorProduto;
    //... poe ser incrementado mais atribuição ao exemplo, por enquanto finaliza aqui de atribuição
    //criar metodo e contrutor;

    public AtribuicaoFuncionario(){

    }

    public AtribuicaoFuncionario(int id, boolean daDesconto, boolean daDescontoMaiorQue3, boolean cadastrarProduto, boolean deletarProduto, boolean precificarProduto, boolean cadastraPrecoFornecedorProduto) {
        this.id = id;
        this.daDesconto = daDesconto;
        this.daDescontoMaiorQue3 = daDescontoMaiorQue3;
        this.cadastrarProduto = cadastrarProduto;
        this.deletarProduto = deletarProduto;
        this.precificarProduto = precificarProduto;
        this.cadastraPrecoFornecedorProduto = cadastraPrecoFornecedorProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDaDesconto() {
        return daDesconto;
    }

    public void setDaDesconto(boolean daDesconto) {
        this.daDesconto = daDesconto;
    }

    public boolean isDaDescontoMaiorQue3() {
        return daDescontoMaiorQue3;
    }

    public void setDaDescontoMaiorQue3(boolean daDescontoMaiorQue3) {
        this.daDescontoMaiorQue3 = daDescontoMaiorQue3;
    }

    public boolean isCadastrarProduto() {
        return cadastrarProduto;
    }

    public void setCadastrarProduto(boolean cadastrarProduto) {
        this.cadastrarProduto = cadastrarProduto;
    }

    public boolean isDeletarProduto() {
        return deletarProduto;
    }

    public void setDeletarProduto(boolean deletarProduto) {
        this.deletarProduto = deletarProduto;
    }

    public boolean isPrecificarProduto() {
        return precificarProduto;
    }

    public void setPrecificarProduto(boolean precificarProduto) {
        this.precificarProduto = precificarProduto;
    }

    public boolean isCadastraPrecoFornecedorProduto() {
        return cadastraPrecoFornecedorProduto;
    }

    public void setCadastraPrecoFornecedorProduto(boolean cadastraPrecoFornecedorProduto) {
        this.cadastraPrecoFornecedorProduto = cadastraPrecoFornecedorProduto;
    }
}
