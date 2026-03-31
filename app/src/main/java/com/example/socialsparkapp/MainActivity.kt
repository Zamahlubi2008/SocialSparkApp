package com.example.socialsparkapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


//Social Spark App
//Designed to help users maintain meaningful social connections
//by suggesting small, intentional interactions throughout the day
//The goal is to reduce social friction during busy schedules.

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Link the activity to its visual layout (XML)
        //This allows interaction between UI elements and Kotlin Logic
        setContentView(R.layout.activity_main)

        //Capture UI components they can be controlled programmatically
        //These references act as a bridge between user interaction and app logic
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        //Attach behavior to the button: this defines the app's core interactions
        //The app only responds once the user actively requests a suggestion
        suggestButton.setOnClickListener {
            //Normalize input to avoid case-sensitivity issues
            //Ensures consistent matching regardless of how the user types
            val userInput = timeInput.text.toString().trim().lowercase()

            //Variable used to store the selected suggestion before display
            var suggestion = ""

            //Decision-making structure:
            //Uses sequential if-else conditions to map time-of-day input
            //to meaningful, low-effort social actions
            if (userInput == "morning") {

                //Morning interactions focus on strengthening close relationships
                suggestion = "Morning:send a Good morning text to a family member"
            } else if (userInput == "mid-morning") {

                //Mid-morning encourages professional appreciation and connection
                suggestion = "Reach out to a colleague with a quick 'Thank you'"
            } else if (userInput == "afternoon") {

                //Afternoon suggestion promote light ,fun engagement
                suggestion = "share a funny meme or interesting link with a friend"

            } else if (userInput == "snack time") {

                //Casual check-ups help maintain friendships with minimal effort
                suggestion = "send a quick 'thinking of you message'"

            } else if (userInput == "dinner") {

                //Evening encourages deeper, more personal interaction
                suggestion = "Call a friend or a relative for a 5-minutes catch-up"

            } else if (userInput == "night") {

                //Nighttime interactions shift to passive engagement
                suggestion = "Leave a thoughtful comment on a friend's post"

            } else {

                //Input validation:
                //Provides gentle guidance instead of harsh error messaging
                //Keeps the tone aligned with the app's friendly design
                suggestion = "Oops, try:morning, afternoon, dinner, or night"
            }

            //output the final suggestion to the user interface
            //This is the visible results of the app's decision Logic
            resultText.text = suggestion
        }
    }
}









