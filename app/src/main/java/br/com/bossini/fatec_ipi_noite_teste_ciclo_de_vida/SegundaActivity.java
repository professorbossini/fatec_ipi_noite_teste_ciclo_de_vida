package br.com.bossini.fatec_ipi_noite_teste_ciclo_de_vida;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SegundaActivity extends AppCompatActivity {

    private static final String TAG = "ciclodevida";

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "SegundaActivity.onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SegundaActivity.onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SegundaActivity.onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "SegundaActivity.onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "SegundaActivity.onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SegundaActivity.onStart");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Log.i(TAG, "SegundaActivity.onCreate");
    }
}
