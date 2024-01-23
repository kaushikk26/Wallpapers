package com.example.wallpaper01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class downlod_page : AppCompatActivity() {



    lateinit var view : ViewPager
    var setarray= arrayOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.downlod_page)


        var pos=intent.getIntExtra("pos",0)

        setarray=enter_listview.array

        view=findViewById(R.id.view)

        var Myadapter= Pageradapter(this,setarray)

        view.adapter=Myadapter

        view.setCurrentItem(pos)




    }



}
