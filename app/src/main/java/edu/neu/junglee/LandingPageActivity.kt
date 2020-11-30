package edu.neu.junglee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import edu.neu.junglee.databinding.ActivityLandingPageBinding

class LandingPageActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

    }
}