package io.sahil.barbelldrive.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.sahil.barbelldrive.R
import io.sahil.barbelldrive.databinding.FragmentHomeBinding
import io.sahil.barbelldrive.ui.adapters.DayAdapter

class HomeFragment: Fragment() {

    private lateinit var fragmentContext: Context
    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.fragmentContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        initStaticView()

        return fragmentHomeBinding.root
    }


    private fun initStaticView(){
        fragmentHomeBinding.dayRecyclerview.adapter = DayAdapter(fragmentContext)
        fragmentHomeBinding.dayRecyclerview.layoutManager = LinearLayoutManager(fragmentContext)
    }





}