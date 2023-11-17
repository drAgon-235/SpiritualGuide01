package com.example.spiritualguide01.home.cards.cardsUI.allCardsRVFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.spiritualguide01.R
import com.example.spiritualguide01.databinding.FragmentAllCardsRvBinding
import com.example.spiritualguide01.home.cards.CardsViewModel


class AllCardsRVFragment : Fragment() {

    private lateinit var binding: FragmentAllCardsRvBinding
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
        binding = FragmentAllCardsRvBinding.inflate(inflater, container, false)
        return binding.root      }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // !! All Recyclerviews are using the same Adapter simultanously !!

        //Major Arcana Recyclerview observing LiveData:
        // Load Database to VM used here:
        viewmodel.loadCardsFromDBinVMasLD()
        //bind recyclerview to this Fragment:
        val recyclerView = binding.cardsListRV
        //optimize occurence of RV:
        recyclerView.hasFixedSize()
        //Observing theVM's LD 'cardListLD' and attach to Adapter
        viewmodel.cardsListLD.observe(viewLifecycleOwner){
            recyclerView.adapter = AllCardsRVAdapter(it)
        }

        //CUPS Recyclerview observing LiveData:
        viewmodel.loadCUPSFromDBinVWasLD()
        val recyclerViewCups = binding.cupsListRV
        recyclerViewCups.hasFixedSize()
        viewmodel.cardsListLD.observe(viewLifecycleOwner) {
            recyclerViewCups.adapter = AllCardsRVAdapter(it)
        }

        //SWORDS Recyclerview observing LiveData:
        viewmodel.loadSWORDSFromDBinVMasLD()
        val recyclerViewSWORDS = binding.swordsListRV
        recyclerViewSWORDS.hasFixedSize()
        viewmodel.cardsListLD.observe(viewLifecycleOwner) {
            recyclerViewSWORDS.adapter = AllCardsRVAdapter(it)
        }

        //Wands Recyclerview observing LiveData:
        viewmodel.loadWANDSFromDBinVMasLD()
        val recyclerViewWANDS = binding.wandsListRV
        recyclerViewWANDS.hasFixedSize()
        viewmodel.cardsListLD.observe(viewLifecycleOwner) {
            recyclerViewWANDS.adapter = AllCardsRVAdapter(it)
        }

        //Coins Recyclerview observing LiveData:
        viewmodel.loadCOINSFromDBinVMasLD()
        val recyclerViewCOINS = binding.coinsListRV
        recyclerViewCOINS.hasFixedSize()
        viewmodel.cardsListLD.observe(viewLifecycleOwner) {
            recyclerViewCOINS.adapter = AllCardsRVAdapter(it)
        }


    }


}