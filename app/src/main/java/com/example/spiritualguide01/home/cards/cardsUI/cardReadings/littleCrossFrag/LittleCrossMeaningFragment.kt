package com.example.spiritualguide01.home.cards.cardsUI.cardReadings.littleCrossFrag

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.spiritualguide01.R
import com.example.spiritualguide01.databinding.FragmentLittleCrossMeaningBinding
import com.example.spiritualguide01.home.cards.CardsViewModel
import com.example.spiritualguide01.home.cards.cardsModel.Card
import com.example.spiritualguide01.home.cards.cardsModel.RawCardData
import java.lang.Exception

private val TAG = "LittleCross_MeaningFragment"


class LittleCrossMeaningFragment : Fragment() {

    private lateinit var binding: FragmentLittleCrossMeaningBinding
    private val viewmodel: CardsViewModel by activityViewModels()


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
        binding = FragmentLittleCrossMeaningBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // --- Card Nr. 01 ---
        // Create & initialize "holder" for Card 01 (DefaultData neccessery!)
        var cardNr01: Card = RawCardData.card21Judgement
        // Create & initialize "holder" for picture Drawable (always by Int !!!) (DefaultData neccessery!)
        var picNr01: Int = 0
        // Getting Card Nr. 01 from the viewmodel:
        // Get the ID from the argument in the nav_graph:
        val card01ID = requireArguments().getInt("card01ID")
        // Loading the simple List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        viewmodel.loadCardListFromDBinViewModel()
        val listNoLD = viewmodel.cardListSimple

        try {
            // Use the ID to get our wanted Card:
            cardNr01 = listNoLD[card01ID - 1]
            Log.d(
                TAG,
                "SUCCESS_2.1: ONE Card loaded to OneCardFragment for 'Card of the day' Button"
            )
        } catch (e: Exception) {
            Log.e(TAG, "ERROR_2.1 getting one Card from VM - now you're really dumped")
        }

        // Isolating Card's corresponding picture as "Drawable" (always by Int):
        picNr01 = cardNr01.picture
        // Binding picture and texts to (re-usable, scrollable & very flexible) Fragment:
        binding.cardPictureIV.setImageResource(picNr01)
        binding.editNameTV.setText(cardNr01.name)
        //Changing the color of the CardView of eaach Card according to LittleCrossFragment (green)
        //binding.card01CV.setBackgroundColor(0xFFB2D56F.toInt())


        // --- Card Nr. 02 ---
        var cardNr02: Card = RawCardData.card21Judgement
        var picNr02: Int = 0
        val card02ID = requireArguments().getInt("card02ID")

        try {
            // Use the ID to get our wanted Card:
            cardNr02 = listNoLD[card02ID - 1]
            Log.d(
                TAG,
                "SUCCESS_2.2: ONE Card loaded to OneCardFragment for 'Card of the day' Button"
            )
        } catch (e: Exception) {
            Log.e(TAG, "ERROR_2.2 getting one Card from VM - now you're really dumped")
        }
        picNr02 = cardNr02.picture
        binding.card02PictureIV.setImageResource(picNr02)
        binding.edit2NameTV.setText(cardNr02.name)
        //binding.card02CV.setBackgroundColor(0xFFB2D56F.toInt())


        // --- Card Nr. 03 ---
        var cardNr03: Card = RawCardData.card21Judgement
        var picNr03: Int = 0
        val card03ID = requireArguments().getInt("card03ID")

        try {
            // Use the ID to get our wanted Card:
            cardNr03 = listNoLD[card03ID - 1]
            Log.d(
                TAG,
                "SUCCESS_2.3: ONE Card loaded to OneCardFragment for 'Card of the day' Button"
            )
        } catch (e: Exception) {
            Log.e(TAG, "ERROR_2.3 getting one Card from VM - now you're really dumped")
        }
        picNr03 = cardNr03.picture
        binding.card03PictureIV.setImageResource(picNr03)
        binding.edit3NameTV.setText(cardNr03.name)
        //binding.card03CV.setBackgroundColor(0xFFB2D56F.toInt())


        // --- Card Nr. 04 ---
        var cardNr04: Card = RawCardData.card21Judgement
        var picNr04: Int = 0
        val card04ID = requireArguments().getInt("card04ID")

        try {
            // Use the ID to get our wanted Card:
            cardNr04 = listNoLD[card04ID - 1]
            Log.d(
                TAG,
                "SUCCESS_2.4: ONE Card loaded to OneCardFragment for 'Card of the day' Button"
            )
        } catch (e: Exception) {
            Log.e(TAG, "ERROR_2.4: getting one Card from VM - now you're really dumped")
        }
        picNr04 = cardNr04.picture
        binding.card04PictureIV.setImageResource(picNr04)
        binding.edit4NameTV.setText(cardNr04.name)
        //binding.card04CV.setBackgroundColor(0xFFB2D56F.toInt())



        // Getting the whole Card Intepretation of a distinct card (reusing the OneCardFragment again !!:
        binding.card01CV.setOnClickListener {
            val id01 = card01ID
            findNavController().navigate(LittleCrossMeaningFragmentDirections.actionLittleCrossMeaningFragmentToOneCardFragment(id01))
        }

        binding.card02CV.setOnClickListener {
            val id02 = card02ID
            findNavController().navigate(LittleCrossMeaningFragmentDirections.actionLittleCrossMeaningFragmentToOneCardFragment(id02))
        }

        binding.card03CV.setOnClickListener {
            val id03 = card03ID
            findNavController().navigate(LittleCrossMeaningFragmentDirections.actionLittleCrossMeaningFragmentToOneCardFragment(id03))
        }

        binding.card04CV.setOnClickListener {
            val id04 = card04ID
            findNavController().navigate(LittleCrossMeaningFragmentDirections.actionLittleCrossMeaningFragmentToOneCardFragment(id04))
        }




    }
}