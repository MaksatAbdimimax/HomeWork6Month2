package com.geeks.homework6month2;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.geeks.homework6month2.databinding.ItemUserBinding;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private ArrayList<User> userArrayList;
    private OnItemClickListener listener;
    private int selectedItemPosition = RecyclerView.NO_POSITION;

    public UserAdapter(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
    public void moveItemToTop(int fromPosition) {
        if (fromPosition >= 0 && fromPosition < userArrayList.size()) {
            User itemToMove = userArrayList.remove(fromPosition);
            userArrayList.add(0, itemToMove);
            notifyItemMoved(fromPosition, 0);
        }
    }

    public void setSelectedItemPosition(int position) {
        int previousPosition = selectedItemPosition;
        selectedItemPosition = position;
        //dvuh
        notifyItemChanged(previousPosition);
        notifyItemChanged(selectedItemPosition);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemUserBinding binding = ItemUserBinding.inflate(LayoutInflater.from(parent.getContext()),parent,
                false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.bind(userArrayList.get(position),position);


    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{

        private ItemUserBinding binding;

        public UserViewHolder(ItemUserBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            // setOnklilik
            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            });

        }

        public void bind (User user,int position){

            //na binf
            binding.getRoot().setSelected(selectedItemPosition == position);

            binding.getRoot().setBackgroundColor(
                    selectedItemPosition == position ? Color.YELLOW : Color.WHITE
            );

            binding.tvName.setText(user.getName());
            binding.tvAge.setText(user.getAge().toString());
            Glide.with(itemView.getContext()).load(user.getAvatarUrl()).into(binding.imageView);
        }

    }


}
