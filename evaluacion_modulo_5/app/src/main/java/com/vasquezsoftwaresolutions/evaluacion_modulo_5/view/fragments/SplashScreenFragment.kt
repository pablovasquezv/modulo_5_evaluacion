package com.vasquezsoftwaresolutions.evaluacion_modulo_5.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.R
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.databinding.FragmentSplashScreenBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SplashScreenFragment : Fragment() {

    private var _binding: FragmentSplashScreenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_SplashScreen_to_LoginSignupPageFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}