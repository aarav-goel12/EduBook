package com.example.edubook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

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
        val chapter1 = view.findViewById<Button>(R.id.Chapter1ButtonId)
        val chapter2 = view.findViewById<Button>(R.id.Chapter2ButtonId)
        val chapter3 = view.findViewById<Button>(R.id.Chapter3ButtonId)
        val chapter4 = view.findViewById<Button>(R.id.Chapter4ButtonId)
        val chapter5 = view.findViewById<Button>(R.id.Chapter5ButtonId)

        subName.text = arguments?.getString("sub_name")
        chapter1.text = arguments?.getString("chap1")
        chapter2.text = arguments?.getString("chap2")
        chapter3.text = arguments?.getString("chap3")
        chapter4.text = arguments?.getString("chap4")
        chapter5.text = arguments?.getString("chap5")

        return view
    }
}