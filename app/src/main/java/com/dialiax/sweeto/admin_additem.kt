package com.dialiax.sweeto

import android.net.Uri
import android.os.Bundle
import androidx.activity.result.ActivityResultContracts
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.dialiax.sweeto.databinding.ActivityAdminAddItemBinding

class AdminAddItemActivity : AppCompatActivity() {

    // ViewBinding initialization
    private lateinit var binding: ActivityAdminAddItemBinding

    // Register for the image picker activity result
    private val pickImage = registerForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri: Uri? ->
        // Handle the selected image URI
        uri?.let {
            binding.previewImage.setImageURI(it) // Set the image to ImageView (preview)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the ViewBinding
        binding = ActivityAdminAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Set the content view using the binding root

        // Set up click listener for the image select section
        binding.selectImageLayout.setOnClickListener {
            // Launch the image picker when the select image section is clicked
            pickImage.launch(ActivityResultContracts.PickVisualMedia.ImageOnly)
        }
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }
}

private fun Any.setOnClickListener(function: () -> Unit) {

}
