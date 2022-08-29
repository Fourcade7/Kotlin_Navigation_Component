package com.pr.kotlin_navigation_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navController=Navigation.findNavController(this,R.id.nav_host)

        //call to fragment from Activity
        //navController.navigate(R.id.blankFragment2)
    }
}