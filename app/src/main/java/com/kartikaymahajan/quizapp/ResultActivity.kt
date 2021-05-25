package com.kartikaymahajan.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        }
        else{
            window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        val username=intent.getStringExtra(Constants.USER_NAME)
        tv_name.text=username
        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tv_score.text="Your Score is $correctAnswer out of $totalQuestions"

        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}