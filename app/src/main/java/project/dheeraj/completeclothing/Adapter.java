package project.dheeraj.completeclothing;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private Context context;
    private ArrayList<LayoutItems> layoutItems;

    private OnItemClickListner mListner;

    public interface OnItemClickListner{
        void onItemClick(int position);

        boolean onOptionItemsSelected(MenuItem item);
    }

    public void setOnItemClickListner(OnItemClickListner listner){
        mListner = listner;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImage;
        private TextView Name;
        private TextView Price;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.layout_image);
            Name = itemView.findViewById(R.id.layout_name);
            Price = itemView.findViewById(R.id.layout_price);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Toast.makeText(context,"Loading",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(context, addToBag.class);
                    intent.putExtra("name",layoutItems.get(position).getName());
                    intent.putExtra("price",layoutItems.get(position).getPrice());
                    intent.putExtra("image",layoutItems.get(position).getImgRes());
                    intent.putExtra("images",layoutItems.get(position).getImgRes());

                    view.getContext().startActivity(intent);

                    if (mListner != null) {

                        if (position != RecyclerView.NO_POSITION) {
                            mListner.onItemClick(position);
                        }
                    }
                }

            });
        }
    }

    public Adapter(ArrayList<LayoutItems> list,Context context){
        layoutItems = list;
        this.context = context;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.clothes_layout,viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {


        LayoutItems currentItem = layoutItems.get(i);
        holder.Name.setText(currentItem.getName());
        holder.Price.setText(currentItem.getPrice());
//        holder.mImage.setImageResource(currentItem.getImgRes());

        Picasso.with(context)
                .load(currentItem.getImg())
                .into(holder.mImage);

    }

    @Override
    public int getItemCount() {
        return layoutItems.size();
    }




}
