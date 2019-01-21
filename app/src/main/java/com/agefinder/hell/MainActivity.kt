package com.agefinder.hell

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({
            var yearsOfBorn:Int = yearOfBorn.text.toString().toInt()
            var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
            outputText.text = "You are ${currentYear - yearsOfBorn} years old."
        })
    }
}
