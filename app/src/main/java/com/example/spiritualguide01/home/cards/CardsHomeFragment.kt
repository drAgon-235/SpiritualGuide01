package com.example.spiritualguide01.home.cards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.spiritualguide01.databinding.FragmentCardsHomeBinding

class CardsHomeFragment : Fragment() {

    private lateinit var binding: FragmentCardsHomeBinding
    private val viewModel: CardsViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCardsHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Random Card of the Day:
        binding.dayCardBTN.setOnClickListener {
            // Generates a random card-ID, which is trasmitted by argument in the nav_graph to the OneCardFragment:
            val randomCardID = (0 until 79).random()
            findNavController().navigate(CardsHomeFragmentDirections.actionNavigationHomeToOneCardFragment(randomCardID))

        }

        // Overview of all Tarot Cards sorted by Arcanas:
        binding.allCardsListBTN.setOnClickListener {
            findNavController().navigate(CardsHomeFragmentDirections.actionNavigationHomeToAllCardsRVFragment())
        }



    }

}