package com.example.edubook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        inflation: taking views from xml and it inflates them into a view hierarchy that
//        holds objects for each view that we have defined in the xml
//        textview---->inflate()---> View --> object of TextView
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        val proceedButton = view.findViewById<Button>(R.id.ProceedButtonId)
        proceedButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_welcomeFragment_to_subjectListFragment)
        }
        return view
    }
}