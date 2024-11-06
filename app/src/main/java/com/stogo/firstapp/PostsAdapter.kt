package com.stogo.firstapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PostsAdapter(
    mContext: Context,
    private val resource: Int,
    private val values: List<String>
) : ArrayAdapter<String>(mContext, resource, values) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = convertView ?: LayoutInflater.from(context).inflate(resource, parent, false)


        val post = values[position]

        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = post

        return view
    }
}
