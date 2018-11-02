package ej2.mauro.app_estacionamiento;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class ActividadSeleccionEstablecimiento extends AppCompatActivity {

    Spinner Opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_seleccion_establecimiento);
        Opciones = (Spinner)findViewById(R.id.spinnerSelector);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Opciones, android.R.layout.simple_spinner_item);
        Opciones.setAdapter(adapter);
        activarBotones();


    }

    private void activarBotones() {
        Button btnConsultar = (Button) findViewById(R.id.btnConsultar);
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mostrarDatosEstablecimiento = new Intent(ActividadSeleccionEstablecimiento.this, ActividadMostrarDatosEstablecimiento.class);
                startActivity(mostrarDatosEstablecimiento);
            }
        });
    }
}
