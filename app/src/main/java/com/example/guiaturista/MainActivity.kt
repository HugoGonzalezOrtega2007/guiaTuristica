package com.example.guiaturista

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ShapeableImageView>(R.id.imgLondon).setOnClickListener {
            val intent = Intent(this, LugaresActivity::class.java)
            startActivity(intent)
        }

        findViewById<ShapeableImageView>(R.id.imgComida).setOnClickListener {
            val intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }

        findViewById<ShapeableImageView>(R.id.imgCompras).setOnClickListener {
            val intent = Intent(this, ActividadesActivity::class.java)
            startActivity(intent)
        }
    }
}