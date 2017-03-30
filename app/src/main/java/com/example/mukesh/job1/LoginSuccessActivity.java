package com.example.mukesh.job1;



import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.ListView;

import android.widget.Toast;



public class LoginSuccessActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        String[] menu;
        String[] s;
        DrawerLayout dLayout;
        ListView dList;
        ArrayAdapter<String> adapter;
        Button b1a;

            menu = new String[]{"Home","Electronic" ,"Lifestyle" , "Home and Furniture","TV & Appliances"};


            dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);


            dList = (ListView) findViewById(R.id.left_drawer);




            adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);

            dList.setAdapter(adapter);
            dList.setSelector(android.R.color.holo_blue_dark);

            dList.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            String cities = String.valueOf(parent.getItemAtPosition(position));
                            Toast.makeText(LoginSuccessActivity.this, cities, Toast.LENGTH_LONG).show();

                            if (position == 0) {
                                //code specific to first list item
                                Intent myIntent = new Intent(view.getContext(), home.class);
                                startActivityForResult(myIntent, 0);



                            }

                            if (position == 1) {
                                //code specific to first list item
                                Intent myIntent = new Intent(view.getContext(), electronic.class);
                                startActivityForResult(myIntent, 0);



                            }

                           if (position == 2) {
                                //code specific to first list item
                                Intent myIntent = new Intent(view.getContext(), lifestyle.class);
                                startActivityForResult(myIntent, 0);



                            }


                            if (position == 3) {
                                //code specific to first list item
                                Intent myIntent = new Intent(view.getContext(), homefur.class);
                                startActivityForResult(myIntent, 0);



                            }


                            if (position == 4) {
                                //code specific to first list item
                                Intent myIntent = new Intent(view.getContext(), tv.class);
                                startActivityForResult(myIntent, 0);



                            }




                        }

                    });


    }
}
