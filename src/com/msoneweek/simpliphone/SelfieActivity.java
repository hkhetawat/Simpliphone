package com.msoneweek.simpliphone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SelfieActivity extends Activity {
	int CAMERA_PIC_REQUEST = 2; 
	TextView nameText;
	int  TAKE_PICTURE=0;
	Camera camera;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selfie);
	            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
	            startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
	            nameText=(TextView)findViewById(R.id.nameText);
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{
	    super.onActivityResult(requestCode, resultCode, data);
	    if( requestCode == CAMERA_PIC_REQUEST)
	    {   
	        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
	        ImageView image =(ImageView) findViewById(R.id.selfieImage);
	        image.setImageBitmap(thumbnail);
            String Name = getIntent().getExtras().getString("Name");

            nameText.setText(Name);
	    }
	    else 
	    {
	    }
	}
	public void goToMainScreen(View v)
	{
		Intent i = new Intent(this, MainScreenActivity.class);
		startActivity(i);
	}
}
	
