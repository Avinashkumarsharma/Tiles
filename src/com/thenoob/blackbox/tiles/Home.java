package com.thenoob.blackbox.tiles;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Home extends Activity {
	Button play, help, info;
	TextView title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_home);
		String fontpath = "fonts/Comfortaa_Regular.ttf";
		Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);
		play = (Button) findViewById(R.id.playbtn);
		help = (Button) findViewById(R.id.helpbtn);
		info = (Button) findViewById(R.id.infobtn);
		play.setTypeface(tf);
		help.setTypeface(tf);
		info.setTypeface(tf);
		play.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplication(), PuzzleActivity.class));
				
			}
		});
		help.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplication(), Help.class));
			}
		});
		info.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplication(), About.class));
			}
		});
		
	}
}
