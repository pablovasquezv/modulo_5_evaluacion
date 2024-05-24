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
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.databinding.FragmentRequestMoneyBinding
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.viewmodels.RequestMoneyViewModel

class RequestMoneyFragment : Fragment() {

    private var _binding: FragmentRequestMoneyBinding?= null
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = RequestMoneyFragment()
    }

    private val viewModel: RequestMoneyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentRequestMoneyBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRequestMoney.setOnClickListener {
            findNavController().navigate(R.id.action_requestMoneyFragment_to_homePageFragment)
        }
    }

    private fun requestMoney(){
        val amount = binding.txtReqMoney.text.toString()
        val note = binding.txtRequestMoneyNote.text.toString()
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