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
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton10;
    private Button mButton11;
    private Button mButton12;
    private Button mButton13;
    private Button mButton14;
    private Button mButton15;

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

        mButton6 = (Button)findViewById(R.id.button6);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button6");
                Intent intent = new Intent(MainActivity.this, AlertDialogActivity.class);
                startActivity(intent);
            }
        });

        mButton7 = (Button)findViewById(R.id.button7);
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button7");
                Intent intent = new Intent(MainActivity.this, AutoCompleteActivity.class);
                startActivity(intent);
            }
        });

        mButton8 = (Button)findViewById(R.id.button8);
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button8");
                Intent intent = new Intent(MainActivity.this, HelloTabWidget.class);
                startActivity(intent);
            }
        });

        mButton9 = (Button)findViewById(R.id.button9);
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button9");
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(intent);
            }
        });

        mButton10 = (Button)findViewById(R.id.button10);
        mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button10");
                Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        mButton11 = (Button)findViewById(R.id.button11);
        mButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button11");
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        mButton12 = (Button)findViewById(R.id.button12);
        mButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button12");
                Intent intent = new Intent(MainActivity.this, RatingsBarActivity.class);
                startActivity(intent);
            }
        });

        mButton13 = (Button)findViewById(R.id.button13);
        mButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button13");
                Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        mButton14 = (Button)findViewById(R.id.button14);
        mButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button14");
                Intent intent = new Intent(MainActivity.this, SamplerActivity.class);
                startActivity(intent);
            }
        });

        mButton15 = (Button)findViewById(R.id.button15);
        mButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button15");
                Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });



    }

}
