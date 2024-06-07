package com.example.edubook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class SubjectListFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
// now we are shifting to exp branch
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_subject_list, container, false)
        val mathButton = view.findViewById<Button>(R.id.MathId)
    mathButton.setOnClickListener {
        view.findNavController().navigate(R.id.action_subjectListFragment_to_mathFragment)
    }
    val physicsButton = view.findViewById<Button>(R.id.PhysicsId)
    physicsButton.setOnClickListener {
        view.findNavController().navigate(R.id.action_subjectListFragment_to_physicsFragment)
    }
    val chemistryButton = view.findViewById<Button>(R.id.ChemistryId)
    chemistryButton.setOnClickListener {
        view.findNavController().navigate(R.id.action_subjectListFragment_to_chemistryFragment)
    }
    val cSButton = view.findViewById<Button>(R.id.CSId)
    cSButton.setOnClickListener {
        view.findNavController().navigate(R.id.action_subjectListFragment_to_computerScienceFragment)
    }
    return view
    }
}
