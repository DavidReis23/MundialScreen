package com.example.mundialscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val botaosobre = findViewById<Button>(R.id.botaosobre)
        val botaoprof = findViewById<Button>(R.id.botaoprof)
        val botaovideo = findViewById<Button>(R.id.botaovideo)

        botaosobre.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }

        botaoprof.setOnClickListener {
            val intent = Intent(this, TerceiraActivity::class.java)
            startActivity(intent)
        }

        botaovideo.setOnClickListener {
            val intent = Intent(this, QuartaActivity::class.java)
            startActivity(intent)
        }

        val editTextTime = findViewById<EditText>(R.id.editTextTime2)
        val botaoBuscar = findViewById<Button>(R.id.botaoBuscar)
        val textoResultado = findViewById<TextView>(R.id.textoResultado)
        val botaoImagem = findViewById<Button>(R.id.botaoVerImagem)
        val imagemMundial1 = findViewById<ImageView>(R.id.imagemMundial1)
        val botaoLimpar = findViewById<Button>(R.id.botaoLimpar)
        val botaoSobre = findViewById<Button>(R.id.botaosobre)

        botaoBuscar.setOnClickListener {
            val nomeTime = editTextTime.text.toString().trim() 
            var temMundial = false

        botaoBuscar.setOnClickListener {
            val nomeTime = editTextTime.text.toString().trim()

            if (nomeTime.equals("Santos", ignoreCase = true)) {
                    textoResultado.text = "O Santos tem 2 Intercontinental Cup em 1962 e 1963!"
                    imagemMundial1.setImageResource(R.drawable.santos)
                    imagemMundial1.visibility = View.VISIBLE
                } else if (nomeTime.equals("Flamengo", ignoreCase = true)) {
                    textoResultado.text = "O Flamengo tem 1 Intercontinental Cup em 1981!"
                    imagemMundial1.setImageResource(R.drawable.flamengo)
                    imagemMundial1.visibility = View.VISIBLE
                } else if (nomeTime.equals("Gremio", ignoreCase = true)) {
                    textoResultado.text = "O Grêmio tem 1 Intercontinental Cup em 1983!"
                    imagemMundial1.setImageResource(R.drawable.gremio)
                    imagemMundial1.visibility = View.VISIBLE
                } else if (nomeTime.equals("Sao Paulo", ignoreCase = true)) {
                    textoResultado.text = "O São Paulo tem 2 Intercontinental Cup em 1992 e 1993, e 1 FIFA Club World Cup em 2005!"
                    imagemMundial1.setImageResource(R.drawable.saopaulo)
                    imagemMundial1.visibility = View.VISIBLE
                } else if (nomeTime.equals("Internacional", ignoreCase = true)) {
                    textoResultado.text = "O Internacional tem 1 FIFA Club World Cup em 2006!"
                    imagemMundial1.setImageResource(R.drawable.inter)
                    imagemMundial1.visibility = View.VISIBLE
                } else if (nomeTime.equals("Corinthians", ignoreCase = true)) {
                    textoResultado.text = "O Corinthians tem 1 FIFA Club World Championship em 2000, e 1 FIFA Club World Cup 2010!"
                    imagemMundial1.setImageResource(R.drawable.corinthians)
                    imagemMundial1.visibility = View.VISIBLE
                } else if (nomeTime.equals("Palmeiras", ignoreCase = true)) {
                    textoResultado.text = "O Palmeiras não tem Mundial, 51 é pinga!"
                    imagemMundial1.setImageResource(R.drawable.palmeiras)
                    imagemMundial1.visibility = View.VISIBLE
                } else {
                    textoResultado.text = "Time não encontrado, por favor tente novamente!"
                    imagemMundial1.visibility = View.GONE
                }

                botaoLimpar.setOnClickListener {
                    editTextTime.text.clear()
                    textoResultado.text = ""
                    imagemMundial1.visibility = View.GONE
                    botaoImagem.visibility = View.GONE
                }
            }
        }
    }
}