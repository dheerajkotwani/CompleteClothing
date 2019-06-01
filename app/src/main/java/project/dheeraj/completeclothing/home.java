package project.dheeraj.completeclothing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Adapter mAdapter;

    private LayoutItems layoutItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mRecyclerView = findViewById(R.id.recycler_view);

        final ArrayList<LayoutItems> layoutItems = new ArrayList<>();

        //Adding Items
        layoutItems.add(new LayoutItems("Whatever it takes T-Shirt","Rs. 280","https://images.bewakoof.com/original/alan-walker-half-sleeve-t-shirt-gid-men-s-printed-t-shirts-209980-1549267329.jpg?tr=q-100"));
        layoutItems.add(new LayoutItems("Hope Stylish T-Shirt","Rs. 300","https://images.bewakoof.com/original/love-you-3000-half-sleeve-t-shirt-avl-men-s-printed-t-shirts-217381-1558335468.jpg?tr=q-100"));
        layoutItems.add(new LayoutItems("Whatever it takes T-Shirt","Rs. 280","https://images.bewakoof.com/original/hope-pin-half-sleeve-t-shirt-men-s-printed-t-shirts-202447-1543315883.jpg?tr=q-100"));
        layoutItems.add(new LayoutItems("Whatever it takes T-Shirt","Rs. 280","https://images.bewakoof.com/original/biker-swag-half-sleeve-t-shirt-men-s-printed-t-shirts-210195-1549956165.jpg?tr=q-100"));
        layoutItems.add(new LayoutItems("Whatever it takes T-Shirt","Rs. 280","https://images.bewakoof.com/original/anonymous-hood-half-sleeve-t-shirt-men-s-printed-t-shirts-217728-1558596441.jpg?tr=q-100"));
        layoutItems.add(new LayoutItems("Whatever it takes T-Shirt","Rs. 280","https://images.bewakoof.com/original/martin-garrix-colorful-half-sleeve-t-shirt-men-s-printed-t-shirts-203045-1543829557.jpg?tr=q-100"));


        final int position = 0;
        layoutManager = new GridLayoutManager(home.this,2);
        mAdapter = new Adapter(layoutItems,home.this);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutItems layoutItem = layoutItems.get(position);
//                Intent intent = new Intent(home.this, addToBag.class);
//                intent.putExtra("name",layoutItems.get(position).getName());
//                intent.putExtra("price",layoutItems.get(position).getPrice());
//                intent.putExtra("image",layoutItems.get(position).getImgRes());
//                intent.putExtra("images",layoutItems.get(position).getImgRes());
                Toast.makeText(home.this, "Loading", Toast.LENGTH_SHORT).show();
//                startActivity(intent);


            }
        });

    }



}

