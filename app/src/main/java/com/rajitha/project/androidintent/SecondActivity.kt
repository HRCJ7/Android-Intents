package com.rajitha.project.androidintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    var bt_two: Button? = null
    var bt_three: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        bt_two = findViewById<View>(R.id.bt_two) as Button
        bt_three = findViewById<View>(R.id.bt_three) as Button
        bt_two!!.setOnClickListener {
            val extras = intent.extras
            val value = extras!!.getString("value")
            Toast.makeText(this@SecondActivity, "Hello $value", Toast.LENGTH_LONG).show()
        }

        bt_three!!.setOnClickListener {
            val url = "https://www.vogella.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }
}