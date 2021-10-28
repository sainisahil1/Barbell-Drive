package io.sahil.barbelldrive.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.sahil.barbelldrive.R
import io.sahil.barbelldrive.databinding.ExerciseItemLayoutBinding

class ExerciseAdapter: RecyclerView.Adapter<ExerciseAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ExerciseItemLayoutBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ExerciseItemLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.exercise_item_layout, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 4
    }


}