package com.example.navigationcomponents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.navigationcomponents.R


/**
 * A simple [Fragment] subclass.
 * Use the [FifthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FifthFragment : Fragment() {

    private lateinit var tv_fifth : TextView
    private lateinit var btn_global : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_fifth = view.findViewById(R.id.tv_fifth)
        btn_global = view.findViewById(R.id.btn_global)

        btn_global.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_global_seventhFragment)
        }

        tv_fifth.setOnClickListener {
            val num = 9489694600
            val bundle = Bundle().apply {
                putString("Name", "ChibiRagu")
                putLong("PhoneNumber", num)
            }

            // Send bundle through the navigation
            Navigation.findNavController(view).navigate(R.id.action_fifthFragment_to_fourthFragment2,bundle)
        }


    }

}