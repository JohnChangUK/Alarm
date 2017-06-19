package com.hussein.startup

import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class PopTime:DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var myView = inflater.inflate(R.layout.pop_time, container, false)


        var buDone = myView.findViewById(R.id.buDone) as Button

        buDone.setOnClickListener({
            // 
        })

        return myView
    }
}