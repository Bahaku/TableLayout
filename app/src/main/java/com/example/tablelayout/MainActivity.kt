package com.example.tablelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_tablayout.*

class MainActivity : AppCompatActivity() {

    private var btnTL: Button? = null
    private var btnBN: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        setupListener()
    }

    private fun setupViews() {
        btnTL = findViewById(R.id.btnTL)
        btnBN = findViewById(R.id.btnBN)
    }
    private fun setupListener(){
        btnTL?.setOnClickListener{
            val intent = Intent(applicationContext, TabLayoutActivity::class.java)
            startActivity(intent)
        }

        btnBN?.setOnClickListener(){
            val int = Intent(applicationContext, BottomNavActivity::class.java)
            startActivity(int)
        }

    }


}


