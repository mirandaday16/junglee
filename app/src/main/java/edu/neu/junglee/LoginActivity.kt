package edu.neu.junglee

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

import edu.neu.junglee.databinding.ActivityLoginBinding;

class LoginActivity : AppCompatActivity() {

    // Set up ViewBinding for the layout
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting up binding instance and view instances
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        val logInButton = binding.logInButton
        val signUpButton = binding.signUpButton

        // Setting onClickListener for Log In Button - opens a dialog box to enter login credentials
        logInButton.setOnClickListener {
            showDialogBox()
        }

        setContentView(view)
    }

    /*
    // Helper functions:
    */

    // Opens dialog box for user to enter login credentials
    private fun showDialogBox() {
        // Creating a Linear Layout containing EditText fields for entering username and password
        val factory = LayoutInflater.from(this)
        val credentialsView = factory.inflate(R.layout.dialog_login, null)
        val emailField = credentialsView.findViewById<EditText>(R.id.emailEntryField)
        val passwordField = credentialsView.findViewById<EditText>(R.id.passwordEntryField)

        // Creating Alert Dialog using above layout
        val dialogBuilder = AlertDialog.Builder(this, R.style.AlertDialogCustom)
        dialogBuilder.setView(credentialsView)
                .setPositiveButton("Log In", DialogInterface.OnClickListener() { dialog, which ->
                    // Pass username and password entered by the user into Firebase for validation
                    val username: String = emailField.text.toString().trim { it <= ' ' }
                    val password = passwordField.text.toString().trim { it <= ' ' }
                    // TODO: Validate credentials using Firebase
                    // Send user to landing page activity
                    val landingPageIntent = Intent(this, LandingPageActivity::class.java)
                    startActivity(landingPageIntent)
                })
                .setNegativeButton("Cancel", null)
                .show()
    }

}