package com.emre.activitygecisleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ikinci.*

class ikinciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci)

        val intent=intent
        val alinanVeri = intent.getStringExtra("yollanVeri")
        textView2.text=alinanVeri
    }

}