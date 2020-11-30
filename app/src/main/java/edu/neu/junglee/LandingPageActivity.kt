package edu.neu.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import edu.neu.junglee.databinding.ActivityLandingPageBinding

class LandingPageActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        val view = binding.root
        // Navigation bar view instances
        val myJungleNavBarButton = binding.myJungleButton
        val checklistNavBarButton = binding.checklistButton
        val environmentNavBarButton = binding.environmentButton
        val friendsNavBarButton = binding.friendsButton

        // Setting onClickListeners for Navigation Bar Buttons
        myJungleNavBarButton.setOnClickListener {
            val myJungleIntent = Intent(this, PersonalJungleActivity::class.java)
            startActivity(myJungleIntent)
        }

        checklistNavBarButton.setOnClickListener {
            val checklistIntent = Intent(this, ChecklistActivity::class.java)
            startActivity(checklistIntent)
        }

        // Landing page button does nothing (user is already here!)

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