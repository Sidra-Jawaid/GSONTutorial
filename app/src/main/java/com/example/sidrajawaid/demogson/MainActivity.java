package com.example.sidrajawaid.demogson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    ListView list_view;
    Gson gson;
    ArrayList arrayList=new ArrayList();
    ResponceClass responceObj;
    AsyncHttpClient asyncHttpClient;
    String url="https://www.googleapis.com/blogger/v3/blogs/2399953/?key=AIzaSyB29icAJiwTCotW6Q-Vwn4VLbD2B9ZGppM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*list_view=findViewById(R.id.listview);
        Gson gson=new Gson();
        *//*String jsonobj=gson.toJson(new NewClass("Abc",12,"xyz@abc.com"));*//*
        String json="{\"age\":\"12\",\"email\":\"xyz@abc.com\",\"name\":\"Abc\"}";
        NewClass employee=gson.fromJson(json,NewClass.class);
        ArrayList arrayList=new ArrayList();
        arrayList.add("");*/
        list_view=findViewById(R.id.listview);
        //arrayList=new ArrayList<>();
        asyncHttpClient=new AsyncHttpClient();
        asyncHttpClient.get(MainActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String responcestring=new String(responseBody);
                gson=new Gson();
                responceObj=gson.fromJson(responcestring,ResponceClass.class);
                arrayList.add(responceObj.getKind());
                arrayList.add(responceObj.getId());
                arrayList.add(responceObj.getName());
                arrayList.add(responceObj.getDescription());
                arrayList.add(responceObj.getPublished());
                arrayList.add(responceObj.getUpdated());
                arrayList.add(responceObj.getUrl());
                ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
                list_view.setAdapter(arrayAdapter);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_SHORT).show();
            }
        });







    }
}
