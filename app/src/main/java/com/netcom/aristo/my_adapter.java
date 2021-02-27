package com.netcom.aristo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class my_adapter extends RecyclerView.Adapter<my_adapter.myviewholder>{

    ArrayList<model> dataholder;

    public my_adapter(ArrayList<model> dataholder) {
        System.out.println("enterd");
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImg());
        holder.imag_name.setText(dataholder.get(position).getImag_name());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a =dataholder.get(position).getImag_name();
                Toast.makeText(v.getContext(),a, Toast.LENGTH_SHORT ).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView imag_name;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            imag_name=itemView.findViewById(R.id.textView);
        }
    }
}
