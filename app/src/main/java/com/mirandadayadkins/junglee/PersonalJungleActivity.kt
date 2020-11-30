package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityJunglePersonalBinding

class PersonalJungleActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityJunglePersonalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityJunglePersonalBinding.inflate(layoutInflater)
        val view = binding.root
        // Navigation bar view instances
        val checklistNavBarButton = binding.checklistButton
        val landingPageNavBarButton = binding.homeButton
        val environmentNavBarButton = binding.environmentButton
        val friendsNavBarButton = binding.friendsButton

        // Setting onClickListeners for Navigation Bar Buttons

        // My Jungle button does nothing (user is already here!)

        checklistNavBarButton.setOnClickListener {
            val checklistIntent = Intent(this, ChecklistActivity::class.java)
            startActivity(checklistIntent)
        }

        landingPageNavBarButton.setOnClickListener {
            val landingPageIntent = Intent(this, LandingPageActivity::class.java)
            startActivity(landingPageIntent)
        }
        environmentNavBarButton.setOnClickListener {
            val environmentIntent = Intent(this, EnvironmentActivity::class.java)
            startActivity(environmentIntent)
        }

        friendsNavBarButton.setOnClickListener {
            val friendsListIntent = Intent(this, FriendsListActivity::class.java)
            startActivity(friendsListIntent)
        }

        setContentView(view)
    }
}