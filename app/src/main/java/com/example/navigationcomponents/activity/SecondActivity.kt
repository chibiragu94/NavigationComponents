package com.example.navigationcomponents.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import com.example.navigationcomponents.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.second_nav_host) as NavHostFragment?

        val navController = navHostFragment?.navController


        // Destination Change Listener
        navController?.addOnDestinationChangedListener { _, destination, _ ->
            var title = ""
            when(destination.id){
                R.id.fourthFragment2 ->{
                    title = "Four"
                }
                R.id.action_fourthFragment2_to_sixthFragment ->{
                    title = "Six"
                }
                R.id.action_sixthFragment_to_seventhFragment ->{
                    title = "Seven"
                }
                R.id.action_seventhFragment_to_fifthFragment2 ->{
                    title = "five"
                }
            }

            supportActionBar?.title = title

        }


    }
}