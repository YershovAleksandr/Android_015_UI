package com.nam.myui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class UITLImageViewActivity extends AppCompatActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent i = getIntent();
		ImageView imageView = new ImageView(getApplicationContext());
		imageView.setImageResource(i.getIntExtra(UITLGridFragment.EXTRA_RES_ID, -1));
		setContentView(imageView);
	}
}