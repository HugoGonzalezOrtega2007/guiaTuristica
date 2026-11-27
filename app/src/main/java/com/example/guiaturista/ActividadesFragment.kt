package com.example.guiaturista

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class ActividadesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_actividades, container, false)

        view.findViewById<ConstraintLayout>(R.id.cardActividad1)?.setOnClickListener {
            startActivity(Intent(requireContext(), BritishMuseumActivity::class.java))
        }

        view.findViewById<ConstraintLayout>(R.id.cardActividad2)?.setOnClickListener {
            startActivity(Intent(requireContext(), HydeParkActivity::class.java))
        }

        return view
    }

    companion object {
        fun newInstance(tipo: String) = ActividadesFragment().apply {
            arguments = Bundle().apply { putString("TIPO", tipo) }
        }
    }
}