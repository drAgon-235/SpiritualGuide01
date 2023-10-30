package com.example.spiritualguide01.home.cards.cardsUI.cardReadings.pathOfWisdomFrag

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
import com.example.spiritualguide01.databinding.FragmentPathOfWisdomBinding
import com.example.spiritualguide01.home.cards.CardsViewModel
import com.example.spiritualguide01.home.cards.cardsModel.Card


class PathOfWisdomFragment : Fragment() {

    private lateinit var binding: FragmentPathOfWisdomBinding
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
        binding = FragmentPathOfWisdomBinding.inflate(inflater, container, false)
        return binding.root    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rotatingCard = binding.rotatingCardIV

        // Loading the simple, UNSHUFFLED List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        viewmodel.loadCardListFromDBinViewModel()
        var shuffledCardList: List<Card> =
            viewmodel.cardListSimple  // is not shuffled yet for educational purposes


        // Shuffeling Cards Button:
        binding.shuffleCardsBTN.setOnClickListener {
            // First Animation: Shaking
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
            // NOW we are actually shuffeling and using shuffled Card List:
            shuffledCardList = shuffledCardList.shuffled()
            // NOW we make "LAY"-Button visible:
            binding.layCardsBTN.visibility = View.VISIBLE
        }


        // Laying Cards Button:
        binding.layCardsBTN.setOnClickListener {

            //YoYo.with(Techniques.BounceInDown).playOn(backCard)

            // Connecting the pictures to the View (not visible yet), taking the shuffled cards from top (left) to bottom (right):
            var pic1 = shuffledCardList[0].picture
            binding.card1IV.setImageResource(pic1)
            var pic2 = shuffledCardList[1].picture
            binding.card2IV.setImageResource(pic2)
            var pic3 = shuffledCardList[2].picture
            binding.card03IV.setImageResource(pic3)
            var pic4 = shuffledCardList[3].picture
            binding.card04IV.setImageResource(pic4)
            var pic5 = shuffledCardList[4].picture
            binding.card05IV.setImageResource(pic5)
            var pic6 = shuffledCardList[5].picture
            binding.card06IV.setImageResource(pic6)
            var pic7 = shuffledCardList[6].picture
            binding.card07IV.setImageResource(pic7)


            // Appearing-Animation Card 01 - A:
            // CardBack comes fading in dowm...
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


            // Appearing-Animation Card 05 - A:
            binding.back05IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back05IV)

            // Appearing-Animation Card 05 - B:
            binding.back05IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card05IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back05IV.isVisible = false
                binding.card05IV.isVisible = true
                binding.card05IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(270f)
                }
            }


            // Appearing-Animation Card 06 - A:
            binding.back06IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back06IV)

            // Appearing-Animation Card 06 - B:
            binding.back06IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card06IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back06IV.isVisible = false
                binding.card06IV.isVisible = true
                binding.card06IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(270f)
                }
            }


            // Appearing-Animation Card 07 - A:
            binding.back07IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back07IV)

            // Appearing-Animation Card 07 - B:
            binding.back07IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card07IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back07IV.isVisible = false
                binding.card07IV.isVisible = true
                binding.card07IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(270f)

                }
            }

            // extra information popping up: present vs. future
            // coming from left:
            binding.presentTV.visibility = View.VISIBLE
            YoYo.with(Techniques.BounceInLeft).playOn(binding.presentTV)
            // coming from right:
            binding.futureTV.visibility = View.VISIBLE
            YoYo.with(Techniques.BounceInRight).playOn(binding.futureTV)
            // make "Interpretation"-Button visible:
            binding.interpretataionBTN.visibility = View.VISIBLE

            binding.interpretataionBTN.setOnClickListener {
                val id1  = shuffledCardList[0].id
                val id2  = shuffledCardList[1].id
                val id3  = shuffledCardList[2].id
                val id4  = shuffledCardList[3].id
                val id5  = shuffledCardList[4].id
                val id6  = shuffledCardList[5].id
                val id7  = shuffledCardList[6].id
                findNavController().navigate(PathOfWisdomFragmentDirections.actionPathOfWisdomFragmentToPathOfWisdomMeaningFragment(id1, id2, id3, id4,  id5,  id6, id7))
            }



        }
    }



}