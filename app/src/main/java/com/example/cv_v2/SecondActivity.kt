package com.example.cv_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import com.google.android.material.slider.Slider

class SecondActivity : AppCompatActivity() {

    private lateinit var SliderFlutter: Slider
    private lateinit var SliderIOS: Slider
    private lateinit var SliderAndroid: Slider
    private lateinit var Arabic: CheckBox
    private lateinit var French: CheckBox
    private lateinit var English: CheckBox
    private lateinit var Music: CheckBox
    private lateinit var Sports: CheckBox
    private lateinit var Games: CheckBox
    private lateinit var SubmitBTN : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.title = "Create your resume"


        SliderFlutter = findViewById(R.id.sliderFlutter)
        SliderIOS = findViewById(R.id.sliderIos)
        SliderAndroid = findViewById(R.id.sliderAndroid)
        Arabic = findViewById(R.id.arabic)
        French = findViewById(R.id.french)
        English = findViewById(R.id.english)
        Music = findViewById(R.id.music)
        Sports = findViewById(R.id.sport)
        Games = findViewById(R.id.games)
        SubmitBTN = findViewById(R.id.submit)

        SubmitBTN.setOnClickListener {
            var  fullname = intent.getStringExtra("fullname").toString()
            var  email = intent.getStringExtra("email").toString()
            var  age = intent.getStringExtra("age").toString()

            val intent = Intent( this, FinalActivity::class.java)
            intent.putExtra("fullname",fullname)
            intent.putExtra("email",email)
            intent.putExtra("age",age)
            intent.putExtra("Android",SliderAndroid.value.toString())
            intent.putExtra("IOS",SliderIOS.value.toString())
            intent.putExtra("Flutter",SliderFlutter.value.toString())
            var lang = ""
            if(French.isChecked) {
                lang += "French "
            }
            if(English.isChecked) {
                lang += "English "
            }
            if(Arabic.isChecked) {
                lang += "Arabic "
            }

            var hobbies = ""
            if(Music.isChecked) {
                hobbies += "Music "
            }
            if(Sports.isChecked) {
                hobbies += "Sports "
            }
            if(Games.isChecked) {
                hobbies += "Games "
            }
            intent.putExtra("Language",lang)
            intent.putExtra("Hobbies",hobbies)
            startActivity(intent)


        }


    }


}