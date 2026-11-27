package com.example.guiaturista

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class LugarFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_lugar, container, false)

        view.findViewById<ConstraintLayout>(R.id.cardBigBen)?.setOnClickListener {
            startActivity(Intent(requireContext(), BigBenActivity::class.java))
        }

        view.findViewById<ConstraintLayout>(R.id.cardLondonEye)?.setOnClickListener {
            startActivity(Intent(requireContext(), LondonEyeActivity::class.java))
        }

        return view
    }

    companion object {
        fun newInstance(tipo: String) = LugarFragment().apply {
            arguments = Bundle().apply { putString("TIPO", tipo) }
        }
    }
}