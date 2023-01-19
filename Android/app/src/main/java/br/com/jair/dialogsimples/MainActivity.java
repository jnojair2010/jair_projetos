package br.com.jair.dialogsimples;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button; // this imports class button

import br.com.jair.dialogsimples.manager.ComunicaoAndroid.Dialog;


public class MainActivity extends AppCompatActivity {

       private Button btnDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) { /// cria a interface do android
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialog mDialog = new Dialog(this);

        btnDialog = (Button) findViewById(R.id.DialogSimples);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(" Dialog","******************** entrou no clic");
                mDialog.getMDialogSimples();

            }
        });


    }

    private void getDialogSimples(){            // dialog dentro da classe principal menos recomendado a melhor opção
                                                // é criar uma classe de dialog personalizar cada dialog e incrementar como metodos diferentes

        AlertDialog.Builder mDialog = new AlertDialog.Builder(this);  // esta o this na build do dialog é fundamento para não promover erros
        mDialog.setTitle("Dialogo Alertado");
        mDialog.setMessage("Dialog");
        mDialog.setCancelable(false);
        mDialog.setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                    // dentro deste metodo vc capita a mensagem de clic no Confirmar a partir daqui execulta ou chama qualquer funcção da classe
            }
        });
        mDialog.setNegativeButton("NEGAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // dentro deste metodo vc capita a mensagem de clic no Negar a partir daqui execulta ou chama qualquer funcção da classe
            }

        });
        mDialog.create();
        mDialog.show();

    }


}