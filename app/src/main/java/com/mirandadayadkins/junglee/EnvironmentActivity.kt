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
        val rootView = binding.root
        // Navigation bar view instances
        val myJungleNavBarButton = binding.myJungleButton
        val landingPageNavBarButton = binding.homeButton
        val checklistNavBarButton = binding.checklistButton
        val environmentNavBarButton = binding.environmentButton
        val friendsNavBarButton = binding.friendsButton

        val navBar = NavigationBar(this, savedInstanceState, myJungleNavBarButton,
                checklistNavBarButton, landingPageNavBarButton, environmentNavBarButton,
                friendsNavBarButton)

        setContentView(rootView)

    }
}