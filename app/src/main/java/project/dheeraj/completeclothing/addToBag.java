package project.dheeraj.completeclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class addToBag extends AppCompatActivity {

    private ImageView mImageView;
    private TextView textName;
    private TextView textPrice;
    private TextView textAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_bag);

        mImageView = findViewById(R.id.layout_image);
        textName = findViewById(R.id.layout_name);
        textPrice = findViewById(R.id.layout_price);
        textAdd = findViewById(R.id.add_to_bag);

        final Intent intent = getIntent();
        textName.setText(intent.getStringExtra("name"));
        textPrice.setText(intent.getStringExtra("price"));
//        mImageView.setImageResource(intent.getIntExtra("images",R.drawable.mentshirt1));
//        mImageView.setImageResource(R.drawable.mentshirt1);


        textAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(addToBag.this,cart.class);
                i.putExtra("name",textName.getText());
                i.putExtra("price",textPrice.getText());
                startActivity(i);
            }
        });

    }
}
