package com.example.sharesong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.view.animation.Animation
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logo = findViewById<ImageView>(R.id.logo)

        val rotateAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation)

        // Set animation properties
        rotateAnimation.duration = 2500
        // Add more animation properties if needed

        // Start the animation
        logo.startAnimation(rotateAnimation)
    }
    
}