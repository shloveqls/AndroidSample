package com.freedom.drawball.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class DrawBallView extends View {

	private Paint mPaint;
	private float mCurrentX;
	private float mCurrentY;
	private float mRadius;

	public DrawBallView(Context context) {
		super(context);
	}

	public void init(float currentX, float currentY, float radius) {
		mPaint = new Paint();
		this.mCurrentX = currentX;
		this.mCurrentY = currentY;
		this.mRadius = radius;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		mPaint.setColor(Color.RED);
		canvas.drawCircle(mCurrentX, mCurrentY, mRadius, mPaint);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		super.onTouchEvent(event);
		this.mCurrentX = event.getX();
		this.mCurrentY = event.getY();
		invalidate();
		return true;
	}
	
}
