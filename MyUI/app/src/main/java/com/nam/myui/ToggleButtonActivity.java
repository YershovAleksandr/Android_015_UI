package com.nam.myui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

	// Get a reference to a background container
	public /*final*/ LinearLayout bg;

	// Get a reference to the ToggleButton
	public /*final*/ ToggleButton button;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.uitogglebutton);

		bg = (LinearLayout) findViewById(R.id.m2linearlayout);
		button = (ToggleButton) findViewById(R.id.m2togglebutton);

		ChColor();

		// Set an OnClickListener on the ToggleButton
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				// Toggle the Background color between a light and dark color
				ChColor();
			}
		});
		
	}

	public void ChColor()
	{

		if (button.isChecked()) {
			//bg.setBackgroundColor(0xFFF3F3F3);
			bg.setBackgroundColor(Color.CYAN);
		} else {
			//bg.setBackgroundColor(0xFF000000);
			bg.setBackgroundColor(Color.MAGENTA);
		}
	}
}
