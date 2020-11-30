package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityEnvironmentBinding

class EnvironmentActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityEnvironmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityEnvironmentBinding.inflate(layoutInflater)
        val view = binding.root
        // Navigation bar view instances
        val myJungleNavBarButton = binding.myJungleButton
        val landingPageNavBarButton = binding.homeButton
        val checklistNavBarButton = binding.checklistButton
        val friendsNavBarButton = binding.friendsButton

        // Setting onClickListeners for Navigation Bar Buttons

        myJungleNavBarButton.setOnClickListener {
            val myJungleIntent = Intent(this, PersonalJungleActivity::class.java)
            startActivity(myJungleIntent)
        }

        checklistNavBarButton.setOnClickListener {
            val checklistIntent = Intent(this, ChecklistActivity::class.java)
            startActivity(checklistIntent)
        }

        landingPageNavBarButton.setOnClickListener {
            val landingPageIntent = Intent(this, LandingPageActivity::class.java)
            startActivity(landingPageIntent)
        }

        // Environment button does nothing (user is already here!)

        friendsNavBarButton.setOnClickListener {
            val friendsListIntent = Intent(this, FriendsListActivity::class.java)
            startActivity(friendsListIntent)
        }

        setContentView(view)

    }
}