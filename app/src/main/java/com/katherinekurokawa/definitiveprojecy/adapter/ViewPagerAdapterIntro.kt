package com.katherinekurokawa.definitiveprojecy.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.katherinekurokawa.definitiveprojecy.LoginUserFragment
import com.katherinekurokawa.definitiveprojecy.ui.IntroFragment

class ViewPagerAdapterIntro(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    private val fragments = listOf(
        IntroFragment(),
        LoginUserFragment()
    )

    override fun createFragment(position: Int): Fragment =fragments[position]

    override fun getItemCount(): Int = fragments.size


}