package ej2.mauro.app_estacionamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ActividadMostrarDatosEstablecimiento extends AppCompatActivity {
    TextView tv_output;
    Random r;
    int output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_mostrar_datos_establecimiento);
        mostrarDatos();
        activarBotones();
        //r = new Random();
    }

    private void activarBotones() {
        Button btnVolver = (Button) findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        Button btnIrgps = (Button) findViewById(R.id.btnIrgps);
        btnIrgps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mostrarGps = new Intent(ActividadMostrarDatosEstablecimiento.this, ActividadMostrarGps.class);
                startActivity(mostrarGps);
            }
        });
    }

    private void mostrarDatos() {
        long ahora = System.currentTimeMillis();
        Date fecha = new Date(ahora);
        SimpleDateFormat dff = new SimpleDateFormat("dd/MM/yyyy");
        String datoFecha = dff.format(fecha);
        TextView tvDatoFecha = (TextView) findViewById(R.id.tvDatoFecha);
        tvDatoFecha.setText(datoFecha);
        tv_output = (TextView)findViewById(R.id.tv_output);
        output  = (int)(Math.random()*100)+1;//r.nextInt((150 - 1) + 1);
        tv_output.setText("" +output);



    }
}
