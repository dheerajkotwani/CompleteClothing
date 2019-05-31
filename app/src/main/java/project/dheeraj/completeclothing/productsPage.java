package project.dheeraj.completeclothing;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class productsPage extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private SwipeRefreshLayout mSwipeLayout;
    private TextView shopNowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_page);

        shopNowText = findViewById(R.id.shop_now);

        mDrawerLayout = findViewById(R.id.mDrawerLayout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);

//        mSwipeLayout = findViewById(R.id.swipeRefresh);


        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        shopNowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(productsPage.this,home.class);
                startActivity(intent);
            }
        });

   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_side, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if (mToggle.onOptionsItemSelected(item))
            return true;

        switch(item.getItemId()) {
            case R.id.search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cart:
                Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
                break;



        }
        return super.onOptionsItemSelected(item);
    }


}

