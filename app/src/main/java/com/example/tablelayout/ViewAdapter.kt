package com.example.tablelayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewAdapter(manager: FragmentManager): FragmentStatePagerAdapter(manager) {

    private val list = arrayListOf<Fragment>()

    fun fragmentUpdate(fragment: Fragment){
        list.add(fragment)
        notifyDataSetChanged()
    }

    override fun getItem(position: Int) = list[position]
    override fun getCount():Int = list.size


}