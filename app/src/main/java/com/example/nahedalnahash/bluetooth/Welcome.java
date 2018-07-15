package com.example.nahedalnahash.bluetooth;

/**
 * Created by nahedalnahash on 11/22/15.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.tag.bluetoothchat.R;

public class Welcome extends Activity {
    RelativeLayout welcomeLayout = null;
    Button contButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeLayout = (RelativeLayout)findViewById(R.id.welcomeLayout);
        ImageView welcomeImage = (ImageView) findViewById(R.id.welcomeImage);
        welcomeImage.setImageResource(R.drawable.bluetooth1);
        contButton = (Button) findViewById(R.id.contButton);
        contButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Interest.class);
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                Welcome.this.finish();
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.welcome,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
