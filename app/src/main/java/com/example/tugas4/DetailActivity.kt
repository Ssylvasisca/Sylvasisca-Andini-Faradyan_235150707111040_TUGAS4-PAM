package com.example.tugas4

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas4.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DetailActivity : AppCompatActivity() {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val api = retrofit.create(ApiService::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val postId = intent.getIntExtra("postId", 1)

        api.getPost(postId).enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                val post = response.body()
                findViewById<TextView>(R.id.title).text = post?.title
                findViewById<TextView>(R.id.body).text = post?.body
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                Toast.makeText(this@DetailActivity, "Failed to load detail", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
