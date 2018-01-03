package com.nam.myui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nam.myui2.x42;

public class MainActivity extends AppCompatActivity {

    public String LOGTAG = "X42";

    private TextView mTextMessage;

    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        //x42 xx = new x42();

        //xx.Log("WTF&&&");
        x42.Log("WTF&&&");

        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                x42.Log("Click button1");

                Intent intent = new Intent(getBaseContext(), ButtonActivity.class);

                startActivity(intent);
            }
        });

        mButton2 = (Button)findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button2");

                Intent intent = new Intent(getBaseContext(), ToggleButtonActivity.class);

                startActivity(intent);
            }
        });

        mButton3 = (Button)findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button3");
                Intent intent = new Intent(getBaseContext(), CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        mButton4 = (Button)findViewById(R.id.button4);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button4");
                Intent intent = new Intent(getBaseContext(), RadioGroupActivity.class);
                startActivity(intent);
            }
        });

        mButton5 = (Button)findViewById(R.id.button5);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button5");
                Intent intent = new Intent(MainActivity.this, HelloAndroidWithMenuActivity.class);
                startActivity(intent);
            }
        });

    }

}
