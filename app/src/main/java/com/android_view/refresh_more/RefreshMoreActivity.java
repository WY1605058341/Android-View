package com.android_view.refresh_more;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android_view.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefreshMoreActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private MyRecyclerViewAdapter adapter;

    private List<String> data = new ArrayList<>();

    private Adapter madapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for (int i = 0; i < 20; i++) {
            data.add("item  " + i);
        }


        setContentView(R.layout.activity_refresh_more);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        madapter = new Adapter(RefreshMoreActivity.this, data);


        adapter = new MyRecyclerViewAdapter(madapter, headerViewList(), footerViewList());


        recyclerView.setAdapter(adapter);

    }


    private ArrayList<View> headerViewList() {
        ArrayList<View> header = new ArrayList<>();
        View view = LayoutInflater.from(RefreshMoreActivity.this).inflate(R.layout.header_view, null);
        header.add(view);
        return header;
    }


    private ArrayList<View> footerViewList() {
        ArrayList<View> footer = new ArrayList<>();
        View view = LayoutInflater.from(RefreshMoreActivity.this).inflate(R.layout.footer_view, null);
        footer.add(view);
        return footer;
    }


}
