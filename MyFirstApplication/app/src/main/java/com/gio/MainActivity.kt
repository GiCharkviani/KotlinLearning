package com.gio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val myText = findViewById<TextView>(R.id.myText)
        val ageInput = findViewById<EditText>(R.id.ageInput)
        val showDaysBtn = findViewById<Button>(R.id.showDays)

        var counter = 0;

        myText.text = counter.toString()

        showDaysBtn.setOnClickListener {
            val ageText =  ageInput.text.toString();
            val ageValue = ageText.toIntOrNull();
            if(ageValue != null) {
                val value = ageValue * 365;
                myText.text = "You are " + value.toString() + " days old";
            }
        }

        btnClickMe.setOnClickListener {
            counter++
            myText.text = counter.toString()
            if(counter == 5) {
                myText.text = "The End!"
                Toast.makeText(this, "Will count from 0", Toast.LENGTH_LONG).show()
                counter = -1
            }

        }
    }
}