package com.example.buddynotespractiseapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.buddynotespractiseapp.R
import com.example.buddynotespractiseapp.databinding.FragmentLoginBinding

class loginFragment : Fragment() {
    var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        // in on destroy lifecycle the view is destroyed. Hence, we also set the binding to null
        // to free the memory
        _binding = null
    }
}