package com.oukoda.ore_ore_browser

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, intent?.dataString ?: "No data", Toast.LENGTH_LONG).show()
        finish()
    }
}