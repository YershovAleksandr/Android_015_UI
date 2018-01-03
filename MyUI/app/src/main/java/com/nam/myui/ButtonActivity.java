package com.nam.myui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
	int count = 0; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uibutton);

        // Get a reference to the Press Me Button
        final Button button = (Button) findViewById(R.id.m2button);
        
        // Set an OnClickListener on this Button
        // Called each time the user clicks the Button
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				// Maintain a count of user presses
				// Display count as text on the Button
				button.setText("Got Pressed:" + ++count);
				
			}
		});
    }
}