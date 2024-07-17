package com.example.edubook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.appbar.MaterialToolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val appBar = findViewById(R.id.MaterialViewId)

        setSupportActionBar(findViewById(R.id.MaterialViewId))
    }
}