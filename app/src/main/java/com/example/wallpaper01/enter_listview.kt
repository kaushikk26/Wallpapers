package com.example.wallpaper01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.TextView


class enter_listview : AppCompatActivity() {


    lateinit var grid: GridView
    lateinit var wallpaper_name :TextView


    var car_array = arrayOf(
        R.drawable.car_1,
        R.drawable.car_2,
        R.drawable.car_3,
        R.drawable.car_4,
        R.drawable.car_5,
        R.drawable.car_6,
        R.drawable.car_7,
        R.drawable.car_8,
        R.drawable.car_9,
        R.drawable.car_10,
        R.drawable.car_11,
        R.drawable.car_12,
        R.drawable.car_13,
        R.drawable.car_14
    )
    var bike_array = arrayOf(
        R.drawable.bike_1,
        R.drawable.bike_2,
        R.drawable.bike_3,
        R.drawable.bike_4,
        R.drawable.bike_5,
        R.drawable.bike_6,
        R.drawable.bike_7,
        R.drawable.bike_8,
        R.drawable.bike_9,
        R.drawable.bike_10,
        R.drawable.bike_11,
        R.drawable.bike_12,
        R.drawable.bike_13,
        R.drawable.bike_14
    )
    var nature_array= arrayOf(
        R.drawable.nature_1,
        R.drawable.nature_2,
        R.drawable.nature_3,
        R.drawable.nature_4,
        R.drawable.nature_5,
        R.drawable.nature_6,
        R.drawable.nature_7,
        R.drawable.nature_8,
        R.drawable.nature_9,
        R.drawable.nature_10,
        R.drawable.nature_11,
        R.drawable.nature_12,
        R.drawable.nature_13,
        R.drawable.nature_14,
        R.drawable.nature_15,
        R.drawable.nature_16,
        R.drawable.nature_17
    )
    var animal_array= arrayOf(
        R.drawable.animal_1,
        R.drawable.animal_2,
        R.drawable.animal_3,
        R.drawable.animal_4,
        R.drawable.animal_5,
        R.drawable.animal_6,
        R.drawable.animal_7,
        R.drawable.animal_8,
        R.drawable.animal_9,
        R.drawable.animal_10,
        R.drawable.animal_11,
        R.drawable.animal_12,
        R.drawable.animal_13,
        R.drawable.animal_14,
        R.drawable.animal_15,
        R.drawable.animal_16,
        R.drawable.animal_17,
        R.drawable.animal_18,
        R.drawable.animal_19,
        R.drawable.animal_20
    )
    var bird_array= arrayOf(
        R.drawable.bird_1,
        R.drawable.bird_2,
        R.drawable.bird_3,
        R.drawable.bird_4,
        R.drawable.bird_5,
        R.drawable.bird_6,
        R.drawable.bird_7,
        R.drawable.bird_8,
        R.drawable.bird_9,
        R.drawable.bird_10,
        R.drawable.bird_11,
        R.drawable.bird_12,
        R.drawable.bird_13,
        R.drawable.bird_14,
        R.drawable.bird_15,
        R.drawable.bird_16,
        R.drawable.bird_17,
        R.drawable.bird_18,
        R.drawable.bird_19,
        R.drawable.bird_20
    )
    var winter_array= arrayOf(
        R.drawable.winter_1,
        R.drawable.winter_2,
        R.drawable.winter_3,
        R.drawable.winter_4,
        R.drawable.winter_5,
        R.drawable.winter_6,
        R.drawable.winter_7,
        R.drawable.winter_8,
        R.drawable.winter_9,
        R.drawable.winter_10
    )
    var summer_array= arrayOf(
        R.drawable.summer_1,
        R.drawable.summer_2,
        R.drawable.summer_3,
        R.drawable.summer_4,
        R.drawable.summer_5,
        R.drawable.summer_6,
        R.drawable.summer_7
    )
    var supperhero_array= arrayOf(
        R.drawable.superhero_1,
        R.drawable.superhero_2,
        R.drawable.superhero_3,
        R.drawable.superhero_4,
        R.drawable.superhero_5,
        R.drawable.superhero_6,
        R.drawable.superhero_7,
        R.drawable.superhero_8,
        R.drawable.superhero_9,
        R.drawable.superhero_10,
        R.drawable.superhero_11,
        R.drawable.superhero_12,
        R.drawable.superhero_13,
        R.drawable.superhero_14,
        R.drawable.superhero_15,
        R.drawable.superhero_16
    )
    var flower_array= arrayOf(
        R.drawable.flower_1,
        R.drawable.flower_2,
        R.drawable.flower_3,
        R.drawable.flower_4,
        R.drawable.flower_5,
        R.drawable.flower_6,
        R.drawable.flower_7,
        R.drawable.flower_8,
        R.drawable.flower_9,
        R.drawable.flower_10,
        R.drawable.flower_11,
        R.drawable.flower_12,
        R.drawable.flower_13,
        R.drawable.flower_14,
        R.drawable.flower_15,
        R.drawable.flower_16
    )


    var tourism_array= arrayOf(
        R.drawable.tourism_1,
        R.drawable.tourism_2,
        R.drawable.tourism_3,
        R.drawable.tourism_4,
        R.drawable.tourism_5,
        R.drawable.tourism_6,
        R.drawable.tourism_7,
        R.drawable.tourism_8,
        R.drawable.tourism_9,
        R.drawable.tourism_10,
        R.drawable.tourism_11,
        R.drawable.tourism_12,
        R.drawable.tourism_13,
        R.drawable.tourism_14,
        R.drawable.tourism_15
    )

    companion object{
        var array = arrayOf<Int>()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_listview)

        grid = findViewById(R.id.grid)
        wallpaper_name = findViewById(R.id.wallpaper_name)


        var position = intent.getStringExtra("name_array")

        if (position.equals("Car")) {
            array = car_array
        } else if (position.equals("Bike")) {
            array = bike_array
        } else if (position.equals("Natur")) {
            array = nature_array
        } else if (position.equals("Animal")) {
            array = animal_array
        } else if (position.equals("Bird")) {
            array = bird_array
        } else if (position.equals("Winter")) {
            array = winter_array
        } else if (position.equals("Sumer")) {
            array = summer_array
        } else if (position.equals("Super Hero")) {
            array = supperhero_array
        } else if (position.equals("Flowers")) {
            array = flower_array
        } else if (position.equals("Tourism")) {
            array = tourism_array
        }

        var card = Claas2(this, array)

        grid.adapter = card

        grid.setOnItemClickListener { adapterView, view, i, l ->
            startActivity(
                Intent(this@enter_listview, downlod_page::class.java).putExtra("pos", i)
            )

        }
    }
}
