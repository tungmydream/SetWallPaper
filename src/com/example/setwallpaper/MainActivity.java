package com.example.setwallpaper;

import java.io.IOException;
import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button buttonSetWallpaper = (Button)findViewById(R.id.set);
        ImageView imagePreview = (ImageView)findViewById(R.id.preview);
        imagePreview.setImageResource(R.drawable.two);
        
        buttonSetWallpaper.setOnClickListener(new Button.OnClickListener(){
     	    @Override
    	    public void onClick(View arg0) {
     	    	WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
     	    	try {
     	    		myWallpaperManager.setResource(R.drawable.two);
     	    	} catch (IOException e) {
     	    		e.printStackTrace();
     	    	}
    	    }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
