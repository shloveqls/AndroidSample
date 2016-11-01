package com.freedom.calculatorui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private final static String[] BUTTON_TEXTS = new String[]{
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout root = (GridLayout) findViewById(R.id.root);

        final TextView text = (TextView) findViewById(R.id.text);

        Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("0");
            }
        });

        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            Button button = new Button(this);
            button.setText(BUTTON_TEXTS[i]);
            button.setTextSize(40);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text.setText(((Button) v).getText().toString());
                }
            });
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams layoutParmas = new GridLayout.LayoutParams(rowSpec, columnSpec);
            root.addView(button, layoutParmas);
        }

    }

}
