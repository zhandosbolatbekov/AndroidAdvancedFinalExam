package com.example.zhandos.contactlist;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class ContactInfoActivity extends AppCompatActivity {

    Contact contact = null;

    private ImageView ivAvatar;
    private TextView tvName;
    private TextView tvMobilePhone;
    private TextView tvHomePhone;
    private TextView tvWorkPhone;
    private TextView tvGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        ivAvatar = (ImageView) findViewById(R.id.ivContactAvatar);
        tvName = (TextView) findViewById(R.id.tvContactInfoName);
        tvMobilePhone = (TextView) findViewById(R.id.tvContactInfoMobilePhone);
        tvHomePhone = (TextView) findViewById(R.id.tvContactInfoHomePhone);
        tvWorkPhone = (TextView) findViewById(R.id.tvContactInfoWorkPhone);
        tvGroup = (TextView) findViewById(R.id.tvContactInfoGroup);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            contact = (Contact) extras.getSerializable("CONTACT");
            this.setTitle(contact.getName());
            tvName.setText(contact.getName());
            tvMobilePhone.setText(String.format("MOBILE: %s", contact.getMobilePhoneNumber()));
            tvHomePhone.setText(String.format("HOME: %s", contact.getHomePhoneNumber()));
            tvWorkPhone.setText(String.format("WORK: %s", contact.getWorkPhoneNumber()));
            tvGroup.setText(String.format("GROUP: %s", contact.getContactGroupId()));
            Picasso.with(this)
                    .load(contact.getAvatarUrl())
                    .into(ivAvatar);
        }
    }
}
