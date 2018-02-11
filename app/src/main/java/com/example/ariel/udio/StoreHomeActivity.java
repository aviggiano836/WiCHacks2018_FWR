package com.example.ariel.udio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



/**
 * Created by Ariel on 2/10/2018.
 */

public class StoreHomeActivity extends AppCompatActivity {
    Button search, requests, expiring;

    //@BindView(R.id.searchInventory) protected View

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_home);

        search = (Button)findViewById(R.id.searchInventory);
        requests = (Button)findViewById(R.id.requests);
        expiring = (Button)findViewById(R.id.expiring);

        setSearchInventory();
        setRequests();
        setExpiring();
    }

    public void setSearchInventory(){
        search.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        startActivity(new Intent(getApplicationContext(), Search.class));
                    }
                });
    }

    public void setRequests(){
        requests.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        startActivity(new Intent(getApplicationContext(), RequestsActivity.class));
                    }
                });
    }

    public void setExpiring(){
        expiring.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        startActivity(new Intent(getApplicationContext(), ExpiringActivity.class));
                    }
                });
    }
}
