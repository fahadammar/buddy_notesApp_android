package com.example.buddynotespractiseapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buddynotespractiseapp.R
import com.example.buddynotespractiseapp.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class loginFragment : Fragment() {
    var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)


        onClicks(binding)

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun onClicks(binding: FragmentLoginBinding) {
        binding.btnSignUp.setOnClickListener { }

        binding.btnLogin.setOnClickListener {
            // Going to the main fragment
            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // in on destroy lifecycle the view is destroyed. Hence, we also set the binding to null
        // to free the memory
        _binding = null
    }
}