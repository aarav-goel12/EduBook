package com.example.edubook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class SubjectFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chapter, container, false)
        var subName = view.findViewById<TextView>(R.id.SubjectNameId)
        var chapter1 = view.findViewById<Button>(R.id.Chapter1ButtonId)
        var chapter2 = view.findViewById<Button>(R.id.Chapter2ButtonId)
        var chapter3 = view.findViewById<Button>(R.id.Chapter3ButtonId)
        var chapter4 = view.findViewById<Button>(R.id.Chapter4ButtonId)
        var chapter5 = view.findViewById<Button>(R.id.Chapter5ButtonId)

        subName.text = arguments?.getString("sub_name")
        chapter1.text = arguments?.getString("chap1")
        chapter2.text = arguments?.getString("chap2")
        chapter3.text = arguments?.getString("chap3")
        chapter4.text = arguments?.getString("chap4")
        chapter5.text = arguments?.getString("chap5")

        chapter1.setOnClickListener {
            view.findNavController().navigate(R.id.action_subjectFragment_to_ratioanalNumFragment)
        }
      chapter2.setOnClickListener{
          view.findNavController().navigate(R.id.action_subjectFragment_to_algebraChapterFragment)
      }
        chapter3.setOnClickListener{
            view.findNavController().navigate(R.id.action_subjectFragment_to_linearEquationsChapterFragment)
        }
        chapter4.setOnClickListener {
            view.findNavController().navigate(R.id.action_subjectFragment_to_bionomialTheorumChapterFragment)
        }
        chapter5.setOnClickListener {
            view.findNavController().navigate(R.id.action_subjectFragment_to_trigonometryChapterFragment2)
        }
        return view
    }
}