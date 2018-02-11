package com.example.ariel.udio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.ariel.udio.R;

public class Home extends AppCompatActivity {
    Button enterCode;
    EditText storeCode;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        enterCode = (Button)findViewById(R.id.enterCode);   //get enter button
        storeCode   = (EditText)findViewById(R.id.inputCode);   //get access to inputed

        setEnterStoreCode();
    }

    public void setEnterStoreCode(){
        enterCode.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        if (storeCode.getText().toString().equals("5532")){
                            findViewById(R.id.incorrectCode).setVisibility(View.INVISIBLE);
                            startActivity(new Intent(getApplicationContext(), StoreHomeActivity.class));
                        } else {
                            findViewById(R.id.incorrectCode).setVisibility(View.VISIBLE);
                            Log.v("IncorrectStoreCode", storeCode.getText().toString());
                        }
                    }
                });
    }


}
