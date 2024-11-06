package com.stogo.firstapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


       val listPosts = findViewById<ListView>(R.id.listPosts)
       val postsArray = listOf("Post 1", "Post 2", "Post 3", "Post 4", "Post 4")
       val adapter = PostsAdapter(this,R.layout.item_post,postsArray)
        listPosts.adapter = adapter
    }


}
