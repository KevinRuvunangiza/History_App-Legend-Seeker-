package com.example.historyapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var ageInput = findViewById<TextInputEditText>(R.id.AgeInput) //Gives us access to the Text Input Edit Text


        var mainTxt = findViewById<TextView>(R.id.mainText) //Gives us access to the TextView here called "mainText"

        var genHistBtn = findViewById<Button>(R.id.GenHistoryBtn) // Gives us access to the "Generate History Button"

        var clearBtn = findViewById<Button>(R.id.ClearBtn) // Gives us access to the "Clear Button"

        
        /*Here are different variables that each contains the name or the age of a dead personality
        for example the variable "abrahamLincoln" stores the name of the deacesed president
        so that it can be used further down in this project.
         */

        val abrahamLincoln = "Abraham Lincoln"
        val abrahamLincolnAge = 56

        val mozart = "Wolfgang Amadeus Mozart"
        val mozartAge = 35

        val nelsonMandela = "Nelson Mandela"
        val nelsonMandelaAge = 95

        val georgeWashington = "George Washington"
        val georgeWashingtonAge = 67

        val martinLuther = "Martin Luther King"
        val martinLutherAge = 39

        val gandhi = "Mahatma Gandhi"
        val gandhiAge = 78

        val elizabeth = "Elizabeth II"
        val elizabethAge = 96


        val marieCurie = "Marie Curie"
        val marieCurieAge = 66


        val vincentVanGogh = "Vincent van Gogh"
        val vincentVanGoghAge = 37


        val winstonChurchill = "Winston Churchill"
        val winstonChurchillAge = 90




         // When the "Generate History Button" is pressed this function will be called
        genHistBtn.setOnClickListener() {
            val ageTxt: String = ageInput.text.toString()

            if (ageTxt.isNotEmpty()){ // Checks if the input fiel isn't empty if it's the case the user is prompt to enter a valid input.


                if (ageTxt.toInt()>=20 && ageTxt.toInt()<100){ // Checks if the age entered is between 20 and 100 years old if it's not the case the user will be prompted to try again
                    /*
                    Those if and else if statements will check if the age entered by the user corresponds
                    To any of the historical figure age we stored in our variables if it's the casse it will display some informations about that historical figure
                    If it's not the case it will display this message: "We do not have any record of a Legend dying at [USER INPUT] years old...please try again"

                    NOTE: All those variables could be replaced by an array but the use of an array wasn't recomended for this project.
                    */

                    if (ageTxt == abrahamLincolnAge.toString()) {

                        mainTxt.text = "LEGEND FOUND...$abrahamLincolnAge corresponds to the age $abrahamLincoln had when he died\nHe was the 16th president of the United States of America(USA)"

                    }else if (ageTxt.toInt() == mozartAge) {

                        mainTxt.text = "LEGEND FOUND...$mozartAge corresponds to the age $mozart had when he passed away\n He was a musical prodigy,a great compisitor and a improvisation genius"
                    } else if (ageTxt.toInt() == nelsonMandelaAge) {

                        mainTxt.text = "LEGEND FOUND...$nelsonMandelaAge corresponds to the age $nelsonMandela had when he died\n He was a South African president he received the Nobel Peace Prize in 1993"

                    } else if (ageTxt.toInt() == georgeWashingtonAge) {

                        mainTxt.text = "LEGEND FOUND...$georgeWashingtonAge corresponds to the age $georgeWashington had when he died\n He led the Continental Army to victory in the Revolutionary War and helped create the U.S. Constitution"

                    } else if (ageTxt.toInt() == martinLutherAge) {

                        mainTxt.text = "LEGEND FOUND...$martinLutherAge corresponds to the age $martinLuther had when he passed away\n He was an American Christian minister, activist, and political philosopher who was one of the most prominent leaders in the civil rights movement from 1955 until his assassination in 1968"

                    } else if (ageTxt.toInt() == gandhiAge) {
                        mainTxt.text = "LEGEND FOUND...$gandhiAge corresponds to the age $gandhi had when he passed away\n He was an Indian lawyer, anti-colonial nationalist and political ethicist who employed nonviolent resistance to lead the successful campaign for India's independence from British rule"

                    } else if (ageTxt.toInt() == elizabethAge){
                        mainTxt.text = "LEGEND FOUND...$elizabethAge corresponds to the age $elizabeth had when she died\n She was Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022"

                    }else if (ageTxt.toInt() == marieCurieAge){
                        mainTxt.text = "LEGEND FOUND...$marieCurieAge corresponds to the age $marieCurie had when she passed away\n She was a Polish and naturalised-French physicist and chemist who conducted pioneering research on radioactivity"


                    }else if (ageTxt.toInt() == vincentVanGoghAge){
                        mainTxt.text = "LEGEND FOUND...$vincentVanGoghAge corresponds to the age $vincentVanGogh had when he tragically died\n He  was a Dutch Post-Impressionist painter who is among the most famous and influential figures in the history of Western art"



                    }else if (ageTxt.toInt() == winstonChurchillAge){
                        mainTxt.text = "LEGEND FOUND...$winstonChurchillAge corresponds to the age $winstonChurchill had when he died\n He was a British statesman, soldier, and writer who twice served as Prime Minister of the United Kingdom"

                    }
                    else{

                        mainTxt.text = "We do not have any record of a Legend dying at $ageTxt years old...please try again"
                    }
                }else{

                    mainTxt.text = "The age you enetered must be between 20 and 100 years"



                }



            }else{
                mainTxt.text = "Your entry is empty please enter a valid number"
            }


        }

        // When the "Clear Button" is pressed this function will be called
        clearBtn.setOnClickListener {

            mainTxt.text = "Informations will be displayed here..." // Replaces whatever message that was displayed by this Placeholder sentece
            ageInput.setText(String()) // Clear the Text Input Edit Text
        }
    }
}








