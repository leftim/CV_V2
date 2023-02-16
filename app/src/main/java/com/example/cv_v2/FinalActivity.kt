package com.example.cv_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView
import com.google.android.material.textview.MaterialTextView

class FinalActivity : AppCompatActivity() {

   private lateinit var Nametext: TextView
   private lateinit var AgeText: TextView
   private lateinit var EmailText: TextView
   private lateinit var GenderText: TextView
   private lateinit var AndroidText: TextView
   private lateinit var IOSText: TextView
   private lateinit var FlutterText: TextView
   private lateinit var LanguageText: TextView
   private lateinit var HobbiesText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        var  fullname = intent.getStringExtra("fullname").toString()
        var  email = intent.getStringExtra("email").toString()
        var  age = intent.getStringExtra("age").toString()


        Nametext = findViewById(R.id.Nametext)
        AgeText = findViewById(R.id.AgeText)
        EmailText = findViewById(R.id.Emailtext)
        GenderText = findViewById(R.id.GenderText)
        AndroidText = findViewById(R.id.AndroidSkill)
        IOSText = findViewById(R.id.IosSkill)
        LanguageText = findViewById(R.id.Language)
        HobbiesText = findViewById(R.id.Hobbies)
        FlutterText = findViewById(R.id.FlutterSkill)

        Nametext.text = "Fullname: " + intent.getStringExtra("fullname").toString()
        EmailText.text = "Email :" + intent.getStringExtra("email").toString()
        AgeText.text = "Age :" + intent.getStringExtra("age").toString()
        AndroidText.text = "Android Skill :" + intent.getStringExtra("Android").toString()
        IOSText.text = "IOS Skills :" + intent.getStringExtra("IOS").toString()
        LanguageText.text = "Language:" + intent.getStringExtra("Language").toString()
        HobbiesText.text = "Hobbies:" + intent.getStringExtra("Hobbies").toString()


    }
}