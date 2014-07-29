package com.msoneweek.simpliphone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LanguageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_language);
		Button hindiButton=(Button)findViewById(R.id.HindiButton);
		 Typeface font = Typeface.createFromAsset(getAssets(), "hindi.ttf");

		 hindiButton.setTypeface(font);

		 hindiButton.setText("हिन्दी");
		 
	}
	public void goToCongratsScreen(View v)
	{
		Intent intent = new Intent(this, CongratsActivity.class);
		startActivity(intent);
	}
}
