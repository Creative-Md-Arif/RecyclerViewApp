package com.example.recyclerviewapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewapp.adapter.PlayerAdapter
import com.example.recyclerviewapp.databinding.ActivityMainBinding
import com.example.recyclerviewapp.model.Player

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  val player = ArrayList<Player>()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)


        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))
        player.add(Player("Mohammad Arif","I m a profileImage",R.drawable.profile))

        val playerAdapter = PlayerAdapter(player)
        binding.recyclerView.adapter = PlayerAdapter(player)

    }
}