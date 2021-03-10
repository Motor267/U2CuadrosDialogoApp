package mx.edu.itl.c17130848.u2cuadrosdialogoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //----------------------------------------------------------------------------------------------

    public void btnToastCortoClick( View v ) {
        Toast.makeText( this, "Toast corto", Toast.LENGTH_SHORT ).show();
    }

    //----------------------------------------------------------------------------------------------

    public void btnToastLargoClick( View v ) {
        Toast.makeText(this, "Toast largo", Toast.LENGTH_LONG ).show();
    }

    //----------------------------------------------------------------------------------------------

    public void btnSnackClick( View v ) {
        LinearLayout linearLayout = (LinearLayout) findViewById( R.id.linearLayoutRaiz );

        Snackbar.make(linearLayout, "Esto es un Snackbar", Snackbar.LENGTH_SHORT).show();
    }

    //----------------------------------------------------------------------------------------------
    //Cuadro de dialogo basico
    public void btnDialogoBasicoClick( View v ) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage( "Cuadro de dialogo basico" ).create().show();
    }

    //----------------------------------------------------------------------------------------------
    //Cuadro de dialogo basico con boton OK
    public void btnDialogoBasicoOkClick( View v ) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Android")
                .setMessage("Dialogo basico con boton OK")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mostrarToast("Click en ACEPTAR");
                    }
                })
                .create()
                .show();
    }

    //----------------------------------------------------------------------------------------------
    //Cuadro de dialogo basico con boton OK y CANCEL
    public void btnDialgoBasicoOkCancelClick ( View v ){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Android")
                .setMessage("Dialogo basico con boton OK y CANCEL")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mostrarToast("Click en ACEPTAR");
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                    }
                })
                .create()
                .show();
    }

    //----------------------------------------------------------------------------------------------

    public void mostrarToast ( String mensaje ) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}