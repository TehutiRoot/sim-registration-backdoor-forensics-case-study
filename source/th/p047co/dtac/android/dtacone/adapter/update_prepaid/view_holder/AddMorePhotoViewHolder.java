package th.p047co.dtac.android.dtacone.adapter.update_prepaid.view_holder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.adapter.update_prepaid.view_holder.AddMorePhotoViewHolder */
/* loaded from: classes7.dex */
public class AddMorePhotoViewHolder extends RecyclerView.ViewHolder {
    public RelativeLayout cameraBox;
    public TextView tvIdCardLabel;

    public AddMorePhotoViewHolder(View view) {
        super(view);
        this.tvIdCardLabel = (TextView) view.findViewById(R.id.tvIdCardLabel);
        this.cameraBox = (RelativeLayout) view.findViewById(R.id.cameraBox);
    }
}
