package com.example.mathsgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mathsgame.databinding.ActivityNewGameBinding

class NewGameActivity : AppCompatActivity() {

    lateinit var gameBinding : ActivityNewGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gameBinding = ActivityNewGameBinding.inflate(layoutInflater)
        val view = gameBinding.root
        setContentView(view)
    }
}