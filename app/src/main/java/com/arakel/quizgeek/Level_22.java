package com.arakel.quizgeek;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Random;

public class Level_22 extends AppCompatActivity {

    Dialog dialog;
    Dialog dialogEnd;

    public int numLeft;//for image + text left
    public int numRight;//for image + text right
    Array array = new Array();//Create new object from Array class
    Random random = new Random();//For generating random numbers
    public int count = 0;//Counting true answers

    public InterstitialAd interstitialAd;//Interstitial Ad
    public int transition = 0;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        //Ad start
        MobileAds.initialize(this, "ca-app-pub-5332101373774587~3526230126");
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-5332101373774587/2991300664");//ca-app-pub-3940256099942544/1033173712
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest);
        //Ad end

        //Closing ad with x
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                try{
                    switch (transition){
                        case 0: break;
                        case 1: Intent intent = new Intent(Level_22.this, Level_23.class);
                            startActivity(intent);finish();break;
                        case 2: Intent intent1 = new Intent(Level_22.this, GameLevels.class);
                            startActivity(intent1);finish();break;
                        default:break;
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Closing ad with x

        //Create text_levels
        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level_22);//Set text
        text_levels.setTextColor(R.color.black_transp);

        final ImageView img_left = (ImageView)findViewById(R.id.img_left);
        //radius for left img
        img_left.setClipToOutline(true);
        //radius for left img

        final ImageView img_right = (ImageView)findViewById(R.id.img_right);
        //radius for right img
        img_right.setClipToOutline(true);
        //radius for right img

        //the way to get left text
        final TextView text_left = findViewById(R.id.text_left);
        //the way to get right text
        final TextView text_right = findViewById(R.id.text_right);

        /*FullScreen*/
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /*FullScreen*/

        //Set level background
        ImageView background = (ImageView)findViewById(R.id.level_1_background);
        background.setImageResource(R.drawable.level_3);
        //Set level background

        //Calling dialog in start of game
        dialog = new Dialog(this);//creating new dialog window
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);//hidding title
        dialog.setContentView(R.layout.previewdialog);//way to get the maket of dialog window
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//transparent background for dialog window
        dialog.setCancelable(false);//window cant be closed by "Back" button

        //Set image for dialog
        ImageView previewimg = (ImageView)dialog.findViewById(R.id.preview_img);
        previewimg.setImageResource(R.drawable.preview_img_22);
        //Set image for dialog

        //set background for dialog
        LinearLayout dialogFon = (LinearLayout)dialog.findViewById(R.id.dialogfon);
        dialogFon.setBackgroundResource(R.drawable.preview_background_three);
        //set background for dialog

        //Set text for dialog
        TextView textdescription = (TextView)dialog.findViewById(R.id.text_description);
        textdescription.setText(R.string.level22Text);
        //Set text for dialog

        //Button that close the dialog window
        TextView btnclose = (TextView)dialog.findViewById(R.id.btn_close);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Working on button job
                try{
                    //Get back to level select page
                    Intent intent = new Intent(Level_22.this, GameLevels.class);//Create the plan for returning
                    startActivity(intent);//Start the plan
                    finish();//Close this class
                    //Get back to level select page
                }catch (Exception e){
                    //There will be emty
                }
                dialog.dismiss();//Close the dialog window
                //Working on button job
            }
        });
        //Button that close the dialog window

        //Button for Continue
        Button btn_continue = (Button)dialog.findViewById(R.id.btn_countinue);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();//Close dialog window
            }
        });
        //Button for Continue

        dialog.show();//show the dialog window
        //Calling dialog in start of game

        //___________________________________________________________________________________________
        //Calling dialog in end of game
        dialogEnd = new Dialog(this);//creating new dialog window
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE);//hidding title
        dialogEnd.setContentView(R.layout.dialogend);//way to get the maket of dialog window
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//transparent background for dialog window
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd.setCancelable(false);//window cant be closed by "Back" button

        //fon for end dialog fon
        LinearLayout dialogFonEnd = (LinearLayout)dialogEnd.findViewById(R.id.dialogfon);
        dialogFonEnd.setBackgroundResource(R.drawable.preview_background_three);
        //fon for end dialog fon

        //Interesting fact
        TextView texxtdescriptionEnd = (TextView)dialogEnd.findViewById(R.id.text_description_end);
        texxtdescriptionEnd.setText(R.string.level22TextEnd);
        //Interesting fact

        //Button that close the dialog window
        TextView btnclose2 = (TextView)dialogEnd.findViewById(R.id.btn_close);
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Working on button job
                try{
                    //Get back to level select page
                    Intent intent = new Intent(Level_22.this, GameLevels.class);//Create the plan for returning
                    startActivity(intent);//Start the plan
                    finish();//Close this class
                    //Get back to level select page
                }catch (Exception e){
                    //There will be emty
                }
                dialogEnd.dismiss();//Close the dialog window
                //Working on button job
            }
        });
        //Button that close the dialog window

        //Button for Continue
        Button btn_continue2 = (Button)dialogEnd.findViewById(R.id.btn_countinue);
        btn_continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded()){
                    transition = 1;
                    interstitialAd.show();
                }else {
                    try {
                        Intent intent = new Intent(Level_22.this, Level_23.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                        //empty
                    }
                    dialogEnd.dismiss();//Close dialog window
                }
            }
        });
        //Button for Continue

        //Calling dialog in end of game
        //___________________________________________________________________________________________

        //Button "Back"
        Button btn_back = (Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd.isLoaded()){
                    transition = 2;
                    interstitialAd.show();//show the add
                }else {
                    try {
                        Intent intent = new Intent(Level_22.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            }
        });
        //Button "Back"

        //Array for progress for game
        final int[] progress = {
                R.id.poin_1, R.id.poin_2, R.id.poin_3, R.id.poin_4, R.id.poin_5,
                R.id.poin_6, R.id.poin_7, R.id.poin_8, R.id.poin_9, R.id.poin_10,
                R.id.poin_11, R.id.poin_12, R.id.poin_13, R.id.poin_14, R.id.poin_15,
                R.id.poin_16, R.id.poin_17, R.id.poin_18, R.id.poin_19, R.id.poin_20,
        };

        //Connect animation
        final Animation a = AnimationUtils.loadAnimation(Level_22.this, R.anim.alpha);
        //Connect animation

        //Generating random numbers from 0 to 9
        //Left
        numLeft = random.nextInt(20);
        img_left.setImageResource(array.images22[numLeft]);//getting image from array
        text_left.setText(array.texts22[numLeft]);//getting text from array

        //Right
        numRight = random.nextInt(20);//Generating random numbers from 0 to 9

        //Circle for checking numbers equels
        while (array.strong5[numLeft] == array.strong5[numRight]){
            numRight = random.nextInt(20);
        }
        //Circle for checking numbers equels

        img_right.setImageResource(array.images22[numRight]);//getting image from array
        text_right.setText(array.texts22[numRight]);//getting text from array
        //Generating random numbers from 0 to 9

        //Working on click on left image<-
        img_left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                //Touching image
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    //if touch the image
                    img_right.setEnabled(false);//Block right image
                    if(array.strong5[numLeft] > array.strong5[numRight]){
                        img_left.setImageResource(R.drawable.img_true);
                    }else{
                        img_left.setImageResource(R.drawable.img_false);
                    }
                    //if touch the image
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    //if end touch image
                    if (array.strong5[numLeft] > array.strong5[numRight]){
                        //if left bigger
                        if (count<20){
                            count = count + 1;
                        }

                        //painting progress with grey color
                        for (int i = 0; i < 20; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //painting progress with grey color

                        //getting true answers and painting green
                        for ( int i = 0; i < count; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //getting true answers and painting green

                    }else{
                        //if left smaller
                        if (count > 0){
                            if (count == 1){
                                count = 0;
                            }else{
                                count = count - 2;
                            }
                        }
                        //painting progress with grey color
                        for (int i = 0; i < 19; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //painting progress with grey color

                        //getting true answers and painting green
                        for ( int i = 0; i < count; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //getting true answers and painting green
                    }
                    //if end touch image
                    if (count == 20){
                        //end of level
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("Level", 1);
                        if (level > 22){
                            //empty
                        }else{
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("Level", 23);
                            editor.commit();
                        }
                        dialogEnd.show();
                    }else{
                        ///Generating random numbers from 0 to 9
                        //Left
                        numLeft = random.nextInt(20);
                        img_left.setImageResource(array.images22[numLeft]);//getting image from array
                        text_left.setText(array.texts22[numLeft]);//getting text from array

                        //Right
                        numRight = random.nextInt(20);//Generating random numbers from 0 to 9

                        //Circle for checking numbers equels
                        while (array.strong5[numLeft] == array.strong5[numRight]){
                            numRight = random.nextInt(20);
                        }
                        //Circle for checking numbers equels

                        img_right.setImageResource(array.images22[numRight]);//getting image from array
                        text_right.setText(array.texts22[numRight]);//getting text from array

                        img_right.setEnabled(true);//Block back
                        //Generating random numbers from 0 to 9
                    }
                }
                //Touching image

                return true;
            }
        });
        //Working on click on left image<-

        //Working on click on right image->
        img_right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                //Touching image
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    //if touch the image
                    img_left.setEnabled(false);//Block left image
                    if(array.strong5[numLeft] < array.strong5[numRight]){
                        img_right.setImageResource(R.drawable.img_true);
                    }else{
                        img_right.setImageResource(R.drawable.img_false);
                    }
                    //if touch the image
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    //if end touch image
                    if (array.strong5[numLeft] < array.strong5[numRight]){
                        //if right bigger
                        if (count<20){
                            count = count + 1;
                        }

                        //painting progress with grey color
                        for (int i = 0; i < 20; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //painting progress with grey color

                        //getting true answers and painting green
                        for ( int i = 0; i < count; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //getting true answers and painting green

                    }else{
                        //if right smaller
                        if (count > 0){
                            if (count == 1){
                                count = 0;
                            }else{
                                count = count - 2;
                            }
                        }
                        //painting progress with grey color
                        for (int i = 0; i < 19; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //painting progress with grey color

                        //getting true answers and painting green
                        for ( int i = 0; i < count; i++ ){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //getting true answers and painting green
                    }
                    //if end touch image
                    if (count == 20){
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("Level", 1);
                        if (level > 22){
                            //empty
                        }else{
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("Level", 23);
                            editor.commit();
                        }
                        dialogEnd.show();
                        //end of level
                    }else{
                        //Generating random numbers from 0 to 9
                        //Left
                        numLeft = random.nextInt(20);
                        img_left.setImageResource(array.images22[numLeft]);//getting image from array
                        text_left.setText(array.texts22[numLeft]);//getting text from array

                        //Right
                        numRight = random.nextInt(20);//Generating random numbers from 0 to 9

                        //Circle for checking numbers equels
                        while (array.strong5[numLeft] == array.strong5[numRight]){
                            numRight = random.nextInt(20);
                        }
                        //Circle for checking numbers equels

                        img_right.setImageResource(array.images22[numRight]);//getting image from array
                        text_right.setText(array.texts22[numRight]);//getting text from array

                        img_left.setEnabled(true);//Block back left
                        //Generating random numbers from 0 to 9
                    }
                }
                //Touching image

                return true;
            }
        });
        //Working on click on right image->

    }

    //System button "back"

    @Override
    public void onBackPressed() {
        if(interstitialAd.isLoaded()){
            transition = 2;
            interstitialAd.show();
        }else {
            try {
                Intent intent = new Intent(Level_22.this, GameLevels.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {

            }
        }
    }

    //System button "back"

}