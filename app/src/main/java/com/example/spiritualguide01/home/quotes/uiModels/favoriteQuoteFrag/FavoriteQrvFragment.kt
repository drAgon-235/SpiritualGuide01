package com.example.spiritualguide01.home.quotes.uiModels.favoriteQuoteFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import com.example.spiritualguide01.R
import com.example.spiritualguide01.databinding.FragmentFavoriteQrvBinding
import com.example.spiritualguide01.home.quotes.datamodel.FavoriteQuote


class FavoriteQrvFragment : Fragment() {

    private lateinit var binding: FragmentFavoriteQrvBinding
    private val viewModel: FavQuotesViewModel by activityViewModels()


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
        binding = FragmentFavoriteQrvBinding.inflate(inflater, container, false)
        return binding.root       }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.quoteRV.hasFixedSize()

        viewModel.loadInvertedListVM()

        viewModel.favQuotesListLD.observe(viewLifecycleOwner){
            binding.quoteRV.adapter = FavoriteQrvAdapter(it)
            //binding.quoteRV.setOnDragListener(viewModel.deleteFavQuoteVM(it.value.toString()))

        }





    }


}