package io.sahil.barbelldrive.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.sahil.barbelldrive.R
import io.sahil.barbelldrive.databinding.WeekItemLayoutBinding

class DayAdapter(val context: Context) : RecyclerView.Adapter<DayAdapter.ViewHolder>(){

    class ViewHolder(private val binding: WeekItemLayoutBinding, private val context: Context) : RecyclerView.ViewHolder(binding.root) {

        fun bind(){
            binding.exerciseRecyclerview.layoutManager = LinearLayoutManager(context)
            binding.exerciseRecyclerview.adapter = ExerciseAdapter()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: WeekItemLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.week_item_layout, parent, false)
        return ViewHolder(binding, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 3
    }

}