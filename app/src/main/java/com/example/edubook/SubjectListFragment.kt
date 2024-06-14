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
        bundle.putString("chap1","XYZZGD")
        bundle.putString("chap2","MECHANICS")
        bundle.putString("chap3","LINEAR EQUAVREVWERVWETION")
        bundle.putString("chap4","BINOMIAL XCQWECQWEEOREM")
        bundle.putString("chap5","TRIGONEVEWVRY")
//        view.findNavController().navigate(R.id.action_subjectListFragment_to_physicsFragment)
    view.findNavController().navigate(R.id.action_subjectListFragment_to_subjectFragment,bundle)
    }
    val chemistryButton = view.findViewById<Button>(R.id.ChemistryId)
    chemistryButton.setOnClickListener {
        view.findNavController().navigate(R.id.action_subjectListFragment_to_chemistryFragment)
    }
    val cSButton = view.findViewById<Button>(R.id.CSId)
    chemistryButton.setOnClickListener {
        view.findNavController().navigate(R.id.action_subjectListFragment_to_computerScienceFragment)
    }
    return view
    }
}
