package com.example.guiaturista

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class ComidasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_comidas)

        findViewById<ConstraintLayout>(R.id.cardBoroughMarket)?.setOnClickListener {
            startActivity(Intent(this, BoroughMarketActivity::class.java))
        }

        findViewById<ConstraintLayout>(R.id.cardDishoom)?.setOnClickListener {
            startActivity(Intent(this, DishoomActivity::class.java))
        }
    }
}