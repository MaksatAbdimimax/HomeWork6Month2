package com.geeks.homework6month2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.homework6month2.databinding.ItemUserBinding;
import com.geeks.homework6month2.databinding.ItemUserSecondBinding;

import java.util.ArrayList;

public class UserSecondAdapter extends RecyclerView.Adapter<UserSecondAdapter.UserSecondViewHolder> {



    private ArrayList<UserSecond> userArrayList;

    public UserSecondAdapter(ArrayList<UserSecond> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public UserSecondAdapter.UserSecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemUserSecondBinding binding = ItemUserSecondBinding.inflate(LayoutInflater.from(parent.getContext()),parent,
                false);
        return new UserSecondAdapter.UserSecondViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserSecondAdapter.UserSecondViewHolder holder, int position) {
        holder.bind(userArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public static class UserSecondViewHolder extends RecyclerView.ViewHolder{

        private ItemUserSecondBinding binding;

        public UserSecondViewHolder(ItemUserSecondBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind (UserSecond userSecond){
            binding.tvName.setText(userSecond.getName());
            binding.tvAge.setText(userSecond.getAge().toString());
            Glide.with(itemView.getContext()).load(userSecond.getAvatarUrl()).into(binding.imageView);
        }

    }
}
