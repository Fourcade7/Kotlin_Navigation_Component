package com.pr.kotlin_navigation_component.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pr.kotlin_navigation_component.MainActivity
import com.pr.kotlin_navigation_component.R
import com.pr.kotlin_navigation_component.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

    lateinit var binding: FragmentBlank2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBlank2Binding.inflate(inflater, container, false)

        binding.textview1.text=arguments?.getString("key")
        binding.button2f2.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_blankFragment2_to_blankFragment)
        }

        binding.button1f2.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_blankFragment2_to_blankFragment3)

        }

        return binding.root
    }


}