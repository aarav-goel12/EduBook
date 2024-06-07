package com.example.edubook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class MathFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_math, container, false)
        val text = "GD"
        val action = MathFragmentDirections.actionMathFragmentToTestFragment(text)
        val rationalNumberButton = view.findViewById<Button>(R.id.RationalNumberId)
        rationalNumberButton.setOnClickListener {
            view.findNavController().navigate(action)
        }

        return view
    }
}
