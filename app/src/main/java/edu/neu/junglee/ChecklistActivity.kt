package edu.neu.junglee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import edu.neu.junglee.databinding.ActivityChecklistBinding

class ChecklistActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityChecklistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityChecklistBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
    }
}