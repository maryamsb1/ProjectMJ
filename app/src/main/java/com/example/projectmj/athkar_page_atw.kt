package com.example.projectmj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectmj.model.User

class athkar_page_atw : AppCompatActivity() {

    private lateinit var u: User

    //private lateinit var binding:  ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.athkar_page_atw)
        u=User(name="judafa",id=3)
//        u.id=5

    }
}