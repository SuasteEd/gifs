package com.example.tdpa_3p_pr01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnCalcular)
        val monto = findViewById<EditText>(R.id.txtMonto)

        btn.setOnClickListener {
            val intento = Intent(this, ViewActivity::class.java)
            intento.putExtra("monto", monto.text.toString())
            startActivity(intento)
        }

    }
}