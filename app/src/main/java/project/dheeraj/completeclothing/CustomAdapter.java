package project.dheeraj.completeclothing;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ProgrammingViewHolder> {

        private ImageView mImage;
        private TextView Name;
        private TextView Price;

        private ArrayList data;


        public CustomAdapter(Context context,ArrayList data)
        {
            this.data = data;
        }


        @NonNull
        @Override
        public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

            View view = inflater.inflate(R.layout.products_layout, viewGroup, false);
            return new ProgrammingViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int position) {
            programmingViewHolder.icon.setImageResource((Integer) data.get(position));

        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public class ProgrammingViewHolder extends RecyclerView.ViewHolder{

            ImageView icon;

            public ProgrammingViewHolder(@NonNull View itemView) {
                super(itemView);
                icon = itemView.findViewById(R.id.deals_img);



            }
        }
    }



