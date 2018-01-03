package com.nam.myui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioGroupActivity extends AppCompatActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.uiradiogroup);

		final TextView tv = (TextView) findViewById(R.id.m2rgtextView);

		// Define a generic listener for all three RadioButtons in the RadioGroup
		final OnClickListener radioListener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioButton rb = (RadioButton) v;
				tv.setText(rb.getText() + " chosen");
			}
		};
		
		final RadioButton choice1 = (RadioButton) findViewById(R.id.choice1);
		// Called when RadioButton choice1 is clicked
		choice1.setOnClickListener(radioListener);

		final RadioButton choice2 = (RadioButton) findViewById(R.id.choice2);
		// Called when RadioButton choice2 is clicked
		choice2.setOnClickListener(radioListener);

		final RadioButton choice3 = (RadioButton) findViewById(R.id.choice3);
		// Called when RadioButton choice3 is clicked
		choice3.setOnClickListener(radioListener);

	}
}