package com.example.ariel.udio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ariel on 2/11/2018.
 */

public class ExpiringActivity extends AppCompatActivity{
    TextView item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expiring_soon);

        setItemLink();
    }

    public void setItemLink(){
        item = (TextView)findViewById(R.id.item1);
        item.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        startActivity(new Intent(getApplicationContext(), ProductActivity.class));
                    }
                });
    }

    public void createItemTextView(ArrayList<String> itemInfo){
        //build xml for item from list
    }
}
