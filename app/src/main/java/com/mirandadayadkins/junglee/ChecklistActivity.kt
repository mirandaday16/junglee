package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityChecklistBinding

class ChecklistActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityChecklistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityChecklistBinding.inflate(layoutInflater)
        val view = binding.root
        // Navigation bar view instances
        val myJungleNavBarButton = binding.myJungleButton
        val landingPageNavBarButton = binding.homeButton
        val environmentNavBarButton = binding.environmentButton
        val friendsNavBarButton = binding.friendsButton

        // Setting onClickListeners for Navigation Bar Buttons

        myJungleNavBarButton.setOnClickListener {
            val myJungleIntent = Intent(this, PersonalJungleActivity::class.java)
            startActivity(myJungleIntent)
        }

        // Checklist button does nothing (user is already here!)

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