package com.example.buddynotespractiseapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.buddynotespractiseapp.R
import com.example.buddynotespractiseapp.databinding.FragmentRegisterBinding
import com.example.buddynotespractiseapp.model.UserRequest
import com.example.buddynotespractiseapp.viewmodel.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class registerFragment : Fragment() {

    var _binding : FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    private val authViewModel by viewModels<AuthViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)

        onClicks(binding)


        return binding.root
    }

    private fun onClicks(binding: FragmentRegisterBinding) {
        binding.btnLogin.setOnClickListener {
            // Here through the API we login the user
            authViewModel.loginUser( returnUserRequest() )

            // Taking the user to the login fragment
            //findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

        binding.btnSignUp.setOnClickListener {
            // Here through the API we register the user
            authViewModel.registerUser( returnUserRequest() )

            // Taking the user to the main fragment
            //findNavController().navigate(R.id.action_registerFragment_to_mainFragment)
        }

    }

    private fun returnUserRequest(): UserRequest {
        return UserRequest(
            "buddycode@gmail.com",
            "00112244",
            "buddy"
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}