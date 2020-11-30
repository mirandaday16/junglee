package edu.neu.junglee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import edu.neu.junglee.databinding.ActivityEnvironmentBinding

class EnvironmentActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityEnvironmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityEnvironmentBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

    }
}