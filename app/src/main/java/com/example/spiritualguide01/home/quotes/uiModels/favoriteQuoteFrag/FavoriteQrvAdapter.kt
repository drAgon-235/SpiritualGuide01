package com.example.spiritualguide01.home.quotes.uiModels.favoriteQuoteFrag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.spiritualguide01.databinding.FavoriteQuoteItemBinding
import com.example.spiritualguide01.home.quotes.datamodel.FavoriteQuote

class FavoriteQrvAdapter(

    private val favoriteQList: List<FavoriteQuote>
) : RecyclerView.Adapter<FavoriteQrvAdapter.FavoriteQuoteViewHolder>() {


    inner class FavoriteQuoteViewHolder(val binding: FavoriteQuoteItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteQuoteViewHolder {
        val binding =
            FavoriteQuoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavoriteQuoteViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return favoriteQList.size
    }

    override fun onBindViewHolder(holder: FavoriteQuoteViewHolder, position: Int) {
        // Getting the FavoriteQuote from our DB-List
        val favoriteQuote = favoriteQList[position]

        // Setting the according Data the denominated fields:
        holder.binding.quoteOfTheDayTV.text = favoriteQuote.q
        holder.binding.sourceTV.text = favoriteQuote.a
        // The "original" ID in the DB (for testing & learning purposes)
        holder.binding.dbIDTV.text = favoriteQuote.id.toString()
        // Setting the Numeration of the Quotes (there is no ID!!):
        holder.binding.quoteIDTV.text = (position+1).toString()

        // getting FavQuote by ID:
        val id = favoriteQuote.q

        // navigate to "FavoriteQuote (Detail) Fragment" with further options:
        holder.binding.favItemCardView.setOnClickListener {
            // using the generated id
            holder.itemView.findNavController().navigate(FavoriteQrvFragmentDirections.actionFavoriteQrvFragmentToFavQuoteOptionsFragment(id))
        }


    }
}