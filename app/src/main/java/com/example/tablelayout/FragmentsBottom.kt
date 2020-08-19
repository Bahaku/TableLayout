package com.example.tablelayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class FragmentsBottom: Fragment(){

    protected abstract fun resId(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(resId(), container, false)
    }
}
class FragmentBotttom1: FragmentsBottom() {
    override fun resId() = R.layout.fragment_music
}


class FragmentBotttom2: FragmentsBottom() {
    override fun resId() = R.layout.fragment_settings
}


class FragmentBotttom3: FragmentsBottom() {
    override fun resId() = R.layout.fragment_profile
}