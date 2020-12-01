package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityLandingPageBinding

class LandingPageActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        val rootView = binding.root
        // Navigation bar view instances
        val myJungleNavBarButton = binding.myJungleButton
        val checklistNavBarButton = binding.checklistButton
        val landingPageNavBarButton = binding.homeButton
        val environmentNavBarButton = binding.environmentButton
        val friendsNavBarButton = binding.friendsButton

        val navBar = NavigationBar(this, savedInstanceState, myJungleNavBarButton,
                checklistNavBarButton, landingPageNavBarButton, environmentNavBarButton,
                friendsNavBarButton)

        setContentView(rootView)

    }
}