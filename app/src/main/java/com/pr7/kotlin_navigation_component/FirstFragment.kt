package com.pr7.kotlin_navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_first, container, false)
        val textview:TextView=view.findViewById(R.id.textview1)
        textview.setOnClickListener {
           findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return view
    }


}