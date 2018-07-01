package a2gazb.bargaindriving.customerlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import a2gazb.bargaindriving.R;

public class HerderViewHolder extends RecyclerView.ViewHolder {

    public TextView herderView;

    public HerderViewHolder(View itemView) {
        super(itemView);

        herderView = (TextView) itemView.findViewById(R.id.herder);

    }
}
