package com.example.guiaturista

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class ActividadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_actividades)

        findViewById<ConstraintLayout>(R.id.cardActividad1)?.setOnClickListener {
            startActivity(Intent(this, BritishMuseumActivity::class.java))
        }

        findViewById<ConstraintLayout>(R.id.cardActividad2)?.setOnClickListener {
            startActivity(Intent(this, HydeParkActivity::class.java))
        }
    }
}