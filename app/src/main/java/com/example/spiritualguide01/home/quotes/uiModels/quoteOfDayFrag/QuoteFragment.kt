package com.example.spiritualguide01.home.quotes.uiModels.quoteOfDayFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.spiritualguide01.R
import com.example.spiritualguide01.databinding.FragmentQuoteBinding
import com.example.spiritualguide01.home.quotes.QuotesViewModel

private val TAG1 = "QuoteFragment_TAG"


class QuoteFragment : Fragment() {

    private lateinit var binding: FragmentQuoteBinding
    private val viewmodel: QuotesViewModel by viewModels()



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

        val likedLogo =
            binding.favoriteBorderIV.setImageResource(R.drawable.baseline_favorite_border_24)
        val notLikedLogo = binding.favoriteFullIV.setImageResource(R.drawable.baseline_favorite_24)
        val favListLogo = binding.favoriteListIV.setImageResource(R.drawable.baseline_view_list_24)

        // The Day Quote live from API:
        val finalDayQuote = viewmodel.dayQuote
        viewmodel.dayQuote.observe(viewLifecycleOwner) {
            binding.quoteOfTheDayTV.setText(finalDayQuote.value!!.q)
            binding.sourceTV.setText(finalDayQuote.value!!.a)
        }




    }




}