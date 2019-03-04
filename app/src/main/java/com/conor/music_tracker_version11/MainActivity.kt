package com.conor.music_tracker_version11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var buttonClickMe: Button
    lateinit var editTextName: EditText
    lateinit var buttonIntroduce: Button
    lateinit var textViewMessage: TextView
    lateinit var buttonGoToNext: Button
    lateinit var name: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        buttonClickMe.setOnClickListener{
//            var name = editTextName.text
//            textViewMessage.text = "Hello $name"
//        }
//
//        buttonIntroduce.setOnClickListener {
//            var name = editTextName.text
//            textViewMessage.text = "Hello $name, feel free to add and remove music"
//        }
//
//        textViewMessage.setOnClickListener {
//            textViewMessage.text = "hi"
//        }



          buttonGoToNext = findViewById(R.id.loginButton)
          name = findViewById(R.id.nameField)

          buttonGoToNext.setOnClickListener {
             // if(name == "john" && password == "1234") {
                  val intent: Intent = Intent(applicationContext, Main2Activity::class.java)
                  startActivity(intent)
             // } else {

              }
         }
    }

