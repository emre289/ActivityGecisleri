package com.emre.activitygecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"HOŞGELDİNİZ", Toast.LENGTH_LONG).show()
    }
    fun degistir(view:View){
        val kullaniciVerisi=editTextTextPersonName3.text.toString()

        val uyariMesaji=AlertDialog.Builder(applicationContext)
        uyariMesaji.setTitle("HATA MESAJI")
        uyariMesaji.setMessage("Veri Gönderme Hatası")
        val intent=Intent(applicationContext,ikinciActivity::class.java)
        intent.putExtra("yollanVeri",kullaniciVerisi)
        startActivity(intent)
        finish()



    }
}