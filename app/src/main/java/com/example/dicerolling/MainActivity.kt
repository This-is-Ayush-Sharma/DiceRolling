package com.example.dicerolling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var roll: TextView
    lateinit var rollbtn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll = findViewById(R.id.roll)
        rollbtn = findViewById(R.id.button)
        rollbtn.setOnClickListener {
            roll.text = rollDice().toString()
        }
    }
    fun rollDice():Int {
        val dice = 1..6
        return dice.random()
    }
}