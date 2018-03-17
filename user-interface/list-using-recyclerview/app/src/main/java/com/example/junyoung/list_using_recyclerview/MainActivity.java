package com.example.junyoung.list_using_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private List<Address> addressBook = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_list);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        generateAddressData();
        recyclerView.setAdapter(new AddressListRecyclerViewAdapter(addressBook));
    }

    private void generateAddressData() {
        Address address = new Address("Jason", "978-339-3356");
        addressBook.add(address);

        address = new Address("Steven", "978-445-3396");
        addressBook.add(address);

        address = new Address("Sai", "934-597-9989");
        addressBook.add(address);

        address = new Address("Jun", "257-593-3397");
        addressBook.add(address);

        address = new Address("James", "382-324-2384");
        addressBook.add(address);

        address = new Address("Hai", "879-635-5461");
        addressBook.add(address);

        address = new Address("Eric", "293-183-2832");
        addressBook.add(address);

        address = new Address("Steven", "978-445-3396");
        addressBook.add(address);

        address = new Address("Sai", "934-597-9989");
        addressBook.add(address);

        address = new Address("Jun", "257-593-3397");
        addressBook.add(address);

        address = new Address("James", "382-324-2384");
        addressBook.add(address);

        address = new Address("Hai", "879-635-5461");
        addressBook.add(address);

        address = new Address("Eric", "293-183-2832");
        addressBook.add(address);
    }
}
