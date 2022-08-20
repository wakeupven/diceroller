package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 *This activity allows the user to roll a dice and view the result
 * on screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val myFirstDice = Dice(6)
        val diceRoll = myFirstDice.roll()

        // Create second Dice object with 20 sides and roll it
        val mySecondDice = Dice(20)
        val diceSecondRoll = mySecondDice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceSecondRoll.toString()
    }

    /**
     * This activity creates new class called Dice
     */
    class Dice(private val numSides: Int) {

        // Create function of dice rolling via randomizer
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}