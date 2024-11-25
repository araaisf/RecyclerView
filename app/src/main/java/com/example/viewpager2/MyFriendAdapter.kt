package com.example.viewpager2
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyFriendAdapter(private val friends:List<MyFriend>) :
    RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {

        inner class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){
            val name: TextView = itemView.findViewById(R.id.tvName)
            val phone:  TextView = itemView.findViewById(R.id.tvPhone)
            val email:  TextView = itemView.findViewById(R.id.tvEmail)
            val alamat: TextView = itemView.findViewById(R.id.tvAlamat)
            val image: ImageView = itemView.findViewById(R.id.imageDefault)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_friend_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend = friends[position]
        holder.name.text = friend.name
        holder.phone.text = friend.phone
        holder.email.text = friend.email
        holder.alamat.text = friend.alamat
        holder.image.setImageResource(friend.image)


    }

    override fun getItemCount(): Int = friends.size

}