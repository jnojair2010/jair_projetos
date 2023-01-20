package br.com.jair.alertadialogopersonalizado.model;

import java.util.Date;

public class Pessoa {

    private int id;
    private String nome;
    private String sobreNome;
    private int registroGeral;
    private int cpf;
    private String nomeMae;
    private String nomePai;
    private String dataNascimento;
    private Endereco endereco;


    public Pessoa(){

    }

    public Pessoa(int id, String nome, String sobreNome, int registroGeral, int cpf, String nomeMae, String nomePai, String dataNascimento, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.registroGeral = registroGeral;
        this.cpf = cpf;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(int registroGeral) {
        this.registroGeral = registroGeral;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
