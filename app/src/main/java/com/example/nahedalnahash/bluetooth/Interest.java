package com.example.nahedalnahash.bluetooth;

/**
 * Created by Mohammed Alquwaisem on 11/28/15.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.tag.bluetoothchat.R;

import java.util.ArrayList;

public class Interest extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> interestsList;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        button = (Button) findViewById(R.id.button);
        interestsList = new ArrayList<String>();
        interestsList.add("Computer Science");
        interestsList.add("Software Engineering");
        interestsList.add("Psychology");
        interestsList.add("Engineering");
        interestsList.add("Mathematics");
        interestsList.add("Accounting");
        interestsList.add("Finance");
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_layout, interestsList);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),MainActivity.class);
                int position = spinner.getSelectedItemPosition();
                String interest = (String) spinner.getSelectedItem();
                i.putExtra("interest", interest);
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(i);
            }
        });

    }
}
