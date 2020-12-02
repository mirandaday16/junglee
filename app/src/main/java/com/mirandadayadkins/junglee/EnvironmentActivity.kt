package com.mirandadayadkins.junglee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityEnvironmentBinding
import com.mirandadayadkins.junglee.enums.NavBarButtons

class EnvironmentActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityEnvironmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityEnvironmentBinding.inflate(layoutInflater)
        val rootView = binding.root
        val navigationBarView = binding.navigationBar
        navigationBarView.setSelected(NavBarButtons.ENVIRONMENT)

        val navBar = NavigationBar(this, savedInstanceState, navigationBarView)

        setContentView(rootView)

    }
}