package com.example.spiritualguide01.home.cards.cardsUI.cardReadings.littleCrossFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.example.spiritualguide01.R
import com.example.spiritualguide01.databinding.FragmentLittleCrossBinding
import com.example.spiritualguide01.home.cards.CardsViewModel
import com.example.spiritualguide01.home.cards.cardsModel.Card


class LittleCrossFragment : Fragment() {

    private lateinit var binding: FragmentLittleCrossBinding
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
        binding = FragmentLittleCrossBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rotatingCard = binding.rotatingCardIV


        viewmodel.loadCardListFromDBinViewModel()
        // Loading the simple, UNSHUFFLED List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        var shuffledCardList: List<Card> =
            viewmodel.cardListSimple  // is not shuffled yet for educational purposes & control/testing


        // Shuffeling Cards Button:
        binding.shuffleCross.setOnClickListener {

            // First: Shaking Animation
            YoYo.with(Techniques.Shake).playOn(rotatingCard)
            // Second Animation: Rotating up & down
            rotatingCard.animate().apply {
                duration = 400
                rotationYBy(360f)
            }.withEndAction {
                rotatingCard.animate().apply {
                    duration = 400
                    rotationXBy(360f)
                }
            }
            // NOW we are really shuffeling and using shuffled Card List:
            shuffledCardList = shuffledCardList.shuffled()
            // NOW we make "LAY"-Button visible:
            binding.layCrossBTN.visibility = View.VISIBLE
        }


        // Laying Cards Button:
        binding.layCrossBTN.setOnClickListener {

            binding.interpeteBTN.visibility = View.VISIBLE

            // Connecting the pictures to the View (not visible yet), taking the shuffled cards from top (left) to bottom (right):
            var pic1 = shuffledCardList[0].picture
            val id1 = shuffledCardList[0].id
            var pic2 = shuffledCardList[2].picture
            val id2 = shuffledCardList[1].id
            var pic3 = shuffledCardList[1].picture
            val id3 = shuffledCardList[2].id
            var pic4 = shuffledCardList[3].picture
            val id4 = shuffledCardList[3].id
            binding.card1IV.setImageResource(pic1)
            binding.card2IV.setImageResource(pic2)
            binding.card03IV.setImageResource(pic3)
            binding.card04IV.setImageResource(pic4)


            // Appearing-Animation Card 01 - A:
            // CardBack comes faning in dowm...
            binding.back01IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back01IV)

            // Appearing-Animation Card 01 - B:
            // CardBack turns by 90 degrees and later disappears...
            binding.back01IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card1IV.animate().rotationYBy(90f)
            }.withEndAction {
                // (CardBack disappears:)
                binding.back01IV.isVisible = false
                // ... now the 1st Card from deck appears visible and turns by 90 degrees
                binding.card1IV.isVisible = true
                binding.card1IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(270f)
                }
            }

            // Appearing-Animation Card 02 - A:
            binding.back02IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back02IV)

            // Appearing-Animation Card 02 - B:
            binding.back02IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card2IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back02IV.isVisible = false
                binding.card2IV.isVisible = true
                binding.card2IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(270f)
                }
            }


            // Appearing-Animation Card 03 - A:
            binding.back03IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back03IV)

            // Appearing-Animation Card 03 - B:
            binding.back03IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card03IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back03IV.isVisible = false
                binding.card03IV.isVisible = true
                binding.card03IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(270f)
                }
            }


            // Appearing-Animation Card 04 - A:
            binding.back04IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back04IV)

            // Appearing-Animation Card 04 - B:
            binding.back04IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card04IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back04IV.isVisible = false
                binding.card04IV.isVisible = true
                binding.card04IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(270f)
                }
            }
        }

        // Interpretation Button:
        binding.interpeteBTN.setOnClickListener {
            val id1  = shuffledCardList[0].id
            val id2  = shuffledCardList[1].id
            val id3  = shuffledCardList[2].id
            val id4  = shuffledCardList[3].id
            findNavController().navigate(LittleCrossFragmentDirections.actionLittleCrossFragmentToLittleCrossMeaningFragment(id1, id2, id3, id4))
        }



    }
}