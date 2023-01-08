package com.example.tasktracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
/*
    private val homefrag = HomeFragment()
    private val datafrag = DataFragment()
    private val settingsfrag = SettingsFragment()
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //replaceFragment(homefrag)
//Home: open to Notes "To-Do List"
        findViewById<BottomNavigationView>(R.id.nav_view).setOnNavigationItemSelectedListener{
                item-> when(item.itemId){
                    R.id.home -> {
                        val menu_c = Intent(MainActivity@ this, NoteActivity::class.java)
                        startActivity(menu_c)
                    }

                    R.id.data ->{
                        val menu_a= Intent(MainActivity@this,DataActivity::class.java)
                        startActivity(menu_a)
                    }

                    R.id.settings ->{
                        val menu_b= Intent(MainActivity@this,SettingsActivity::class.java)
                        startActivity(menu_b)
                    }

        }
            true
        }
            /*
        val buttonClick = findViewById<Menu>(R.id.account_info)
        buttonClick.setOnClickListener {
            val intent = Intent(this, AccountInfoActivity::class.java)
            startActivity(intent)
        }*/
    }
    /*
    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment)
            transaction.commit()
        }
    }*/
    //remove comment to test the user info top button
/*
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.account_info -> {
            val intent = Intent(this, AccountInfoActivity::class.java)
            startActivity(intent)
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }*/
}