package com.oukoda.ore_ore_browser

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, intent?.dataString.toString(), Toast.LENGTH_LONG).show()
        finish()
    }
}