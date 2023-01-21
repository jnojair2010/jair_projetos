package br.com.jair.alertadialogopersonalizado.manager.comunicaoAndroid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

import br.com.jair.alertadialogopersonalizado.R;

public class DialogPersonalizado extends AlertDialog {


    public DialogPersonalizado(Context context) {
        super(context);


    }

    protected DialogPersonalizado(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected DialogPersonalizado(Context context, int themeResId) {
        super(context, themeResId);
    }

    public void getDialogPersonalizado(){


        AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());

        LayoutInflater inflater = LayoutInflater.from(getContext());
        final View layoutCustomizado  = getLayoutInflater().inflate(R.layout.alert_dialog_personalizado_login,null);
        dialog.setView(layoutCustomizado);
        EditText editTextLogin = (EditText) layoutCustomizado.findViewById(R.id.edtLogin);
        EditText editTextSenha = (EditText) layoutCustomizado.findViewById(R.id.edtSenha);

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

      //  dialog.create();
        dialog.show();


    }

    private void setToast(String msg){
        Toast toast = Toast.makeText(getContext(),msg,Toast.LENGTH_LONG);
        toast.show();

    }

}
