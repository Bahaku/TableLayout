package com.example.tablelayout


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottomnav.*
import kotlinx.android.synthetic.main.activity_tablayout.*

class BottomNavActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomnav)
        setupBottomNav()
        setupListener()
    }

   private fun setupBottomNav() {
        val adapter = ViewAdapter(supportFragmentManager)
        viewPager1.adapter = adapter
        adapter.fragmentUpdate(FragmentBotttom1())
       adapter.fragmentUpdate(FragmentBotttom2())
       adapter.fragmentUpdate(FragmentBotttom3())
    }
    private fun setupListener(){
        botNav.setOnNavigationItemSelectedListener {
            when(it.itemId)     {
                R.id.music->viewPager1.currentItem = 0
                R.id.settings->viewPager1.currentItem = 1
                R.id.profile->viewPager1.currentItem = 2


            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
