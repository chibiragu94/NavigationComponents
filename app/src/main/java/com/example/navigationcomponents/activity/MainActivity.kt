package com.example.navigationcomponents.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.navigationcomponents.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment?


        val navController = navHostFragment?.navController

        NavigationUI.setupWithNavController(
            bottomNavigationView,
            navHostFragment!!.navController
        )

        // Will change the Action Bar title according to the Navigation
        NavigationUI.setupActionBarWithNavController(this,navController!!)


    }
}