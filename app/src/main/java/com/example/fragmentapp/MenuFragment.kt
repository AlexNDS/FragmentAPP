package com.example.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MenuFragment : Fragment () {

    private lateinit var aboutbutton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        aboutbutton = view.findViewById(R.id.about_button)

        val aboutFragment = AboutFragment()
        aboutbutton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace( R.id.fragment_container,aboutFragment)
                ?.commit()

        }

        return view


    }


}