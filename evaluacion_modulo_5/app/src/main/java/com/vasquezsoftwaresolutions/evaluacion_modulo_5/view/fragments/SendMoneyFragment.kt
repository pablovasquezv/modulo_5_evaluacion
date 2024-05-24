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
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.databinding.FragmentSendMoneyBinding
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.viewmodels.SendMoneyViewModel

class SendMoneyFragment : Fragment() {

    private var _binding: FragmentSendMoneyBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = SendMoneyFragment()
    }

    private val viewModel: SendMoneyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSendMoneyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSendMoney.setOnClickListener {
            findNavController().navigate(R.id.action_sendMoneyFragment_to_homePageFragment)
        }
    }

    private fun sendMoney() {
        val amount = binding.txtMount.text.toString()
        val note = binding.txtNote.text.toString()

        // Verifica que todos los campos estén llenos
        if (amount.isEmpty() || note.isEmpty()) {
            Toast.makeText(context, "Debes añadir todos los datos", Toast.LENGTH_LONG).show()
            return
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}