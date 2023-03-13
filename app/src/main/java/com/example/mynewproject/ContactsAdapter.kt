package com.example.mynewproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter : RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {

    private var contactsList = emptyList<Contact>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_view_holder, parent, false)
        return ContactsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentItem = contactsList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = contactsList.size

    class ContactsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val zagalovok = view.findViewById<TextView>(R.id.zagalovok_text_view)
        private val opisanie = view.findViewById<TextView>(R.id.opisanie_text_view)
        private val image = view.findViewById<ImageView>(R.id.image_view)

        fun bind(contact: Contact) {
            zagalovok.text = contact.zagalovok
            opisanie.text = contact.opisanie
        }
    }

    fun setData(contactsList: List<Contact>) {
        this.contactsList = contactsList
        notifyDataSetChanged()
    }
}
