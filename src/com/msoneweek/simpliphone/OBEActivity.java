package com.msoneweek.simpliphone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class OBEActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_obe);
		ImageView mascotImage = (ImageView)findViewById(R.id.mascotImage);
		TextView hindiMessage=(TextView)findViewById(R.id.messageTextHindi);
		mascotImage.setImageResource(R.drawable.welcome);
		 Typeface font = Typeface.createFromAsset(getAssets(), "hindi.ttf");
		 
		 hindiMessage.setTypeface(font);

		 hindiMessage.setText("आपका स्वागत है");
	}
	public void goToLanguageSelection(View v)
	{
		Intent intent = new Intent(this, LanguageActivity.class);
		startActivity(intent);
	}
}
