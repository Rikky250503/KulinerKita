package com.example.kulinerkita.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kulinerkita.Model.ModelKuliner;
import com.example.kulinerkita.R;

import java.util.List;

public class AdapterKuliner extends  RecyclerView.Adapter<AdapterKuliner.VHKuliner> {

    private Context ctx;
    private List<ModelKuliner> listkuliner;

    public AdapterKuliner(Context ctx, List<ModelKuliner> listkuliner) {
        this.ctx = ctx;
        this.listkuliner = listkuliner;
    }

    @NonNull
    @Override
    public VHKuliner onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View varView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_kuliner,parent,false);
        return new VHKuliner(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull VHKuliner holder, int position) {
        ModelKuliner MK = listkuliner.get(position);
        holder.tvId.setText(MK.getId());
        holder.tvNama.setText(MK.getId());
        holder.tvAsal.setText(MK.getAsal());
        holder.tvDeskripsiSingkat.setText(MK.getDeskripsi_singkat());
    }

    @Override
    public int getItemCount() {
        return listkuliner.size();
    }

    public class VHKuliner extends RecyclerView.ViewHolder{

        TextView tvId, tvNama, tvAsal, tvDeskripsiSingkat;

        public VHKuliner(@NonNull View itemView) {
            super(itemView);

            tvId = itemView.findViewById(R.id.tv_id);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvAsal = itemView.findViewById(R.id.tv_asal);
            tvDeskripsiSingkat = itemView.findViewById(R.id.tv_deskripsi_singkat);
        }
    }
}
