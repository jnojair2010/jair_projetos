package br.com.jair.alertadialogopersonalizado.manager.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.com.jair.alertadialogopersonalizado.R;
import br.com.jair.alertadialogopersonalizado.model.Produtos;


public class ProdutoViewHolder extends RecyclerView.ViewHolder {

    private TextView nomeProduto;


    public ProdutoViewHolder(@NonNull View itemView) {
        super(itemView);

            this.nomeProduto = (TextView)  itemView.findViewById(R.id.nome_reclycler_view_modelo);

    }

    public void bind(Produtos p){
        this.nomeProduto.setText(p.getNome().toUpperCase());
    }

}
