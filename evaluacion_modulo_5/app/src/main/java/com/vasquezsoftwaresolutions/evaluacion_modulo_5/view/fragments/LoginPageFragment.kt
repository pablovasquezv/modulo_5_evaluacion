package com.vasquezsoftwaresolutions.evaluacion_modulo_5.view.fragments

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.R
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.databinding.FragmentLoginPageBinding
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.viewmodels.LoginPageViewModel

class LoginPageFragment : Fragment() {

    private var _binding: FragmentLoginPageBinding? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = LoginPageFragment()
    }

    private val viewModel: LoginPageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtVCreatAccount.setOnClickListener {
            findNavController().navigate(R.id.action_loginPage_to_singnupPageFragment)
        }
        binding.btnLoginPage.setOnClickListener {
            findNavController().navigate(R.id.action_loginPage_to_homePageEmptyCaseFragment)
        }

    }

    private fun login() {
        val email = binding.editTxtEmailAddress.text.toString()
        val pass = binding.editTxtPass.text.toString()
        // Verifica que todos los campos estén llenos
        if (email.isEmpty() || pass.isEmpty() ) {
            Toast.makeText(context, "Debes añadir todos los datos", Toast.LENGTH_LONG).show()
            return
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}