package com.arakel.quizgeek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;

public class Finish extends AppCompatActivity {

    ReviewManager manager;
    ReviewInfo reviewInfo;

    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);

        manager = ReviewManagerFactory.create(Finish.this);
        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnCompleteListener(new OnCompleteListener<ReviewInfo>() {
            @Override
            public void onComplete(@NonNull Task<ReviewInfo> task) {
                if (task.isSuccessful()){
                    reviewInfo = task.getResult();
                    Task<Void> flow = manager.launchReviewFlow(Finish.this,reviewInfo);
                    flow.addOnSuccessListener(new OnSuccessListener<Void>(){
                        @Override
                        public void onSuccess(Void result) {

                        }
                    });
                }else {
                    //Message for test
                    //Toast.makeText(Finish.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button finish_btn = (Button)findViewById(R.id.finish_btn_press);

        finish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent( Finish.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e) {

                }//the end of construction
            }
        });

        /*FullScreen*/
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /*FullScreen*/

    }

    //System back button

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Finish.this, GameLevels.class);
        startActivity(intent);
        finish();

    }

    //System back button

}