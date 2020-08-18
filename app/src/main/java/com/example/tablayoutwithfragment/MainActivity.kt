package com.example.tablayoutwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.tablayoutwithfragment.Adapter.ViewPagerAdapter
import com.example.tablayoutwithfragment.Fragment.FavoriteFragment
import com.example.tablayoutwithfragment.Fragment.HomeFragment
import com.example.tablayoutwithfragment.Fragment.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoriteFragment(), "Favourite")
        adapter.addFragment(SettingFragment(), "Settings")
        viewpager.adapter = adapter

        tabLayout.setupWithViewPager(viewpager)
    }
}