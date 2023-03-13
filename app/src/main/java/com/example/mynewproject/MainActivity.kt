package com.example.mynewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val contactsRecyclerView = findViewById<RecyclerView>(R.id.contacts_recycler_view)
        val contactsAdapter = ContactsAdapter()
        contactsRecyclerView.adapter = contactsAdapter
        contactsRecyclerView.layoutManager = LinearLayoutManager(this)
        contactsAdapter.setData(Data.contactList)

    }
}