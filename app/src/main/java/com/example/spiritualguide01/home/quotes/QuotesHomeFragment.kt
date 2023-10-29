package com.example.spiritualguide01.home.quotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.spiritualguide01.databinding.FragmentQuotesHomeBinding


class QuotesHomeFragment : Fragment() {


    private lateinit var binding: FragmentQuotesHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuotesHomeBinding.inflate(inflater, container, false)
        return binding.root
    }




    override fun onDestroyView() {
        super.onDestroyView()
    }
}