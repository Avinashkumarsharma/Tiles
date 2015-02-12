package com.thenoob.blackbox.tiles;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity {
	TextView about;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		String fontpath = "fonts/Comfortaa_Regular.ttf";
		Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);
		about = (TextView) findViewById(R.id.aboutxt);
		about.setTypeface(tf);
	}

	
}
