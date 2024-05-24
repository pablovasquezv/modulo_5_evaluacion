package com.vasquezsoftwaresolutions.evaluacion_modulo_5.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.R
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.Account
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.databinding.FragmentSingnupPageBinding
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.viewmodels.SignupPageViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SingnupPageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SingnupPageFragment : Fragment() {

    private  var _binding : FragmentSingnupPageBinding? = null
    private val viewModel: SignupPageViewModel by activityViewModels()

    private val binding get() = _binding!!
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSingnupPageBinding.inflate(inflater, container,false)
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SingnupPageFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SingnupPageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtVYaTienesCuentaSingUpPage.setOnClickListener{
            findNavController().navigate(R.id.action_singnupPageFragment_to_loginPage)
        }
        binding.btnSingUpPage.setOnClickListener {
            findNavController().navigate(R.id.action_singnupPageFragment_to_loginPage)
        }
    }
    private fun createAccount() {
        val firstName = binding.editTxtnombreSingUpPage.text.toString()
        val lastName = binding.editTxtApellidosSingUpPage.text.toString()
        val email = binding.editTxtEmailSingUpPage.text.toString()
        val pass = binding.editTxtContrasenyaSingUpPage.text.toString()
        val repeatPass= binding.editTxtRecontrasenyaSingUpPage.text.toString()

        // Verifica que todos los campos estén llenos
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || pass.isEmpty() ||
            repeatPass.isEmpty()) {
            Toast.makeText(context, "Debes añadir todos los datos", Toast.LENGTH_LONG).show()
            return
        }

        // Crea una nueva tarea y la inserta en el ViewModel
        val newAccount = Account(
            firstNameAccount =firstName,
            lastNameAccount =lastName,
            emailAccount =email,
            passwordAccount= pass

        )
        viewModel.inserAccount(newAccount)
        Toast.makeText(context, "Cuenta creada exitosamente", Toast.LENGTH_SHORT).show()
        navigateToLogin()

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun navigateToLogin() {

        findNavController().navigate(R.id.action_singnupPageFragment_to_loginPage)
    }

}