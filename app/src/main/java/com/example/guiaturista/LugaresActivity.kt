package com.example.guiaturista

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class LugaresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_lugar)

        findViewById<ConstraintLayout>(R.id.cardBigBen)?.setOnClickListener {
            startActivity(Intent(this, BigBenActivity::class.java))
        }

        findViewById<ConstraintLayout>(R.id.cardLondonEye)?.setOnClickListener {
            startActivity(Intent(this, LondonEyeActivity::class.java))
        }
    }
}