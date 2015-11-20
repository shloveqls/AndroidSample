package com.freedom.drawball;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.freedom.drawball.view.DrawBallView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		LinearLayout root = (LinearLayout) findViewById(R.id.root);
		DrawBallView drawBallView = new DrawBallView(this);
		drawBallView.init(40, 50, 30);
		drawBallView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
		root.addView(drawBallView);
	}
}
