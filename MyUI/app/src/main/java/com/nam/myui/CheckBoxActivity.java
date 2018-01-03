package com.nam.myui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxActivity extends AppCompatActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.uicheckbox);

		// Get a reference to the CheckBox
		final CheckBox checkbox = (CheckBox) findViewById(R.id.m2checkbox);

		// Set an OnClickListener on the CheckBox
		checkbox.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				// Check whether CheckBox is currently checked
				// Set CheckBox text accordingly
				if (checkbox.isChecked()) {
					checkbox.setText("I'm checked");
				} else {
					checkbox.setText("I'm not checked");
				}
			}
		});

		// Get a reference to the Hide CheckBox Button
		final Button button = (Button) findViewById(R.id.m2chboxbutton);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				// Toggle the CheckBox's visibility state
				// Set the Button text accordingly
				if (checkbox.isShown()) {
					checkbox.setVisibility(View.INVISIBLE);
					button.setText("Unhide CheckBox");
				} else {
					checkbox.setVisibility(View.VISIBLE);
					button.setText("Hide CheckBox");
				}
			}
		});
	}
}