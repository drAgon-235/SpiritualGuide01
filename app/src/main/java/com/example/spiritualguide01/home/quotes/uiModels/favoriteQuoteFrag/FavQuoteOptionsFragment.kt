package com.example.spiritualguide01.home.quotes.uiModels.favoriteQuoteFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.spiritualguide01.R
import com.example.spiritualguide01.databinding.FragmentFavQuoteOptionsBinding


class FavQuoteOptionsFragment : Fragment() {

    private lateinit var binding: FragmentFavQuoteOptionsBinding
    private val viewModel: FavQuotesViewModel by activityViewModels()
    private var favQuoteID: Long = 0


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
        binding = FragmentFavQuoteOptionsBinding.inflate(inflater, container, false)
        return binding.root      }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val shareLogo = binding.shareIV.setImageResource(R.drawable.baseline_share_24)
        val deleteLogo = binding.deleteIV.setImageResource(R.drawable.baseline_delete_forever_24)


        // Gettiing the Argument-ID:
        favQuoteID = requireArguments().getLong("favQuoteIDText")

        //Finding the Quote using the Key (from the argument in the nav_graph):
        val favQuote = viewModel.favQuotesListLD.value?.find { it.id == favQuoteID } ?: return

        // Now set the Data into fields again:
        binding.quoteOfTheDayTV.setText(favQuote.q)
        binding.sourceTV.setText(favQuote.a)

        // Delete Button:
        binding.dislikingCV.setOnClickListener {
            // Delete the selected Favorite Quote from the List:
            viewModel.deleteByIdNrVM(favQuote.id)

            // Changing the UI:
            // 1. Confirmation text in the quoteCV:
            binding.quoteOfTheDayTV.setText(". . .")
            binding.sourceTV.setText(". . .")
            // 2. Change the color ot text and CV-Background
            binding.quoteOfTheDayTV.setTextColor(0xFFFFFFFF.toInt())
            binding.sourceTV.setTextColor(0xFFFFFFFF.toInt())
            binding.quoteCV.setBackgroundColor(0xFFFD8989.toInt())
            // 3. Make share-button and delete-button invisible:
            binding.dislikingCV.visibility = View.INVISIBLE
            binding.shareCV.visibility = View.INVISIBLE

            // The toast adapts it's language automatically through the strings.xml:
            Toast.makeText(context, R.string.quotes_options_deleted_toast, Toast.LENGTH_LONG).show()
        }


        // Share Button:
        // TODO :

    }


}