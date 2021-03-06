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
    private Button mButton16;
    private Button mButton17;
    private Button mButton18;
    private Button mButton19;
    private Button mButton20;
    private Button mButton21;
    private Button mButton22;
    private Button mButton23;
    private Button mButton24;
    private Button mButton25;
    private Button mButton26;
    private Button mButton27;
    private Button mButton28;
    private Button mButton29;
    private Button mButton30;

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

        mButton16 = (Button)findViewById(R.id.button16);
        mButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button16");
                Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });

        mButton17 = (Button)findViewById(R.id.button17);
        mButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button17");
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        mButton18 = (Button)findViewById(R.id.button18);
        mButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button18");
                Intent intent = new Intent(MainActivity.this, GalleryWithViewPagerActivity.class);
                startActivity(intent);
            }
        });

        mButton19 = (Button)findViewById(R.id.button19);
        mButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button19");
                Intent intent = new Intent(MainActivity.this, DatePickerActivity.class);
                startActivity(intent);
            }
        });

        mButton20 = (Button)findViewById(R.id.button20);
        mButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button20");
                Intent intent = new Intent(MainActivity.this, DatePickerFragmentActivity.class);
                startActivity(intent);
            }
        });

        mButton21 = (Button)findViewById(R.id.button21);
        mButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button21");
                Intent intent = new Intent(MainActivity.this, TimePickerActivity.class);
                startActivity(intent);
            }
        });

        mButton22 = (Button)findViewById(R.id.button22);
        mButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button22");
                Intent intent = new Intent(MainActivity.this, TimePickerFragmentActivity.class);
                startActivity(intent);
            }
        });

        mButton23 = (Button)findViewById(R.id.button23);
        mButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button23");
                Intent intent = new Intent(MainActivity.this, TabLayoutActivity.class);
                startActivity(intent);
            }
        });

        mButton24 = (Button)findViewById(R.id.button24);
        mButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button24");
                Intent intent = new Intent(MainActivity.this, UIGLGridLayoutActivity.class);
                startActivity(intent);
            }
        });

        mButton25 = (Button)findViewById(R.id.button25);
        mButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button25");
                Intent intent = new Intent(MainActivity.this, FSLQuoteViewerActivity.class);
                startActivity(intent);
            }
        });

        mButton26 = (Button)findViewById(R.id.button26);
        mButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button26");
                Intent intent = new Intent(MainActivity.this, FSCLQuoteViewerActivity.class);
                startActivity(intent);
            }
        });

        mButton27 = (Button)findViewById(R.id.button27);
        mButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button27");
                Intent intent = new Intent(MainActivity.this, TitlesListActivity.class);
                startActivity(intent);
            }
        });

        mButton28 = (Button)findViewById(R.id.button28);
        mButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button28");
                Intent intent = new Intent(MainActivity.this, FDLQuoteViewerActivity.class);
                startActivity(intent);
            }
        });

        mButton29 = (Button)findViewById(R.id.button29);
        mButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button29");
                Intent intent = new Intent(MainActivity.this, FDLAQuoteViewerActivity.class);
                startActivity(intent);
            }
        });

        mButton30 = (Button)findViewById(R.id.button30);
        mButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x42.Log("Click button30");
                Intent intent = new Intent(MainActivity.this, FPLQuoteViewerActivity.class);
                startActivity(intent);
            }
        });

    }

}
