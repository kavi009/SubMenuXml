package com.example.subba.submenuxml;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option_menu_item_1:
                TextView txtView = (TextView) findViewById(R.id.textView);
                txtView.setTextColor(Color.RED);
                return true;

            case R.id.option_menu_item_2:
                TextView txttView = (TextView) findViewById(R.id.textView);
                txttView.setTextColor(Color.GREEN);
                return true;

            case R.id.option_menu_item_3:
                TextView txtvView = (TextView) findViewById(R.id.textView);
                txtvView.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
