package com.pr.kotlin_navigation_component.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.pr.kotlin_navigation_component.MainActivity
import com.pr.kotlin_navigation_component.R
import com.pr.kotlin_navigation_component.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
  lateinit var binding: FragmentBlankBinding
     val TAG = "PR7"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBlankBinding.inflate(inflater, container, false)

        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle=Bundle()
        bundle.putString("key","axaxax")
        val navController=Navigation.findNavController(view)

        binding.button1f1.setOnClickListener {
           navController.navigate(R.id.action_blankFragment_to_blankFragment2,bundle)
        }
    }


}