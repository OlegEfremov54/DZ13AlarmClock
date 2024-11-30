package com.example.dz13alarmclock

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class Activity_Ckloc : AppCompatActivity() {
    lateinit var toolbarClok:Toolbar
    private lateinit var stopAlarmButtonBTN: Button
    private lateinit var imageAlarmClockIV: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ckloc)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        toolbarClok = findViewById(R.id.toolbarClok)
        setSupportActionBar(toolbarClok)
        title = " Будильник"
        toolbarClok.subtitle = "Вер1.Аларм страница"
        toolbarClok.setLogo(R.drawable.cklok)


        stopAlarmButtonBTN = findViewById(R.id.stopAlarmButtonBTN)
        imageAlarmClockIV = findViewById(R.id.imageAlarmClockIV)



        stopAlarmButtonBTN.setOnClickListener {
            finish()
            exitProcess(0)
        }
        imageAlarmClockIV.setImageResource(R.drawable.baseline_alarm_24)
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.infoMenuMain -> {
                Toast.makeText(
                    applicationContext, "Автор Ефремов О.В. Создан 23.11.2024",
                    Toast.LENGTH_LONG
                ).show()
            }

            R.id.exitMenuMain -> {
                Toast.makeText(
                    applicationContext, "Работа приложения завершена",
                    Toast.LENGTH_LONG
                ).show()
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}