package com.bluelife.mm.bitmapmemory;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap newImage = Bitmap.createBitmap(3000, 3000, Bitmap.Config.ARGB_4444);
        Bitmap resizeImage=Bitmap.createScaledBitmap(newImage,(int)(newImage.getWidth()*2),(int)(newImage.getHeight()*2),false);
    }
}
