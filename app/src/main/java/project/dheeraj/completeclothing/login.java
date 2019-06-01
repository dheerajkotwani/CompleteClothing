package project.dheeraj.completeclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    private Button buttonGmail;
    private Button buttonFacebook;
    private Button buttonSignUp;
    private TextView signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonGmail = findViewById(R.id.login_gmail);
        buttonFacebook = findViewById(R.id.login_facebook);
        buttonSignUp = findViewById(R.id.button_started);
        signIn = findViewById(R.id.signIn);

        buttonGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,productsPage.class);
                startActivity(intent);
                finish();
            }
        });

        buttonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,productsPage.class);
                startActivity(intent);
                finish();
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,productsPage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
