package br.com.jair.alertadialogopersonalizado.manager.comunicaoAndroid;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.jair.alertadialogopersonalizado.R;
import br.com.jair.alertadialogopersonalizado.manager.adapter.ProdutoAdatpert;
import br.com.jair.alertadialogopersonalizado.manager.produtos.ManagerProdutos;
import br.com.jair.alertadialogopersonalizado.model.Produtos;

public class DialogPersonalizado extends AlertDialog {

   private ManagerProdutos mManagerProdutos = new ManagerProdutos();


    public DialogPersonalizado(Context context) {
        super(context);


    }

    protected DialogPersonalizado(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected DialogPersonalizado(Context context, int themeResId) {
        super(context, themeResId);
    }

    @SuppressLint("ResourceAsColor")
    public void getMDialogSimples(){
        Log.i(" Dialog","***************************** getMDialogSimples()");

        TextView title = new TextView(getContext());
        title.setText("Alerta Simples");
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setTextSize(20);
        title.setHeight(150);
        title.setBackgroundColor(Color.rgb(47,79,79));

        AlertDialog.Builder mDialog = new AlertDialog.Builder(getContext());  // esta o this na build do dialog é fundamento para não promover erros
        mDialog.setMessage("Dialog");
        mDialog.setCancelable(false);
        mDialog.setCustomTitle(title);
        mDialog.setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                setToast("Você clicou em Confirmar");
            }
        });
        mDialog.setNegativeButton("NEGAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                setToast("Você clicou em Negar");
            }

        });
        mDialog.setNeutralButton("Canecar", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                setToast("Você clicou cancelar \n optou por Neutralizade");
            }
        });
        mDialog.create();
        mDialog.show();
    }

    public void getDialogPersonalizado(){

        TextView title = new TextView(getContext());
        title.setText("Dialog com Imputs");
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setTextSize(20);
        title.setHeight(150);
        title.setBackgroundColor(Color.rgb(47,79,79));


        AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());

        LayoutInflater inflater = LayoutInflater.from(getContext());
        final View layoutCustomizado  = getLayoutInflater().inflate(R.layout.alert_dialog_personalizado_login,null);
        dialog.setView(layoutCustomizado);
        EditText editTextLogin = (EditText) layoutCustomizado.findViewById(R.id.edtLogin);
        EditText editTextSenha = (EditText) layoutCustomizado.findViewById(R.id.edtSenha);
        dialog.setCustomTitle(title);
        dialog.setPositiveButton("LOGAR", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String login = editTextLogin.getText().toString();
                String senha = editTextSenha.getText().toString();
                Log.i("info", "***************************** login: "+login+" e a senha é: "+senha);
                setToast("o login foi: "+login+"\n a senha foi: "+senha);

            }
        });
        dialog.setNegativeButton("SAIR", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();
    }



    public void getAlertListaSimples(){
        TextView title = new TextView(getContext());
        title.setText("Dialog Lista Selecao");
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setTextSize(20);
        title.setHeight(150);
        title.setBackgroundColor(Color.rgb(47,79,79));



        AlertDialog.Builder mDialog = new AlertDialog.Builder(getContext());
        mDialog.setCustomTitle(title);
        String[] produtos = { "Base Ruby Rose", "Corretivo", "Base MissRose", "Base Belle Angel", "Pó Compacto Ruby Rose"};
        mDialog.setItems(produtos, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i){
                    case 0:
                        setToast(" o produto selecionado foi: "+produtos[i]);
                    case 1:
                        setToast(" o produto selecionado foi: "+produtos[i]);
                    case 2:
                        setToast(" o produto selecionado foi: "+produtos[i]);
                    case 3:
                        setToast(" o produto selecionado foi: "+produtos[i]);
                    case 4:
                        setToast(" o produto selecionado foi: "+produtos[i]);
                    case 5:
                        setToast(" o produto selecionado foi: "+produtos[i]);

                        break;
                    default:
                }
                Log.i(" Dialog ", "***********************A chave capiturada foi "+i);
            }

        });

        AlertDialog dialog = mDialog.create();
        dialog.show();

    }

    public void getAlertListView(){

        String[] produtos = { "Base Ruby Rose", "Corretivo", "Base MissRose", "Base Belle Angel", "Pó Compacto Ruby Rose"};

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());

        LayoutInflater inflater = getLayoutInflater();

        View view = (View) inflater.inflate(R.layout.liste_view_customizado, null);

        alertDialog.setView(view);

        alertDialog.setTitle("lista de Produtos");

        ListView listview = (ListView) view.findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,produtos);

        listview.setAdapter(adapter);

        alertDialog.show();

    }

    public void getAlestLista(){
        TextView title = new TextView(getContext());
        title.setText("Alerta Recyclerview Lista\"");
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setTextSize(20);
        title.setHeight(150);
        title.setBackgroundColor(Color.rgb(47,79,79));



        List<Produtos> listaProdutos = new ArrayList<Produtos>();
        listaProdutos = this.mManagerProdutos.getListaProdutos();

        AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view  = (View) inflater.inflate(R.layout.layout_principal_recycler_view_alert_dialog,null);
        RecyclerView recyclerView =(RecyclerView)  view.findViewById(R.id.reclycle_view_produtos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ProdutoAdatpert adapter = new ProdutoAdatpert(listaProdutos);
        recyclerView.setAdapter(adapter);
        dialog.setCustomTitle(title);
        dialog.setCancelable(false);
        dialog.setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                setToast(" voce Clucou em confirmar");
            }
        });
        dialog.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                setToast("você cloucou em Cancelar");
            }
        });
        dialog.setView(view);
        dialog.show();

    }

    private void setToast(String msg){
        Toast toast = Toast.makeText(getContext(),msg,Toast.LENGTH_LONG);
        toast.show();

    }



}
