package com.example.mypc.listviewbaseadapterviewholder;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {


    private RecyclerView recyclerView;
    private CustomListAdapter customListAdapter;
    private List<Items> mList;
    private int a=R.drawable.a2;
    private static int timeInt=0;
    private String time=String.valueOf(timeInt);
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        buttonClick();
        addArrayList();

    }
    private void setRecycleView() {
        recyclerView.setHasFixedSize(true);

        customListAdapter = new CustomListAdapter(this,mList);
        recyclerView.setAdapter(customListAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void addControl() {
        recyclerView = (RecyclerView) findViewById(R.id.cardList);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
    }

    private void addArrayList() {
        mList = new ArrayList<>();
        mList.clear();
        mList.add(new Items("Việt",a,time));
        mList.add(new Items("Ngân",a,time));
        mList.add(new Items("Liên",a,time));
        mList.add(new Items("Chó",a,time));
        mList.add(new Items("Mèo",a,time));
        setRecycleView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case
                R.id.button :
                click();
                break;
            case
                R.id.button2:
                click2();
                break;
        }
    }

    private void click2() {
        timeInt-=1;
        time = String.valueOf(timeInt);
        addArrayList();
    }

    private void click() {
        timeInt+=1;
        time=String.valueOf(timeInt);
        addArrayList();
    }
    public void buttonClick(){
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
}
