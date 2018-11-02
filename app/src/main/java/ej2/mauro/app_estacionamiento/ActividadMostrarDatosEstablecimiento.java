package ej2.mauro.app_estacionamiento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActividadMostrarDatosEstablecimiento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_mostrar_datos_establecimiento);
        mostrarDatos();
    }

    private void mostrarDatos() {
        long ahora = System.currentTimeMillis();
        Date fecha = new Date(ahora);
        SimpleDateFormat dff = new SimpleDateFormat("dd/MM/yyyy");
        String datoFecha = dff.format(fecha);
        TextView tvDatoFecha = (TextView) findViewById(R.id.tvDatoFecha);
        tvDatoFecha.setText(datoFecha);

    }
}
