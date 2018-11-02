package ej2.mauro.app_estacionamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActividadPrincipal extends AppCompatActivity {
    private String usuario;
    private String clave;
    private long ahora;
    private String minutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
        activarBotones();
    }

    private void activarBotones() {
        Button btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionBtnIngresar();
            }
        });
    }

    private void accionBtnIngresar() {
        usuario = ((EditText) findViewById(R.id.ingresoUsuario)).getText().toString().trim();
        clave = ((EditText) findViewById(R.id.ingresoClave)).getText().toString();

        ahora = System.currentTimeMillis();

        Date fecha = new Date(ahora);
        SimpleDateFormat sdf = new SimpleDateFormat("mm");
        minutos = sdf.format(fecha);

        if(usuario.equals("") || usuario.length()<3 || !clave.equals(minutos)){
            Toast.makeText(getApplicationContext(), "Ingreso Incorrecto", Toast.LENGTH_SHORT).show();

        }else{
            Intent seleccionEstablecimiento = new Intent(ActividadPrincipal.this, ActividadSeleccionEstablecimiento.class);
            seleccionEstablecimiento.putExtra("usuario", usuario);
            startActivity(seleccionEstablecimiento);
        }


    }
}


