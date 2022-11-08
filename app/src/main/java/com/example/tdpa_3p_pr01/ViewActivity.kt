package com.example.tdpa_3p_pr01

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val bundle = intent.extras
        val txtMonto = findViewById<TextView>(R.id.txtImporte)
        val importe = bundle?.getString("monto")
        val txtIva = findViewById<TextView>(R.id.txtIva)
        val iva = importe?.toInt()?.times(0.16)
        val total = iva?.plus(importe.toInt())
        val txtTotal = findViewById<TextView>(R.id.txtTotal)
        val gif = findViewById<ImageView>(R.id.gif)
        val img = findViewById<ImageView>(R.id.img)

        val urlSad:Uri = Uri.parse("https://media.tenor.com/yKmZfiDk68EAAAAM/baby-cute.gif")
        val urlHappy:Uri = Uri.parse("https://i.pinimg.com/originals/bc/91/0b/bc910bc0cac94fc2410044c0d02d7ed1.gif")
        val imgSad:Uri = Uri.parse("https://images.unsplash.com/photo-1589859762194-eaae75c61f64?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1000&q=80")
        val imgHappy:Uri = Uri.parse("https://img.freepik.com/vector-premium/fondo-amarillo-moderno-abstracto_42581-368.jpg?w=2000")
        txtIva.text = "Iva: $iva"
        txtMonto.text = "Importe: $importe"
        txtTotal.text = "Total: $total"

        if (total != null) {
            if(total > 100){
                Glide.with(applicationContext).load(urlSad).into(gif)
                Glide.with(applicationContext).load(imgSad).into(img)
            } else {
                Glide.with(applicationContext).load(urlHappy).into(gif)
                Glide.with(applicationContext).load(imgHappy).into(img)
            }
        }

    }
}