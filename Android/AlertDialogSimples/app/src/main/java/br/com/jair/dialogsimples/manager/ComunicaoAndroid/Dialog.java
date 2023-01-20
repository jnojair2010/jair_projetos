package br.com.jair.dialogsimples.manager.ComunicaoAndroid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;

public class Dialog extends AlertDialog {

    public Dialog(Context context) {
        super(context);
    }

    protected Dialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected Dialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    public void getMDialogSimples(){
        Log.i(" Dialog","***************************** getMDialogSimples()");

        AlertDialog.Builder mDialog = new AlertDialog.Builder(getContext());  // esta o this na build do dialog é fundamento para não promover erros
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
