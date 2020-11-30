package edu.neu.junglee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import edu.neu.junglee.databinding.ActivityJunglePersonalBinding

class PersonalJungleActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityJunglePersonalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityJunglePersonalBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
    }
}