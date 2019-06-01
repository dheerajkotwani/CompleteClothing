package project.dheeraj.completeclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class cart extends AppCompatActivity {

    private TextView textName;
    private TextView textPrice;
    private TextView textFinalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        textName = findViewById(R.id.layout_name);
        textPrice = findViewById(R.id.layout_price);
        textFinalPrice = findViewById(R.id.finalAmount);

        Intent i = getIntent();
        textName.setText(i.getStringExtra("name"));
        textPrice.setText(i.getStringExtra("price"));
        textFinalPrice.setText(i.getStringExtra("price"));
    }
}
