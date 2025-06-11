package com.example.mundialscreen

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class SegundaActivity :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.segunda_tela)

        val imageView = findViewById<ImageView>(R.id.imagemEu)
        imageView.setImageResource(R.drawable.eu)

        val botaoVoltar = findViewById<Button>(R.id.botaovoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}