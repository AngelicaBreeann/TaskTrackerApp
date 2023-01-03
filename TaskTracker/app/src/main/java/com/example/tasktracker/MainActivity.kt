package com.example.tasktracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val homefrag = HomeFragment()
    private val datafrag = DataFragment()
    private val settingsfrag = SettingsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homefrag)

        findViewById<BottomNavigationView>(R.id.nav_view).setOnNavigationItemSelectedListener{
                item-> when(item.itemId){
            R.id.data -> replaceFragment(datafrag)
            R.id.settings -> replaceFragment(settingsfrag)
            R.id.home -> replaceFragment(homefrag)
        }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment)
            transaction.commit()
        }
    }
}