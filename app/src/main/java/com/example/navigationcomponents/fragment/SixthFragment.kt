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
 * Use the [SixthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SixthFragment : Fragment() {

    private lateinit var tv_sixth : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sixth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_sixth = view.findViewById(R.id.tv_sixth)

        tv_sixth.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sixthFragment_to_seventhFragment)
        }
    }

}