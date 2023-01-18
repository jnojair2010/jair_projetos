/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.model;

import java.util.Date;


public class Produto {
    
    private String id;
    private String nome;
    private String marca;
    private String linha;
    private String modelo;
    private Date validade;
    private Date fabricacao;
    private double pVenda;
    private double pCompra;
    private String codBarra;
    private String codInterno;

    
    public Produto(){
        
    }
    
    
    public  Produto(String id, String nome, String marca, String linha, String modelo,double pVenda,double pCompra, String codBarra, String codInterno){
    this.id =id;
    this.nome = nome;
    this.marca = marca;
    this.linha = linha; 
    this.modelo = modelo;
    this.pVenda = pVenda;
    this.pCompra = pCompra;
    this.codBarra = codBarra;
    this.codInterno = codInterno;
  
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public double getpVenda() {
        return pVenda;
    }

    public void setpVenda(double pVenda) {
        this.pVenda = pVenda;
    }

    public double getpCompra() {
        return pCompra;
    }

    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(String codInterno) {
        this.codInterno = codInterno;
    }
     
    /*
    @Override
    public String toString(){
        return getNome();
    } */   


    
    
}
