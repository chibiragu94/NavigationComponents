package com.example.navigationcomponents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.navigationcomponents.R


/**
 * A simple [Fragment] subclass.
 * Use the [FourthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FourthFragment : Fragment() {

    private var param1: String? = null
    private var param2: Long? = null
    private lateinit var tv_fourth : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("Name")
            param2 = it.getLong("PhoneNumber")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_fourth = view.findViewById(R.id.tv_fourth)

        tv_fourth.text = "Result $param1 PhoneNumber : $param2"

        tv_fourth.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fourthFragment2_to_sixthFragment)
        }
    }
}