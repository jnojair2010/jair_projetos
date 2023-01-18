/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.controler;

import java.util.ArrayList;
import java.util.List;
import loja.model.Produto;
import loja.model.ProdutosVenda;

/**
 *
 * @author Jair_home
 */
public class ControlePdv {
    
   private static List<Produto> listProduto = new ArrayList();
   
    
    
    public void getListaProtudo(){
        
        Produto p1 =  new Produto("1", "pó","Ruby Rose", "compacto", "hb 2341", 18.50, 8.00, "789222211111", "2514");
        Produto p2 =  new Produto("1", "pó","Ruby Rose", "compacto", "hb 2341", 18.50, 8.00, "789333311111", "2515");
        Produto p3 =  new Produto("1", "pó","Ruby Rose", "compacto", "hb 2341", 18.50, 8.00, "789444411111", "2516");
        Produto p4 =  new Produto("1", "pó","Ruby Rose", "compacto", "hb 2341", 18.50, 8.00, "789555511111", "2517");
        
        
        this.listProduto.add(p1);
        this.listProduto.add(p2);
        this.listProduto.add(p3);
        this.listProduto.add(p4);
        
      
    }
    
    public ProdutosVenda  getProdutoParaVendaPorCodigoInterno(String codigoInterno){        // aqui pega o produto do banco de dado
        ProdutosVenda objPesquisado = new ProdutosVenda();

        for(int count = 0;count<listProduto.size();count++){
          
            if(listProduto.get(count).getCodInterno().equals(codigoInterno)){
                
                objPesquisado.setNome(listProduto.get(count).getNome());
                objPesquisado.setCodBarra(listProduto.get(count).getCodBarra());
                objPesquisado.setCodInterno(listProduto.get(count).getCodInterno());
                objPesquisado.setFabricacao(listProduto.get(count).getFabricacao());
                objPesquisado.setId(listProduto.get(count).getId());
                objPesquisado.setLinha(listProduto.get(count).getLinha());
                objPesquisado.setModelo(listProduto.get(count).getModelo());
                objPesquisado.setValidade(listProduto.get(count).getValidade());
                objPesquisado.setpVenda(listProduto.get(count).getpVenda());
                objPesquisado.setpCompra(listProduto.get(count).getpCompra());
                objPesquisado.setMarca(listProduto.get(count).getMarca());
                
            }
        }

       // System.out.println("**************************o valor consultado antes de retornar o objeto é: "+ objPesquisado.getCodInterno());
         return objPesquisado;
     } 
    
    public ProdutosVenda getProdutoParaVendaPorCodigoBarra(String codigoBarra){
        ProdutosVenda pPesquisado = new ProdutosVenda();
        
        for(int count = 0;count<=listProduto.size();count++){
            if(listProduto.get(count).getCodBarra().equals(codigoBarra)){
                
                pPesquisado.setNome(listProduto.get(count).getNome());
                pPesquisado.setCodBarra(listProduto.get(count).getCodBarra());
                pPesquisado.setCodInterno(listProduto.get(count).getCodInterno());
                pPesquisado.setFabricacao(listProduto.get(count).getFabricacao());
                pPesquisado.setId(listProduto.get(count).getId());
                pPesquisado.setLinha(listProduto.get(count).getLinha());
                pPesquisado.setModelo(listProduto.get(count).getModelo());
                pPesquisado.setValidade(listProduto.get(count).getValidade());
                pPesquisado.setpVenda(listProduto.get(count).getpVenda());
                pPesquisado.setpCompra(listProduto.get(count).getpCompra());
                pPesquisado.setMarca(listProduto.get(count).getMarca());
                
            }
        }
        return pPesquisado;
    
    }
    
    public Produto getItemPesquisa(String Pesquisa){
        Produto pPesquisado = new Produto();
        
        for(int count = 0;count<=listProduto.size();count++){
            if(listProduto.get(count).getNome().equals(Pesquisa)){
                pPesquisado = listProduto.get(count);
            }
        }
        return pPesquisado;
    
    }
    
}
