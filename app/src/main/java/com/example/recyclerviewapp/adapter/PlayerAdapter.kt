package com.example.recyclerviewapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.databinding.ItemListBinding
import com.example.recyclerviewapp.model.Player

class PlayerAdapter(private val playerList:ArrayList<Player>) :
    RecyclerView.Adapter<PlayerAdapter.PlaYerViewHolder>() {
    class PlaYerViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlaYerViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
       return PlaYerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerAdapter.PlaYerViewHolder, position: Int) {
        val player = playerList[position]
        holder.binding.apply {
            profileImage.setImageResource(player.playerImage)
            textView.text = player.playerName
            textView2.text = player.playerDescription
        }
    }

    override fun getItemCount(): Int {
        return playerList.size
    }


}
