package com.mirandadayadkins.junglee

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.LinearLayout
import com.mirandadayadkins.junglee.enums.NavBarButtons

// A navigation bar that navigates between the 5 major activities of the app

class NavBarView(context: Context, attributeSet: AttributeSet) : FrameLayout(context, attributeSet) {
    lateinit var myJungleButton: ImageButton
    lateinit var checklistButton: ImageButton
    lateinit var landingPageButton: ImageButton
    lateinit var environmentButton: ImageButton
    lateinit var friendsListButton: ImageButton

    init {
        inflate(context, R.layout.navigation_bar, this)
        myJungleButton = findViewById<ImageButton>(R.id.myJungleButton)
        checklistButton = findViewById<ImageButton>(R.id.checklistButton)
        landingPageButton = findViewById<ImageButton>(R.id.homeButton)
        environmentButton = findViewById<ImageButton>(R.id.environmentButton)
        friendsListButton = findViewById<ImageButton>(R.id.friendsButton)
    }

    fun setSelected(page: Enum<NavBarButtons>) {
        val selectedColor = resources.getColor(R.color.colorSurfaceDarkest)
        if (page == NavBarButtons.MYJUNGLE) {
            myJungleButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButtons.CHECKLIST) {
            checklistButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButtons.LANDING) {
            landingPageButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButtons.ENVIRONMENT) {
            environmentButton.setBackgroundColor(selectedColor)
        }
        else if (page == NavBarButtons.FRIENDS) {
            friendsListButton.setBackgroundColor(selectedColor)
        }
    }
}