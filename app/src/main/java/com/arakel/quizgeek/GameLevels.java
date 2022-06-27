package com.arakel.quizgeek;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GameLevels extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_levels);

        MobileAds.initialize(this, "ca-app-pub-5332101373774587~3526230126");
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        final int level = save.getInt("Level", 1);


        /*FullScreen*/
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /*FullScreen*/

        Button button_back = (Button)findViewById(R.id.back_btn_press);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start command for button

                try{
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }

                //end command for button
            }
        });

        //Button for Level 1
        TextView textView_1 = (TextView)findViewById(R.id.textView_1);
        textView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 1) {
                        Intent intent = new Intent(GameLevels.this, Level_1.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 1
//_______________________________________________________________________________________
        //Button for Level 2
        TextView textView_2 = (TextView)findViewById(R.id.textView_2);
        textView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 2){
                        Intent intent = new Intent(GameLevels.this, Level_2.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 2
        //_______________________________________________________________________________________
        //Button for Level 3
        TextView textView_3 = (TextView)findViewById(R.id.textView_3);
        textView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 3) {
                        Intent intent = new Intent(GameLevels.this, Level_3.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 3
        //_______________________________________________________________________________________
        //Button for Level 4
        TextView textView_4 = (TextView)findViewById(R.id.textView_4);
        textView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 4) {
                        Intent intent = new Intent(GameLevels.this, Level_4.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 4
        //_______________________________________________________________________________________
        //Button for Level 5
        TextView textView_5 = (TextView)findViewById(R.id.textView_5);
        textView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 5) {
                        Intent intent = new Intent(GameLevels.this, Level_5.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 5
        //_______________________________________________________________________________________
        //Button for Level 6
        TextView textView_6 = (TextView)findViewById(R.id.textView_6);
        textView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 6) {
                        Intent intent = new Intent(GameLevels.this, Level_6.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 6
        //_______________________________________________________________________________________
        //Button for Level 7
        TextView textView_7 = (TextView)findViewById(R.id.textView_7);
        textView_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 7) {
                        Intent intent = new Intent(GameLevels.this, Level_7.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 7
        //_______________________________________________________________________________________
        //Button for Level 8
        TextView textView_8 = (TextView)findViewById(R.id.textView_8);
        textView_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 8) {
                        Intent intent = new Intent(GameLevels.this, Level_8.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 8
        //_______________________________________________________________________________________
        //Button for Level 9
        TextView textView_9 = (TextView)findViewById(R.id.textView_9);
        textView_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 9) {
                        Intent intent = new Intent(GameLevels.this, Level_9.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 9
        //_______________________________________________________________________________________
        //Button for Level 10
        TextView textView_10 = (TextView)findViewById(R.id.textView_10);
        textView_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 10) {
                        Intent intent = new Intent(GameLevels.this, Level_10.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 10
        //_______________________________________________________________________________________
        //Button for Level 11
        TextView textView_11 = (TextView)findViewById(R.id.textView_11);
        textView_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 11) {
                        Intent intent = new Intent(GameLevels.this, Level_11.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 11
        //_______________________________________________________________________________________
        //Button for Level 12
        TextView textView_12 = (TextView)findViewById(R.id.textView_12);
        textView_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 12) {
                        Intent intent = new Intent(GameLevels.this, Level_12.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 12
//_______________________________________________________________________________________
        //Button for Level 13
        TextView textView_13 = (TextView)findViewById(R.id.textView_13);
        textView_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 13) {
                        Intent intent = new Intent(GameLevels.this, Level_13.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 13
        //_______________________________________________________________________________________
        //Button for Level 14
        TextView textView_14 = (TextView)findViewById(R.id.textView_14);
        textView_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 14) {
                        Intent intent = new Intent(GameLevels.this, Level_14.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 14
        //_______________________________________________________________________________________
        //Button for Level 15
        TextView textView_15 = (TextView)findViewById(R.id.textView_15);
        textView_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 15) {
                        Intent intent = new Intent(GameLevels.this, Level_15.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 15
        //_______________________________________________________________________________________
        //Button for Level 16
        TextView textView_16 = (TextView)findViewById(R.id.textView_16);
        textView_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 16) {
                        Intent intent = new Intent(GameLevels.this, Level_16.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 16
        //_______________________________________________________________________________________
        //Button for Level 17
        TextView textView_17 = (TextView)findViewById(R.id.textView_17);
        textView_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 17) {
                        Intent intent = new Intent(GameLevels.this, Level_17.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 17
        //_______________________________________________________________________________________
        //Button for Level 18
        TextView textView_18 = (TextView)findViewById(R.id.textView_18);
        textView_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 18) {
                        Intent intent = new Intent(GameLevels.this, Level_18.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 18
        //_______________________________________________________________________________________
        //Button for Level 19
        TextView textView_19 = (TextView)findViewById(R.id.textView_19);
        textView_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 19) {
                        Intent intent = new Intent(GameLevels.this, Level_19.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 19
        //_______________________________________________________________________________________
        //Button for Level 20
        TextView textView_20 = (TextView)findViewById(R.id.textView_20);
        textView_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 20) {
                        Intent intent = new Intent(GameLevels.this, Level_20.class);
                        startActivity(intent);
                        finish();
                    } else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 20
        //_______________________________________________________________________________________
        //Button for Level 21
        TextView textView_21 = (TextView)findViewById(R.id.textView_21);
        textView_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 21) {
                        Intent intent = new Intent(GameLevels.this, Level_21.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 21
        //_______________________________________________________________________________________
        //Button for Level 22
        TextView textView_22 = (TextView)findViewById(R.id.textView_22);
        textView_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 22) {
                        Intent intent = new Intent(GameLevels.this, Level_22.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 22
        //_______________________________________________________________________________________
        //Button for Level 23
        TextView textView_23 = (TextView)findViewById(R.id.textView_23);
        textView_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 23) {
                        Intent intent = new Intent(GameLevels.this, Level_23.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 23
        //_______________________________________________________________________________________
        //Button for Level 24
        TextView textView_24 = (TextView)findViewById(R.id.textView_24);
        textView_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 24) {
                        Intent intent = new Intent(GameLevels.this, Level_24.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 24
        //_______________________________________________________________________________________
        //Button for Level 25
        TextView textView_25 = (TextView)findViewById(R.id.textView_25);
        textView_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 25) {
                        Intent intent = new Intent(GameLevels.this, Level_25.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 25
        //_______________________________________________________________________________________
        //Button for Level 26
        TextView textView_26 = (TextView)findViewById(R.id.textView_26);
        textView_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 26) {
                        Intent intent = new Intent(GameLevels.this, Level_26.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 26
        //_______________________________________________________________________________________
        //Button for Level 27
        TextView textView_27 = (TextView)findViewById(R.id.textView_27);
        textView_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 27) {
                        Intent intent = new Intent(GameLevels.this, Level_27.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 27
        //_______________________________________________________________________________________
        //Button for Level 28
        TextView textView_28 = (TextView)findViewById(R.id.textView_28);
        textView_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 28) {
                        Intent intent = new Intent(GameLevels.this, Level_28.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 28
        //_______________________________________________________________________________________
        //Button for Level 29
        TextView textView_29 = (TextView)findViewById(R.id.textView_29);
        textView_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 29) {
                        Intent intent = new Intent(GameLevels.this, Level_29.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 29
        //_______________________________________________________________________________________
        //Button for Level 30
        TextView textView_30 = (TextView)findViewById(R.id.textView_30);
        textView_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (level >= 30) {
                        Intent intent = new Intent(GameLevels.this, Level_30.class);
                        startActivity(intent);
                        finish();
                    }else{
                        //empty
                    }
                }catch (Exception e){
                    //empty
                }
            }
        });
        //Button for Level 30
        //_______________________________________________________________________________________

        final int[] x={
                R.id.textView_1,
                R.id.textView_2,
                R.id.textView_3,
                R.id.textView_4,
                R.id.textView_5,
                R.id.textView_6,
                R.id.textView_7,
                R.id.textView_8,
                R.id.textView_9,
                R.id.textView_10,
                R.id.textView_11,
                R.id.textView_12,
                R.id.textView_13,
                R.id.textView_14,
                R.id.textView_15,
                R.id.textView_16,
                R.id.textView_17,
                R.id.textView_18,
                R.id.textView_19,
                R.id.textView_20,
                R.id.textView_21,
                R.id.textView_22,
                R.id.textView_23,
                R.id.textView_24,
                R.id.textView_25,
                R.id.textView_26,
                R.id.textView_27,
                R.id.textView_28,
                R.id.textView_29,
                R.id.textView_30,
        };
        for (int i=1; i<level; i++){
            TextView tv = findViewById(x[i]);
            tv.setText(""+(i+1));
        }

    }

    //system button for back

    @Override
    public void onBackPressed() {
        //start command for button

        try{
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        }catch (Exception e){

        }

        //end command for button
    }


    //system button for back

}