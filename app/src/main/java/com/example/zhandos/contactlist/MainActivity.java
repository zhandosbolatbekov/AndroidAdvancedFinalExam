package com.example.zhandos.contactlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button createContactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.main_list_recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        createContactBtn = (Button) findViewById(R.id.btnCreateContact);
        createContactBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddContactActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        retrieveData();
    }

    private void retrieveData() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(
                new Contact("1",
                        "Zhandos Bolatbekov",
                        "87774074100",
                        "87774074100",
                        "87774074100",
                        "https://www.google.kz/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiuhv6Y8ZbfAhUG1SwKHXekCvkQjRx6BAgBEAU&url=https%3A%2F%2Fwww.producthunt.com%2Fposts%2Favataaars&psig=AOvVaw3QhJzt-LbVCFPwc3CTJvIo&ust=1544587005063270",
                        "1"
                )
        );
        contactList.add(
                new Contact("2",
                        "Alikhan Bakytbek",
                        "87774074100",
                        "87774074100",
                        "87774074100",
                        "https://www.google.kz/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiuhv6Y8ZbfAhUG1SwKHXekCvkQjRx6BAgBEAU&url=https%3A%2F%2Fwww.producthunt.com%2Fposts%2Favataaars&psig=AOvVaw3QhJzt-LbVCFPwc3CTJvIo&ust=1544587005063270",
                        "2"
                )
        );
        showContactList(contactList);
    }

    private void showContactList(List<Contact> list) {
        MainListAdapter myAdapter = new MainListAdapter(this, list);
        recyclerView.setAdapter(myAdapter);
    }
}
