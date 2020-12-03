package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        val rootView = binding.root
        val usernameField = binding.usernameInput
        val locationField = binding.locationInput
        val profilePicButton = binding.imageButton
        val saveButton = binding.saveButton

        setContentView(rootView)

        // Setting onClickListener for Save Button -- save profile data in Firebase DB and return to My Jungle Activity
        saveButton.setOnClickListener {
            // TODO: save updated profile data in Firebase
            val myJungleIntent = Intent(this, PersonalJungleActivity::class.java)
            startActivity(myJungleIntent)
        }

    }
}