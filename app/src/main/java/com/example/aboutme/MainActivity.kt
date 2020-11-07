package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        val root = mainActivityBinding.root
        setContentView(root)
    }
}