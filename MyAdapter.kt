package com.example.postapidataview

//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.TextView
//
//class MyAdapter(val userdetails:ArrayList<DataModal>,val Context: Context):BaseAdapter(){
//    override fun getCount(): Int {
//        return userdetails.size
//    }
//
//    override fun getItem(position: Int): Any {
//        return userdetails[position]
//    }
//
//    override fun getItemId(position : Int): Long {
//       return position.toLong()
//    }
//
//    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
//        val list=LayoutInflater.from(parent?.context).inflate(R.layout.item_list, parent, false)
//       val username=list.findViewById<TextView>(R.id.username)
//        val email=list.findViewById<TextView>(R.id.email)
//        val password=list.findViewById<TextView>(R.id.password)
//        username.text=userdetails[position].toString()
//        email.text=userdetails[position].toString()
//        password.text=userdetails[position].toString()
//
//
//  return list
//
//    }
//
//
//}