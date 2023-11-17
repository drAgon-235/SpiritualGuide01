package com.example.spiritualguide01.home.quotes.uiModels.quoteOfDayFrag

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val likedLogo =
            binding.favoriteBorderIV.setImageResource(R.drawable.baseline_favorite_border_24)
        val notLikedLogo = binding.favoriteFullIV.setImageResource(R.drawable.baseline_favorite_24)
        val shareLogo = binding.shareIV.setImageResource(R.drawable.baseline_share_24)
        //val favListLogo = binding.favoriteListIV.setImageResource(R.drawable.baseline_view_list_24)

        // The Day Quote live from API:
        val finalDayQuote = viewmodel.dayQuote
        viewmodel.dayQuote.observe(viewLifecycleOwner) {
            binding.quoteOfTheDayTV.setText(finalDayQuote.value!!.q)
            binding.sourceTV.setText(finalDayQuote.value!!.a)
        }



        //var newIndex = viewModelFavQuotes.favQuotesListLD.value!!.lastIndex + 1

        // Saving the Quote of the Day into Favorites-DB:
        binding.likingCV.setOnClickListener {
            binding.favoriteFullIV.visibility = View.VISIBLE

            try {
                Log.d(TAG, "Start: INSERTING Quote of the Day into FavoriteQuotesDB!")
                // TODO: fun checking if Quote already is in the DB - avoiding doublettes

                viewModelFavQuotes.insertFavQuoteVM(
                    //Creating new FavoriteQuote Object for the DB to insert into:
                    FavoriteQuote(
                        binding.quoteOfTheDayTV.text.toString(),
                        binding.sourceTV.text.toString(),
                        // by omitting the variable "id" I enable the FavoriteQuote-RoomDB to generate it automatically - that was my "FAVORITE" BUG ;-)
                        // this only works, when we set id = 0 in the "FavoriteQuote" class
                    )
                    // TODO: Timer in case of "offline" - otherwise nothing happens .....
                )
                Log.d(TAG, "Finish: INSERTING Quote of the Day into FavoriteQuotesDB Successful!")
            } catch (e: Exception) {
                // In case the API doesn't work or you're simply offline:
                Log.e(TAG, "ERROR: INSERTING Quote of the Day into FavoriteQuotesDB!")
                // User-friendly Information Toast:
                Toast.makeText(context, "API Error", Toast.LENGTH_LONG).show()
                // Very user-friendly navigation to...:
                findNavController().navigate(QuoteFragmentDirections.actionQuoteFragmentToFavoriteQrvFragment())
                // OR
                //findNavController().navigate(QuoteFragmentDirections.actionQuoteFragmentToNavigationDashboard())

            }

            // Toast confirming the saving process the (The toast adapts it's language automatically through the strings.xml):
            Toast.makeText(context, R.string.quotes_saved_toast, Toast.LENGTH_LONG).show()

            findNavController().navigate(QuoteFragmentDirections.actionQuoteFragmentToFavoriteQrvFragment())

        }


    }


}