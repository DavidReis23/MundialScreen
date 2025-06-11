package com.example.mundialscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class TerceiraActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terceira_tela)

        val botaoBuscar = findViewById<Button>(R.id.botaoBuscar)
        val editTextTime3 = findViewById<EditText>(R.id.editTextTime3)
        val textoResultado = findViewById<TextView>(R.id.textoResultado)
        val imagemProfessor = findViewById<ImageView>(R.id.imagemProfessor)
        val botaoLimpar = findViewById<Button>(R.id.botaoLimpar)
        val botaoVoltar = findViewById<Button>(R.id.botaovoltar)

        botaoBuscar.setOnClickListener {
            val nomeProfessor = editTextTime3.text.toString().trim()

            if (nomeProfessor.equals("Saulo", ignoreCase = true)) {
                textoResultado.text = "Saulo, professor de Estrutura de dados."
                imagemProfessor.setImageResource(R.drawable.saulo)
                imagemProfessor.visibility = View.VISIBLE
            } else if (nomeProfessor.equals("Lucas", ignoreCase = true)) {
                textoResultado.text = "Lucas, professor de Interação Humana-Computador."
                imagemProfessor.setImageResource(R.drawable.lucas)
                imagemProfessor.visibility = View.VISIBLE
            } else if (nomeProfessor.equals("Julio", ignoreCase = true)) {
                textoResultado.text = "Júlio, professor de Desenvolvimento de Mobile."
                imagemProfessor.setImageResource(R.drawable.julio)
                imagemProfessor.visibility = View.VISIBLE
            } else if (nomeProfessor.equals("Reginaldo", ignoreCase = true)) {
                textoResultado.text = "Reginaldo, professor de Programação Web I."
                imagemProfessor.setImageResource(R.drawable.reginaldo)
                imagemProfessor.visibility = View.VISIBLE
            } else if (nomeProfessor.equals("Jussara", ignoreCase = true)) {
                textoResultado.text = "Jussara, professora de Sistema Operacionais."
                imagemProfessor.setImageResource(R.drawable.jussara)
                imagemProfessor.visibility = View.VISIBLE
            } else if (nomeProfessor.equals("Anelise", ignoreCase = true)) {
                textoResultado.text = "Anelise, professora de Gestão de Projetos."
                imagemProfessor.setImageResource(R.drawable.anelise)
                imagemProfessor.visibility = View.VISIBLE
            } else {
                textoResultado.text = "Professor(a) não encontrado, por favor tente novamente!"
                imagemProfessor.visibility = View.GONE
            }
        }

        botaoLimpar.setOnClickListener {
            editTextTime3.text.clear()
            textoResultado.text = ""
            imagemProfessor.visibility = View.GONE
        }

        botaoVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
