package com.example.kotlinlog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("木村",23,"武道")

        val human2 = Human("木村２",12,"宝さがし")

        human1.say()
        human1.think()

        human2.say()
        human2.think()

    }
}
