package com.example.leson_39_drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.leson_39_drawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            navigationview.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.snaimper -> {
                        Toast.makeText(this@MainActivity,"Во Вьетнаме появился один снаймпер", Toast.LENGTH_SHORT).show()
                    }
                    R.id.tank -> {
                        Toast.makeText(this@MainActivity,"Во Вьетнаме появился один танк", Toast.LENGTH_SHORT).show()
                    }
                    R.id.camalet -> {
                        Toast.makeText(this@MainActivity,"Во Вьетнаме появился один самолёт", Toast.LENGTH_SHORT).show()
                    }
                }
                Open.closeDrawer(GravityCompat.START)
                true
            }
            open.setOnClickListener {
                Open.openDrawer(GravityCompat.START)
            }
        }
    }
}