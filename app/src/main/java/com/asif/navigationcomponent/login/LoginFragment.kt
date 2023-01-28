package com.asif.navigationcomponent.login


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.asif.navigationcomponent.R

import com.asif.navigationcomponent.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        navController = Navigation.findNavController(view)
        binding = FragmentLoginBinding.bind(view)
        binding.apply {
            loginBtn.setOnClickListener {
                if(binding.userNameEt.text?.isEmpty() == true || binding.userPasswordEt.text?.isEmpty() == true){
                    Toast.makeText(context, "Field is empty!!", Toast.LENGTH_SHORT).show()
                }else{
                    sendData(view)
                }
            }
        }
    }

    private fun sendData(view: View) {
        val action = LoginFragmentDirections.actionLoginFragmentToHomepageFragment(binding.userNameEt.text.toString(),binding.userPasswordEt.text.toString())
        Navigation.findNavController(view).navigate(action)
    }


}

