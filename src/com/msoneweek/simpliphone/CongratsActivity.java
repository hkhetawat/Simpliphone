package com.msoneweek.simpliphone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CongratsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_congrats);
		ImageView mascotImage = (ImageView)findViewById(R.id.mascotImage);
		TextView hindiMessage=(TextView)findViewById(R.id.messageText);
		mascotImage.setImageResource(R.drawable.congrats);
		 Typeface font = Typeface.createFromAsset(getAssets(), "hindi.ttf");
		 
		 hindiMessage.setTypeface(font);

		 hindiMessage.setText("अपने नए फोन पर बधाई");
	}
	public void goToNameScreen(View v)
	{
		Intent intent = new Intent(this, NameActivity.class);
		startActivity(intent);
	}
}
