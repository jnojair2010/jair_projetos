package br.com.jair.alertadialogopersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.com.jair.alertadialogopersonalizado.manager.comunicaoAndroid.DialogPersonalizado;
import br.com.jair.alertadialogopersonalizado.model.Funcionario;

public class MainActivity extends AppCompatActivity {

    private Funcionario funcionario = new Funcionario();

    Button btnAlert, btnAlertSimples, btnListaAlertDialog, listaCustomizado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogPersonalizado dialog = new DialogPersonalizado(this);
        btnAlert = (Button) findViewById(R.id.btnAlert);
        btnAlertSimples = (Button) findViewById(R.id.btnDialogSimples);
        btnListaAlertDialog= (Button) findViewById(R.id.btnLista);
        listaCustomizado = (Button) findViewById(R.id.btnListaCustomizada);

        listaCustomizado.setOnClickListener(e->{
            dialog.getAlestLista();
        });

        btnListaAlertDialog.setOnClickListener(e->{
            dialog.getAlertListaSimples();
        });

        btnAlertSimples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.getMDialogSimples();
            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.getDialogPersonalizado();
                }
        });


    }

    private static class ViewHolder{


    }




}