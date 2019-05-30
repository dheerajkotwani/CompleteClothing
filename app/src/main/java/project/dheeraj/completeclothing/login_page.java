package project.dheeraj.completeclothing;

import androidx.appcompat.app.AppCompatActivity;
import jp.wasabeef.blurry.Blurry;

import android.os.Bundle;
import android.widget.ImageView;

public class login_page extends AppCompatActivity {

    private ImageView mImageBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        mImageBackground = findViewById(R.id.image_background);

        Blurry.with(login_page.this)
                .capture(mImageBackground)
                .into(mImageBackground);

//        Blurry.with(this).radius(25).sampling(2).onto(ImageView);
    }
}
