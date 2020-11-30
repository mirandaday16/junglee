package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

import com.mirandadayadkins.junglee.databinding.ActivityJunglePersonalBinding

class PersonalJungleActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityJunglePersonalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityJunglePersonalBinding.inflate(layoutInflater)
        val view = binding.root
        val toolbar = binding.menuBar
        val profilePicture = binding.profilePicture
        val usernameDisplay = binding.username
        val plantsAndFollowersDisplay = binding.followersPlantsCount
        // Navigation bar view instances
        val checklistNavBarButton = binding.checklistButton
        val landingPageNavBarButton = binding.homeButton
        val environmentNavBarButton = binding.environmentButton
        val friendsNavBarButton = binding.friendsButton

        setSupportActionBar(toolbar)

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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.profile_options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // OnClick function for Menu Toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.edit_profile_menu_item -> {
                val editProfileIntent = Intent(this, EditProfileActivity::class.java)
                startActivity(editProfileIntent)
                true
            }
            R.id.log_out_menu_item -> {
                // TODO: Log user out via Firebase and delete Toast below
                Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show()
                true
            }
        }
        return super.onOptionsItemSelected(item)

    }
}




