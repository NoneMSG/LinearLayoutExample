package com.example.linearlayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SimpleLayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView( this );
        textView.setText( "Hello World" );

        Button button = new Button( this );
        button.setText( "Click" );

        LinearLayout ll = new LinearLayout( this );
        ll.setOrientation( LinearLayout.VERTICAL );

        ll.addView( textView );
        ll.addView( button );

        setContentView( ll );
    }
}
