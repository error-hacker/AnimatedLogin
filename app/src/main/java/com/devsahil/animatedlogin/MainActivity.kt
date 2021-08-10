package com.devsahil.animatedlogin

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginLayout: ConstraintLayout = findViewById(R.id.login_layout)

        val animationDrawable :AnimationDrawable = loginLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(10000)
        animationDrawable.setExitFadeDuration(30000)
        animationDrawable.start()
    }


}