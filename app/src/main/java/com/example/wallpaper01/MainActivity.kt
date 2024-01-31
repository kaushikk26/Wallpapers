package com.example.wallpaper01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var list: ListView



    var name_array= arrayOf("Car","Bike","Natur","Animal","Bird","Winter","Sumer","Super Hero","Flowers","Tourism")
    var array= arrayOf(R.drawable.car_wall,R.drawable.bike_wall,R.drawable.nature_wall,R.drawable.animal_wall,
        R.drawable.bird_wallpaper,R.drawable.winter_wall,R.drawable.summer_wall,R.drawable.super_hero_wall,R.drawable.flower_wall,R.drawable.tourism_wall)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list=findViewById(R.id.list)

        var adapter=Class1(this,array,name_array)

        list.adapter=adapter

        list.setOnItemClickListener { adapterView, view, position, id ->

            startActivity(Intent(this@MainActivity, enter_listview::class.java).putExtra("name_array",name_array[position]))


        }


    }



}