package com.vasquezsoftwaresolutions.evaluacion_modulo_5.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.R
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.databinding.FragmentLoginSignupPageBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class LoginSignupPageFragment : Fragment() {

    private var _binding: FragmentLoginSignupPageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginSignupPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSecond.setOnClickListener{
            findNavController().navigate(R.id.action_LoginSignupPage_to_SplashScreen)
        }

        binding.btnSingUpPage.setOnClickListener {
            findNavController().navigate(R.id.action_LoginSignupPage_to_singnupPageFragment)
        }

        binding.txtVCreatAccount.setOnClickListener{
            findNavController().navigate(R.id.action_LoginSignupPage_to_loginPage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}