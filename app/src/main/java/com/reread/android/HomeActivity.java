package com.reread.android;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        context=HomeActivity.this;

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ReRead");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem item=menu.findItem(R.id.app_bar_search);
        SearchView searchView=(SearchView) item.getActionView();
        //Use This to Search on UI
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(context,"Searching: "+ query, Toast.LENGTH_LONG).show();
                return false;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Toast.makeText(context,"Aman Niyaz "+newText, Toast.LENGTH_LONG).show();
                return false;

            }



        });

        return super.onCreateOptionsMenu(menu);
    }
}
