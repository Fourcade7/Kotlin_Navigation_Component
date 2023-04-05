package com.pr7.kotlin_navigation_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.pr7.kotlin_navigation_component.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        button=findViewById(R.id.button1)




        button.setOnClickListener {
            findNavController(R.id.fragment).navigate(R.id.firstFragmentt)
        }

    }


}