package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityNewAccountBinding

class NewAccountActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityNewAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityNewAccountBinding.inflate(layoutInflater)
        val view = binding.root
        val emailField = binding.emailInput
        val usernameField = binding.usernameInput
        val passwordField = binding.passwordInput
        val profilePicButton = binding.imageButton
        val saveButton = binding.saveButton

        // Setting up On Click Listener for Profile Picture button
        profilePicButton.setOnClickListener {
            // TODO: Allow user to choose a photo from their gallery
            // TODO: Change image to show selected photo
        }

        // Setting up On Click Listener for Save Button - will save entered information in Firebase and take user to Landing Page Activity
        saveButton.setOnClickListener {
            // TODO: Save data in Firebase
            // Start Landing Page Activity
            val landingPageIntent = Intent(this, LandingPageActivity::class.java)
            startActivity(landingPageIntent)
        }

        setContentView(view)

    }
}