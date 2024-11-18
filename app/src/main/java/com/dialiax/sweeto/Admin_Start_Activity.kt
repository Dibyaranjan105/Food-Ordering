package com.dialiax.sweeto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dialiax.sweeto.databinding.ActivityAdminStartBinding

class Admin_Start_Activity : AppCompatActivity() {

    // Using View Binding
    private lateinit var binding: ActivityAdminStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityAdminStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Enable Edge-to-Edge experience
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up the button click listener to navigate to the next activity
        binding.button.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish() // Optional: close this activity after starting the next one
        }
    }
}
