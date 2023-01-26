package br.com.jair.alertadialogopersonalizado.manager.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.jair.alertadialogopersonalizado.R;
import br.com.jair.alertadialogopersonalizado.manager.produtos.ManagerProdutos;
import br.com.jair.alertadialogopersonalizado.manager.viewholder.ProdutoViewHolder;
import br.com.jair.alertadialogopersonalizado.model.Produtos;

public class ProdutoAdatpert extends RecyclerView.Adapter<ProdutoViewHolder> {

    private List<Produtos> mLista;

    public ProdutoAdatpert(List<Produtos> mList){
    this.mLista = mList;
    }

    
    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.model_layout_recycler_view_alert_dialog,parent,false);
        return new ProdutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, int position) {
    Produtos p = this.mLista.get(position);
    holder.bind(p);

        Log.i("contagem","**************************** vezes que entrou************************");


    }

    @Override
    public int getItemCount() {

        return  this.mLista.size();
    }
}
