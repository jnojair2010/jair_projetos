package br.com.jair.alertadialogopersonalizado.manager.produtos;

import android.view.LayoutInflater;

import java.util.ArrayList;

import br.com.jair.alertadialogopersonalizado.model.Produtos;

public class ManagerProdutos {

    public static ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();

    public ManagerProdutos(){
        Produtos mProdutos1 = new Produtos(1,"Pó","Hb 3156","Ruby Rose","Compacto");
        Produtos mProdutos2 = new Produtos(1,"Base","Hb 1156","Ruby Rose","Soft Matte");
        Produtos mProdutos3 = new Produtos(1,"Base","Hb 1231","Ruby Rose","Feels");
        Produtos mProdutos4 = new Produtos(1,"Corretivo","Hb 1560","Ruby Rose","Feels");
        Produtos mProdutos5 = new Produtos(1,"Pó","Hb 3354","Ruby Rose","Self");
        listaProdutos.add(mProdutos1);
        listaProdutos.add(mProdutos2);
        listaProdutos.add(mProdutos3);
        listaProdutos.add(mProdutos4);
        listaProdutos.add(mProdutos5);

    }

    public ArrayList<Produtos> getListaProdutos(){

        return listaProdutos;
    }


}
