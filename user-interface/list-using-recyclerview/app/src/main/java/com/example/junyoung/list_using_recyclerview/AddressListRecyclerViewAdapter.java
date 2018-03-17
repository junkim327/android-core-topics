package com.example.junyoung.list_using_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AddressListRecyclerViewAdapter extends RecyclerView.Adapter<AddressListRecyclerViewAdapter.ViewHolder> {
    private final List<Address> addressBook;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public TextView mTextViewName;
        public TextView mTextViewPhoneNumber;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTextViewName = view.findViewById(R.id.textview_name);
            mTextViewPhoneNumber = view.findViewById(R.id.textview_phonenumber);
        }
    }

    public AddressListRecyclerViewAdapter(List<Address> items) {
        this.addressBook = items;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);

        ViewHolder vh = new ViewHolder(itemView);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Address address = addressBook.get(position);
        holder.mTextViewName.setText(address.getName());
        holder.mTextViewPhoneNumber.setText(address.getPhoneNumber());
    }

    // Return the size of the address book (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return addressBook.size();
    }
}
