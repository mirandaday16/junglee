package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import com.mirandadayadkins.junglee.databinding.ActivityJunglePersonalBinding
import com.mirandadayadkins.junglee.navbar.NavBarButton

class PersonalJungleActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityJunglePersonalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityJunglePersonalBinding.inflate(layoutInflater)
        val rootView = binding.root
        val toolbar = binding.menuBar
        val profilePicture = binding.profilePicture
        val usernameDisplay = binding.username
        val plantsAndFollowersDisplay = binding.followersPlantsCount
        val navigationBarView = binding.navigationBar
        navigationBarView.setSelected(NavBarButton.MYJUNGLE)

        setSupportActionBar(toolbar)

        setContentView(rootView)
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




