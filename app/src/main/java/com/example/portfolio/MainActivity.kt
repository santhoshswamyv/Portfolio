package com.example.portfolio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var skillbutton = findViewById<Button>(R.id.skills)

        skillbutton.setOnClickListener {

            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }

        var detailsbutton = findViewById<Button>(R.id.details)

        detailsbutton.setOnClickListener {

            intent = Intent(this,DetailsActivity::class.java)
            startActivity(intent)
        }

        var experiencebutton = findViewById<Button>(R.id.experience)

        experiencebutton.setOnClickListener {

            intent = Intent(this,ExperienceActivity::class.java)
            startActivity(intent)
        }

        var acheivementbutton = findViewById<Button>(R.id.acheivements)

        acheivementbutton.setOnClickListener {

            intent = Intent(this,AcheivementActivity::class.java)
            startActivity(intent)
        }
    }
}