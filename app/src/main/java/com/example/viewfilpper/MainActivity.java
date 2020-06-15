package com.example.viewfilpper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ViewFlipper vflip;
    Button prev, next, show;
    TextView text;
    View.OnClickListener cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vflip = (ViewFlipper)findViewById(R.id.area);
        text = (TextView)findViewById(R.id.text);

        prev = (Button)findViewById(R.id.previous);
        next = (Button)findViewById(R.id.next);
        show = (Button)findViewById(R.id.showtext);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.previous:
                        vflip.showPrevious();
                        break;
                    case R.id.next:
                        vflip.showNext();
                        break;
                    case R.id.showtext:
                        String s = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n1\n";
                        text.setText(s);
                        break;
                }

            }
        };
        prev.setOnClickListener(cl);
        next.setOnClickListener(cl);
        show.setOnClickListener(cl);
    }
}
