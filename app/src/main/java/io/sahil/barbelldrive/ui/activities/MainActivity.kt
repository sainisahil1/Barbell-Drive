package io.sahil.barbelldrive.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import io.sahil.barbelldrive.R
import io.sahil.barbelldrive.ui.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNavBar()
        initViews()
    }

    private fun initViews(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frame, HomeFragment(), HomeFragment::class.java.simpleName)
            .commit()
    }

    private fun setupBottomNavBar(){
        var bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_nav)
        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item: MenuItem ->
            when(item.itemId){
                R.id.nav_home -> {
                    initViews()
                    return@OnItemSelectedListener true
                }
            }
            false
        })
    }

}