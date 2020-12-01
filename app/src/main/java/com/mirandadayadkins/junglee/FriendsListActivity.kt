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
        val friendsNavBarButton = binding.friendsButton

        val navBar = NavigationBar(this, savedInstanceState, myJungleNavBarButton,
                checklistNavBarButton, landingPageNavBarButton, environmentNavBarButton,
                friendsNavBarButton)

        setContentView(rootView)
    }
}