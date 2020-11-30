package edu.neu.junglee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import edu.neu.junglee.databinding.ActivityFriendsListBinding

class FriendsListActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityFriendsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityFriendsListBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
    }
}