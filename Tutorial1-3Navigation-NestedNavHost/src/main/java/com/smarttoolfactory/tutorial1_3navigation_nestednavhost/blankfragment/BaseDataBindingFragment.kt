package com.smarttoolfactory.tutorial1_3navigation_nestednavhost.blankfragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 *
 */
abstract class BaseDataBindingFragment<ViewBinding : ViewDataBinding> : Fragment() {

    lateinit var dataBinding: ViewBinding

    @LayoutRes
    abstract fun getLayoutRes(): Int

    override fun onAttach(context: Context) {
        super.onAttach(context)
//        println("🥰 BaseDataBindingFragment onAttach() $this")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        println("😀 BaseDataBindingFragment onCreate() $this")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        println("🤣 BaseDataBindingFragment onCreateView() $this")
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, getLayoutRes(), container, false)
        return dataBinding.root
    }


    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
//        println("😱 BaseDataBindingFragment onAttachFragment() $this, CHILD: $childFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
//        println("🥵 BaseDataBindingFragment onDestroyView() $this")
    }

    override fun onDestroy() {
        super.onDestroy()
//        println("🥶 BaseDataBindingFragment onDestroy() $this")
    }

    override fun onDetach() {
        super.onDetach()
//        println("💀 BaseDataBindingFragment onDetach() $this")
    }

}