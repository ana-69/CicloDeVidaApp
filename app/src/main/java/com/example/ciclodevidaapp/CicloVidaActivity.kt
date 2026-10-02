package com.example.ciclodevidaapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CicloVidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("Ciclo", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Ciclo", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Ciclo", "onPause")
    }


    override fun onStop() {
        super.onStop()
        Log.d("Ciclo", "onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo", "onRestart")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo", "onDestroy")
    }

}