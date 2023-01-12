package com.example.android.starwarsapp.character

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.starwarsapp.databinding.CharacterItemBinding

class CharacterAdapter(val clickListener: CharacterListener): ListAdapter<Character,
        CharacterAdapter.CharacterViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterAdapter
    .CharacterViewHolder {
        return CharacterViewHolder(
            CharacterItemBinding.inflate(
                LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: CharacterAdapter.CharacterViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, clickListener)
    }

    class CharacterViewHolder(private var binding:
                         CharacterItemBinding
    ):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Character, clickListener: CharacterListener) {
            binding.character = character
            binding.executePendingBindings()
            binding.clickListener = clickListener
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Character>() {
        override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
            return oldItem === newItem;
        }

        override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
            return oldItem.name == newItem.name
        }
    }
}

class CharacterListener(val clickListener: (Character: Character) -> Unit) {
    fun onClick(character: Character) = clickListener(character)
}