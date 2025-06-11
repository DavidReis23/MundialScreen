package com.example.mundialscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.VideoView
import androidx.activity.ComponentActivity

class QuartaActivity :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.quarta_tela)

        val botaoVoltar = findViewById<Button>(R.id.botaovoltar)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val caminho = "android.resource://${packageName}/${R.raw.video2}"
        videoView.setVideoPath(caminho)

        videoView.setOnPreparedListener { mp ->
            mp.isLooping = true //
        }

        videoView.start()

        botaoVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}