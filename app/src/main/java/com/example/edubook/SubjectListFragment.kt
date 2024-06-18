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
        val bundle = Bundle()
        bundle.putString("sub_name","MATHEMATICS")
        bundle.putString("chap1","RATIONAL NUMBERS")
        bundle.putString("chap2","ALGEBRA")
        bundle.putString("chap3","LINEAR EQUATION")
        bundle.putString("chap4","BINOMIAL THEOREM")
        bundle.putString("chap5","TRIGONOMETRY")
//        view.findNavController().navigate(R.id.action_subjectListFragment_to_mathFragment)
    view.findNavController().navigate(R.id.action_subjectListFragment_to_subjectFragment,bundle)
    }
    val physicsButton = view.findViewById<Button>(R.id.PhysicsId)
    physicsButton.setOnClickListener {
        val bundle = Bundle()
        bundle.putString("sub_name","PHYSICS")
        bundle.putString("chap1","MECHANICS")
        bundle.putString("chap2","ELECTROMAGNETISM")
        bundle.putString("chap3","OPTICS")
        bundle.putString("chap4","THERMODYNAMICS")
        bundle.putString("chap5","QUANTUM MAGNETISM")
//        view.findNavController().navigate(R.id.action_subjectListFragment_to_physicsFragment)
    view.findNavController().navigate(R.id.action_subjectListFragment_to_subjectFragment,bundle)
    }
    val chemistryButton = view.findViewById<Button>(R.id.ChemistryId)
    chemistryButton.setOnClickListener {
        val bundle = Bundle()
        bundle.putString("sub_name","CHEMISTRY")
        bundle.putString("chap1","MATERIAL SCIENCE")
        bundle.putString("chap2","ELECTROCHEMISTRY")
        bundle.putString("chap3","STATIC MECHANICS")
        bundle.putString("chap4","CHROMATOGRAPHY")
        bundle.putString("chap5","CHEMICAL INFORMATION SCIENCE")
//        view.findNavController().navigate(R.id.action_subjectListFragment_to_chemistryFragment)
        view.findNavController().navigate(R.id.action_subjectListFragment_to_subjectFragment,bundle)
    }
    val cSButton = view.findViewById<Button>(R.id.CSId)
    cSButton.setOnClickListener {
        val bundle = Bundle()
        bundle.putString("sub_name","COMPUTER SCIENCE")
        bundle.putString("chap1","COMPUTER GRAPHICS")
        bundle.putString("chap2","CRYPTOGRAPHY")
        bundle.putString("chap3","NETWORK SECURITY")
        bundle.putString("chap4","DATA STRUCTURES")
        bundle.putString("chap5","ARTIFICIAL INTELLIGENCE")
//        view.findNavController().navigate(R.id.action_subjectListFragment_to_computerScienceFragment)
        view.findNavController().navigate(R.id.action_subjectListFragment_to_subjectFragment,bundle)
    }
    return view
    }
}
