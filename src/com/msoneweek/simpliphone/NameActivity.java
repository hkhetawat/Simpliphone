package com.msoneweek.simpliphone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class NameActivity extends Activity {

	TextView hindiMessage, altHindiMessage;
	Boolean recording = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_name);
		ImageView mascotImage = (ImageView)findViewById(R.id.mascotImage);
		hindiMessage=(TextView)findViewById(R.id.messageText);
		altHindiMessage=(TextView)findViewById(R.id.altMessageText);
		mascotImage.setImageResource(R.drawable.listening);
		 Typeface font = Typeface.createFromAsset(getAssets(), "hindi.ttf");
		 
		 hindiMessage.setTypeface(font);
		 altHindiMessage.setTypeface(font);
		 hindiMessage.setText("आपका नाम क्या है? (कहने के लिए मुझ पर क्लिक करे)");
		 altHindiMessage.setText("िर से अपने नाम कह के बाद मुझ पर क्लिक कर");
	}
	public void goToSelfieScreen(View v)
	{
		EditText NameText = (EditText)findViewById(R.id.nameEditText);
		Intent intent = new Intent(this, SelfieActivity.class);
		intent.putExtra("Name",NameText.getText().toString());
		System.out.println("Name is:" + NameText.getText().toString());
		startActivity(intent);
	}
}
