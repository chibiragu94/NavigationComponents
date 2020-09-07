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
 * Use the [SeventhFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SeventhFragment : Fragment() {

    private lateinit var tv_seventh : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seventh, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_seventh = view.findViewById(R.id.tv_seventh)

        tv_seventh.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_seventhFragment_to_fifthFragment2)
        }
    }

}