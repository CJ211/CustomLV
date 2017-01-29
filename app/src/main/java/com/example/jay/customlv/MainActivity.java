package com.example.jay.customlv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<String> mContacts;
    private ArrayList<String> mphoneno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.lv_main);

        mContacts = new ArrayList<>();

        mContacts.add("Aai");
        mContacts.add("Bapu");
        mContacts.add("Dada");
        mContacts.add("Jyotin");
        mContacts.add("Bakula");
        mContacts.add("Nidhi");
        mContacts.add("Jay");

        mphoneno = new ArrayList<>();

        mphoneno.add("8182345547");
        mphoneno.add("8182345477");
        mphoneno.add("8185423479");
        mphoneno.add("8108234747");
        mphoneno.add("8108044444");
        mphoneno.add("8652251006");
        mphoneno.add("8652251112");

        mListView.setAdapter(new MyAdapter());
    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mContacts.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            View rowview;

            if(convertView != null)
            {
                rowview=convertView;
            }

            else
            {
                rowview = getLayoutInflater().inflate(R.layout.list_row_view, parent, false);
            }

            TextView contactname = (TextView) rowview.findViewById(R.id.name_list);
            contactname.setText(mContacts.get(i));

            TextView phoneno = (TextView) rowview.findViewById(R.id.phone_list);
            phoneno.setText(mphoneno.get(i));

            return rowview;
        }
    }
}
