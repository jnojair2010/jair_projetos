/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.model;

/**
 *
 * @author Jair_home
 */
public class ProdutosVenda extends Produto {
    
    private int quantidade;
    private int posicao;
    
    public ProdutosVenda(){
    }
    
    public ProdutosVenda(int quantidade, int posicao, String id, String nome, String marca, String linha, String modelo, double pVenda, double pCompra, String codBarra, String codInterno) {
        super(id, nome, marca, linha, modelo, pVenda, pCompra, codBarra, codInterno);
        this.quantidade = quantidade;
        this.posicao = posicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    

    
 
}
