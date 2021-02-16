package com.rajitha.project.androidintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/*
Implicit Intent
Explicit Intent
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt_one = findViewById<Button>(R.id.bt_one)
        bt_one.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@MainActivity, SecondActivity::class.java)
                i.putExtra("value", "From Activity One")
                startActivity(i)
            }
        })
    }

}