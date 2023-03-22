package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerview: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var ImageId: Array<Int>
    lateinit var heading: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImageId = arrayOf(
            R.drawable.rri,
            R.drawable.android,
            R.drawable.elonmusk,
            R.drawable.china,
            R.drawable.naruto,
            R.drawable.eds,
            R.drawable.google,
            R.drawable.kangroo,
            R.drawable.natunatu,
            R.drawable.twitter


            )
        heading = arrayOf(
            "India now grows ties further with russia says international media",
            "Android 13 seems refreshing start in new Android Smart phones",
            "Elon musk plans to invest in an AI engine for ChatGPT Alternative",
            "China is creating a dept pit for other countries to fall in",
            "naruto is vamsee's favourite anime.... Its waste of time",
            "Ed Sheeran is Sharvesh s' Favourite singer",
            "Google continues to layoff its employess in the name of poor perfomance",
            "Kangroos declared as endangered species in the Australian Continent",
            "Naatu Naatu wins oscar For the Indian Film industry",
            "Elon Musk fires Pyush Agarwal from the company... What is the future of the company?"


            )

        newRecyclerview = findViewById(R.id.recycler_view)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)
        newArrayList = arrayListOf<News>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in ImageId.indices) {
            val news = News(ImageId[i], heading[i])
            newArrayList.add(news)
        }

        newRecyclerview.adapter = MyAdapter(newArrayList, this)
    }
}