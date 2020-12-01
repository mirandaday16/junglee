package com.mirandadayadkins.junglee

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat.startActivity

// Appears at the bottom of most Activity layouts (major Activities) and allows navigation between
// 5 major activities: My Jungle, Checklist, Landing Page, Environment, and Friends List

class NavigationBar(context: Context, savedInstanceState: Bundle?, myJungleButton: ImageButton,
                    checklistButton: ImageButton, landingPageButton: ImageButton,
                    environmentButton: ImageButton, friendsListButton: ImageButton) {

    var buttonMyJungleActivity: ImageButton
    var buttonChecklistActivity: ImageButton
    var buttonLandingPageActivity: ImageButton
    var buttonEnvironmentActivity: ImageButton
    var buttonFriendsListActivity: ImageButton

    init {
        buttonMyJungleActivity = myJungleButton
        buttonChecklistActivity = checklistButton
        buttonLandingPageActivity = landingPageButton
        buttonEnvironmentActivity = environmentButton
        buttonFriendsListActivity = friendsListButton

        // Set onClickListeners for each button to take the user to the appropriate activity
        buttonMyJungleActivity.setOnClickListener {
            val myJungleIntent = Intent(context, PersonalJungleActivity::class.java)
            startActivity(context, myJungleIntent, savedInstanceState)
        }

        buttonChecklistActivity.setOnClickListener {
            val checklistIntent = Intent(context, ChecklistActivity::class.java)
            startActivity(context, checklistIntent, savedInstanceState)
        }

        buttonLandingPageActivity.setOnClickListener {
            val landingPageIntent = Intent(context, LandingPageActivity::class.java)
            startActivity(context, landingPageIntent, savedInstanceState)
        }

        buttonEnvironmentActivity.setOnClickListener {
            val environmentIntent = Intent(context, EnvironmentActivity::class.java)
            startActivity(context, environmentIntent, savedInstanceState)
        }

        buttonFriendsListActivity.setOnClickListener {
            val friendsListIntent = Intent(context, FriendsListActivity::class.java)
            startActivity(context, friendsListIntent, savedInstanceState)
        }

    }

}