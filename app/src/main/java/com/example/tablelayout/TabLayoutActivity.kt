package com.example.tablelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_tablayout.*

class TabLayoutActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout)

        setupViewPager()
    }

    private fun setupViewPager(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter
        adapter.update(FragmentTab(), "Первое")
        adapter.update(FragmentTab2(), "Второе")
        tLay.setupWithViewPager(viewPager)
    }
}