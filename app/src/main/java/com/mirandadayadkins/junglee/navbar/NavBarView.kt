package com.mirandadayadkins.junglee.navbar

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import com.mirandadayadkins.junglee.*

// A navigation bar that navigates between the 5 major activities of the app

class NavBarView(context: Context, attributeSet: AttributeSet) : FrameLayout(context, attributeSet) {
    var myJungleButton: ImageButton
    var checklistButton: ImageButton
    var landingPageButton: ImageButton
    var environmentButton: ImageButton
    var friendsListButton: ImageButton

    init {
        inflate(context, R.layout.navigation_bar, this)
        myJungleButton = findViewById(R.id.myJungleButton)
        checklistButton = findViewById(R.id.checklistButton)
        landingPageButton = findViewById(R.id.homeButton)
        environmentButton = findViewById(R.id.environmentButton)
        friendsListButton = findViewById(R.id.friendsButton)

        // Set onClickListeners for each button to take the user to the appropriate activity
        myJungleButton.setOnClickListener {
            val myJungleIntent = Intent(context, PersonalJungleActivity::class.java)
            ContextCompat.startActivity(context, myJungleIntent, null)
        }

        checklistButton.setOnClickListener {
            val checklistIntent = Intent(context, ChecklistActivity::class.java)
            ContextCompat.startActivity(context, checklistIntent, null)
        }

        landingPageButton.setOnClickListener {
            val landingPageIntent = Intent(context, LandingPageActivity::class.java)
            ContextCompat.startActivity(context, landingPageIntent, null)
        }

        environmentButton.setOnClickListener {
            val environmentIntent = Intent(context, EnvironmentActivity::class.java)
            ContextCompat.startActivity(context, environmentIntent, null)
        }

        friendsListButton.setOnClickListener {
            val friendsListIntent = Intent(context, FriendsListActivity::class.java)
            ContextCompat.startActivity(context, friendsListIntent, null)
        }
    }

    fun setSelected(page: Enum<NavBarButton>) {
        val selectedColor = resources.getColor(R.color.colorSurfaceDarkest)
        if (page == NavBarButton.MYJUNGLE) {
            myJungleButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButton.CHECKLIST) {
            checklistButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButton.LANDING) {
            landingPageButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButton.ENVIRONMENT) {
            environmentButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButton.FRIENDS) {
            friendsListButton.setBackgroundColor(selectedColor)
        }
    }
}