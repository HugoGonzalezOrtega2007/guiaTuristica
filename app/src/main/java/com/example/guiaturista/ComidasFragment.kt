package com.example.guiaturista

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class ComidasFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_comidas, container, false)

        view.findViewById<ConstraintLayout>(R.id.cardBoroughMarket)?.setOnClickListener {
            startActivity(Intent(requireContext(), BoroughMarketActivity::class.java))
        }

        view.findViewById<ConstraintLayout>(R.id.cardDishoom)?.setOnClickListener {
            startActivity(Intent(requireContext(), DishoomActivity::class.java))
        }

        return view
    }

    companion object {
        fun newInstance(tipo: String) = ComidasFragment().apply {
            arguments = Bundle().apply { putString("TIPO", tipo) }
        }
    }
}