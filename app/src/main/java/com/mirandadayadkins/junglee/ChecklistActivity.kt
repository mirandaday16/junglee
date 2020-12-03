package com.mirandadayadkins.junglee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.mirandadayadkins.junglee.databinding.ActivityChecklistBinding
import com.mirandadayadkins.junglee.navbar.NavBarButton

class ChecklistActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityChecklistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityChecklistBinding.inflate(layoutInflater)
        val rootView = binding.root
        val navigationBarView = binding.navigationBar
        navigationBarView.setSelected(NavBarButton.CHECKLIST)

        setContentView(rootView)
    }
}