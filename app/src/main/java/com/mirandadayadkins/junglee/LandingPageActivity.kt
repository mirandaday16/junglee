package com.mirandadayadkins.junglee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityLandingPageBinding
import com.mirandadayadkins.junglee.navbar.NavBarButton

class LandingPageActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        val rootView = binding.root
        val navigationBarView = binding.navigationBar
        navigationBarView.setSelected(NavBarButton.LANDING)

        setContentView(rootView)

    }
}