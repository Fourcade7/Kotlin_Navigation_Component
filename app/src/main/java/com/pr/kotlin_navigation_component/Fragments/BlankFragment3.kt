package com.pr.kotlin_navigation_component.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pr.kotlin_navigation_component.MainActivity
import com.pr.kotlin_navigation_component.R
import com.pr.kotlin_navigation_component.databinding.FragmentBlank3Binding


class BlankFragment3 : Fragment() {

    lateinit var binding: FragmentBlank3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBlank3Binding.inflate(inflater, container, false)
        binding.button1f3.setOnClickListener {

            (activity as MainActivity).navController.navigate(R.id.action_blankFragment3_to_blankFragment2)

        }


        return binding.root
    }


}