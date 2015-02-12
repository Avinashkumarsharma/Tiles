package com.thenoob.blackbox.tiles;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Help extends Activity {
	TextView help;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		String fontpath = "fonts/Comfortaa_Regular.ttf";
		Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);
		help = (TextView) findViewById(R.id.helptxt);
		help.setTypeface(tf);
	}

	
}
