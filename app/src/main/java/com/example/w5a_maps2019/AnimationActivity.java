package com.example.w5a_maps2019;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;

public class AnimationActivity extends AppCompatActivity {
    TextView tv;
    Boolean cond = true;
    private Timer timer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        ImageView imageView = (ImageView)findViewById(R.id.myimage);
        imageView.setVisibility(imageView.VISIBLE);
        imageView.setBackgroundResource(R.drawable.frame_animation);

        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getBackground();
        frameAnimation.start();


        cond = frameAnimation.isRunning();
      frameAnimation.setEnterFadeDuration(500);
        try {
           Thread.sleep(500);

            String passString;

            Intent i = getIntent();
            passString = i.getStringExtra("savings");
            if(cond == true)

            {
                frameAnimation.stop();
                AlertDialog show = new AlertDialog.Builder(this)
                           .setTitle("RESULT").setMessage(passString)
                            .setNeutralButton("OK", null).show();
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();

        }

    }
}
