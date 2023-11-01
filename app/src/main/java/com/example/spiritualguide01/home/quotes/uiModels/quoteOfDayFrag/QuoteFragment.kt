package com.example.spiritualguide01.home.quotes.uiModels.quoteOfDayFrag

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.spiritualguide01.R
import com.example.spiritualguide01.databinding.FragmentQuoteBinding
import com.example.spiritualguide01.home.quotes.QuotesViewModel
import com.example.spiritualguide01.home.quotes.datamodel.FavoriteQuote
import com.example.spiritualguide01.home.quotes.uiModels.favoriteQuoteFrag.FavQuotesViewModel

private val TAG1 = "QuoteFragment_TAG"


class QuoteFragment : Fragment() {

    private lateinit var binding: FragmentQuoteBinding
    private val viewmodel: QuotesViewModel by viewModels()
    private val viewModelFavQuotes: FavQuotesViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuoteBinding.inflate(inflater, container, false)
        return binding.root    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val likedLogo = binding.favoriteBorderIV.setImageResource(R.drawable.baseline_favorite_border_24)
        val notLikedLogo = binding.favoriteFullIV.setImageResource(R.drawable.baseline_favorite_24)
        //val favListLogo = binding.favoriteListIV.setImageResource(R.drawable.baseline_view_list_24)

        // The Day Quote live from API:
        val finalDayQuote = viewmodel.dayQuote
        viewmodel.dayQuote.observe(viewLifecycleOwner) {
            binding.quoteOfTheDayTV.setText(finalDayQuote.value!!.q)
            binding.sourceTV.setText(finalDayQuote.value!!.a)
        }

/*
        // Go to My Favorite Quotes List RV-Fragment:
        binding.goToFavListCV.setOnClickListener {
            findNavController().navigate(QuoteFragmentDirections.actionQuoteFragmentToFavoriteQrvFragment())
        }

 */


        // Saving the Quote of the Day into Favorites-DB:
        binding.likingCV.setOnClickListener {
            binding.favoriteFullIV.visibility = View.VISIBLE

            try {
                Log.d(TAG, "Start: INSERTING Quote of the Day into FavoriteQuotesDB!")
                viewModelFavQuotes.insertFavQuoteVM(
                    //Creating new FavoriteQuote Object for the DB to insert into:
                    FavoriteQuote(
                        binding.quoteOfTheDayTV.text.toString(),
                        binding.sourceTV.text.toString(),
                    )
                )
                Log.d(TAG, "Finish: INSERTING Quote of the Day into FavoriteQuotesDB Successful!")
            } catch (e: Exception) {
                Log.e(TAG, "ERROR: INSERTING Quote of the Day into FavoriteQuotesDB!")
            }

            //         findNavController().navigate(QuoteFragmentDirections.actionQuoteFragmentToFavoriteQrvFragment())

        }




    }




}