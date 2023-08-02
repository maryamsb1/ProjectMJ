package com.example.projectmj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectmj.databinding.LaunchScreenAtwBinding.inflate
import com.example.projectmj.databinding.LaunchScreenAtwBinding


class MA_launch_screen: AppCompatActivity() {

    private lateinit var binding: LaunchScreenAtwBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.launch_screen_atw)
    }
}