package com.submission.goodbooks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view
        setContentView(R.layout.activity_about)

        // Set action bar title and enable the up button
        supportActionBar?.apply {
            title = "About Developer"
            setDisplayHomeAsUpEnabled(true)
        } ?: throw IllegalStateException("ActionBar is null")
    }

    // Handle up navigation
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
