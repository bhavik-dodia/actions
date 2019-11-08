package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button make_a_call,show_location,show_webpage,show_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        make_a_call = (Button) findViewById(R.id.button_make_a_call);
        show_location = (Button) findViewById(R.id.button_show_location);
        show_webpage = (Button) findViewById(R.id.button_show_webpage);
        show_all = (Button) findViewById(R.id.button_show_all);

        make_a_call.setOnClickListener(this);
        show_location.setOnClickListener(this);
        show_webpage.setOnClickListener(this);
        show_all.setOnClickListener(this);
    }
        @Override
        public void onClick(View view){
        switch (view.getId())
        {
            case R.id.button_make_a_call :
                Intent i1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9825417245"));
                startActivity(i1);
                break;
            case R.id.button_show_location :
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:21.150949, 72.857506"));
                startActivity(i2);
                break;
            case R.id.button_show_webpage :
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(i3);
                break;
            case R.id.button_show_all :
                Intent i4 = new Intent(Intent.ACTION_VIEW);
                startActivity(i4);
                break;
        }

        }
}
