package com.example.tasbex

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasbex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var tasbex = 0
    var link ="https://namozvaqti.uz/shahar/fargona"
    val link2 = "http://mp3muslim.uz/component/muscol/N/28-mishari-roshid-al-afasij/77-ur-oni-karim?Itemid=101"
    var a:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.namoz1.setOnClickListener {
            val url = "https://namozvaqti.uz/shahar/fargona"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("$link")
            startActivity(i)
        }

        binding.namoz2.setOnClickListener {
            val url = "http://mp3muslim.uz/component/muscol/N/28-mishari-roshid-al-afasij/77-ur-oni-karim?Itemid=101"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("$link2")
            startActivity(i)
        }


        binding.btnCount.setOnClickListener {
            tasbex++
            writeTasbex()
        }
        binding.btnRestart.setOnClickListener {
           tasbex = 0
          writeTasbex()
        }
    }
    fun writeTasbex(){
        binding.tvCount.text = tasbex.toString()
    }
    fun addCatch(){

    }
}