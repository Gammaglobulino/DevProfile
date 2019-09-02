package com.example.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bitmapImage= BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val roundedBitImage= RoundedBitmapDrawableFactory.create(resources,bitmapImage)
        roundedBitImage.cornerRadius=15f
        logo.setImageDrawable(roundedBitImage)


    }
}
