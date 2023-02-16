package com.example.cv_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.isEmpty
import com.google.android.material.textfield.TextInputLayout

class FirstForm : AppCompatActivity() {
    private lateinit var Fullname: TextInputLayout
    private lateinit var Email: TextInputLayout
    private lateinit var Age: TextInputLayout
    private lateinit var RadioGroup: RadioGroup
    private lateinit var Male: RadioButton
    private lateinit var Female: RadioButton
    private lateinit var Nextbtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_form)
        supportActionBar?.title = "Create your resume"

        Fullname = findViewById(R.id.fullname)
        Email = findViewById(R.id.email)
        Age = findViewById(R.id.age)
        RadioGroup = findViewById(R.id.radioGroup)
        Male = findViewById(R.id.male)
        Female = findViewById(R.id.female)
        Nextbtn = findViewById(R.id.next)

        Nextbtn.setOnClickListener {
            if(Fullname.editText?.text.toString().isEmpty()   || Email.editText?.text.toString().isEmpty()  || Age.editText?.text.toString().isEmpty()  ){
            Toast.makeText(
                this, "Please fill your informations!", Toast.LENGTH_SHORT
            ).show()
        }else {
                val intent = Intent( this, SecondActivity::class.java)
                intent.putExtra("fullname",Fullname.editText?.text.toString())

                intent.putExtra("email",Email.editText?.text.toString())
                intent.putExtra("age",Age.editText?.text.toString())
                if(Male.isChecked) {
                    intent.putExtra("gender","male")
                }
                else {
                    intent.putExtra("gender","female")
                }
                startActivity(intent)
            }
        }


    }


}


