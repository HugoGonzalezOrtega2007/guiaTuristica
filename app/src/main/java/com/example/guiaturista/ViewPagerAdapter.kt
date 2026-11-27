package com.example.guiaturista

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> LugarFragment.newInstance("Lugares")
            1 -> ComidasFragment.newInstance("Comidas")
            2 -> ActividadesFragment.newInstance("Actividades")
            else -> LugarFragment.newInstance("Lugares")
        }
    }
}