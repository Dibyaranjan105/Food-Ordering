package com.dialiax.sweeto

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ArrayAdapter
import com.google.android.material.textfield.TextInputLayout
import android.widget.AutoCompleteTextView

class AdminSignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_admin_sign_up)

        // Apply window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up AutoCompleteTextView for location
        val textInputLayout = findViewById<TextInputLayout>(R.id.textInputLayout)
        val autoCompleteTextView = textInputLayout.editText as AutoCompleteTextView
        val locations = arrayOf("Jaipur", "Delhi", "Mumbai", "Bangalore", "Chennai")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, locations)
        autoCompleteTextView.setAdapter(adapter)
    }
}