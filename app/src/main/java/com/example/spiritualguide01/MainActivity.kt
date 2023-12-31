package com.example.spiritualguide01

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.spiritualguide01.databinding.ActivityMainBinding
import com.example.spiritualguide01.home.cards.CardsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: CardsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Boiler Plate for implementing the BottomNavBar:
        val navView: BottomNavigationView = binding.navView
        navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard
            )
        )

        // get the MainViewModel:
        viewModel = ViewModelProvider(this)[CardsViewModel::class.java]

        // Setting up the NavBar with navController
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        // gives a "Home-function" to the ButtonNavBar-Icons:
        // (source: Andreas Ruppel in Slack-Thread: "009_modul3_kotlin" (02.11.23) - thank you very much :-D
        binding.navView.setOnItemSelectedListener { menuItem ->
            navController.currentBackStack.value.find { it.destination.id == menuItem.itemId }
                ?.let {
                    navController.popBackStack(menuItem.itemId, false)
                } ?: navController.navigate(menuItem.itemId)
            true
        }
    }

    // making the Back-Arrow work properly:
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}