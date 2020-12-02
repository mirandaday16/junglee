package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityFriendsListBinding
import com.mirandadayadkins.junglee.enums.NavBarButtons

class FriendsListActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityFriendsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityFriendsListBinding.inflate(layoutInflater)
        val rootView = binding.root
        val navigationBarView = binding.navigationBar
        navigationBarView.setSelected(NavBarButtons.FRIENDS)


        val navBar = NavigationBar(this, savedInstanceState, navigationBarView)

        setContentView(rootView)
    }
}