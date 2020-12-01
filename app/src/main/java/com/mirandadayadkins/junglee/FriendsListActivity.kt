package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityFriendsListBinding

class FriendsListActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityFriendsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityFriendsListBinding.inflate(layoutInflater)
        val rootView = binding.root
        // Navigation bar view instances
        val myJungleNavBarButton = binding.myJungleButton
        val landingPageNavBarButton = binding.homeButton
        val environmentNavBarButton = binding.environmentButton
        val checklistNavBarButton = binding.checklistButton

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

        environmentNavBarButton.setOnClickListener {
            val environmentIntent = Intent(this, EnvironmentActivity::class.java)
            startActivity(environmentIntent)
        }

        // Friends button does nothing (user is already here!)

        setContentView(rootView)
    }
}