package com.msoneweek.simpliphone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
	}
	public void goToPhoneScreen(View v)
	{
		startActivity(new Intent(this,DialerActivity.class));
	}
	public void goToMessagesScreen(View v)
	{
		//To be filled by Nikhil
	}
}
