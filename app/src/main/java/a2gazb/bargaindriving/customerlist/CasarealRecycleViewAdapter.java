package a2gazb.bargaindriving.customerlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import a2gazb.bargaindriving.R;

public class CasarealRecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<RowData> list;

    public CasarealRecycleViewAdapter(List<RowData> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflateRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        View inflateHeader = LayoutInflater.from(parent.getContext()).inflate(R.layout.header, parent,false);
        // 1ならばヘッダ
        if( viewType == 1 ) {
            return new HerderViewHolder(inflateHeader);
        } else {
           return new CasarealViewHolder(inflateRow);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if(viewHolder instanceof HerderViewHolder ) {
            HerderViewHolder holder = (HerderViewHolder) viewHolder;
            holder.herderView.setText(list.get(position).getTitle());
        }
        if(viewHolder instanceof CasarealViewHolder ) {
            CasarealViewHolder  holder = (CasarealViewHolder) viewHolder;
            holder.titleView.setText(list.get(position).getTitle());
            holder.detailView.setText(list.get(position).getDetail());
        }

    }

    @Override
    public int getItemViewType(int position) {

        return list.get(position).getHeader();

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}