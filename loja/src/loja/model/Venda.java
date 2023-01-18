/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.chart.PieChart.Data;
import sun.security.util.Length;

/**
 *
 * @author Jair_home
 */
public class Venda {
    
    private Data data;
    private String idVendedor;
    private String idLoja;
    private String pedido;
    private static List<ProdutosVenda> listaProduto = new ArrayList<>();
    private int posicao;
   
    

    public Venda() {
    }

    public int getPosicaoProduto(Produto p){

       if(listaProduto.size()>0){ //  início do if
           
           for(int i=0;i<this.listaProduto.size();i++){ //    início do for
                if(listaProduto.get(i).getCodBarra().equals(p.getCodBarra())){
                  // this.posicao = listaProduto.get(i)+1;
                    System.out.println("entrou no for"+listaProduto);
                }

           }    // fim do for
           
       }  //fim do if
        System.out.println("o codigo do produto em vendas antes do retorno de getPosicion é: "+p.getCodBarra());
       return this.posicao;
    }
    
    public List<ProdutosVenda> getListaProduto(){
       return this.listaProduto;
    }
    
    public void setProduto(ProdutosVenda p, int quant){
        p.setQuantidade(quant);
          this.listaProduto.add(p);
        
         for(int i=0;i<listaProduto.size();i++){
              if(p.getCodBarra().equals(p.getCodBarra())){
                  listaProduto.get(i).setPosicao(i+1);      
              }
            }
        System.out.println("2º Entrou no metodo setproduto e pegou a posição: "+listaProduto.get(0).getPosicao());
       
    }
    
}
