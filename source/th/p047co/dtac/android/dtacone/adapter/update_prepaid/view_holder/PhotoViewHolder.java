package th.p047co.dtac.android.dtacone.adapter.update_prepaid.view_holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import jp.p022co.cyberagent.android.gpuimage.GPUImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.adapter.update_prepaid.view_holder.PhotoViewHolder */
/* loaded from: classes7.dex */
public class PhotoViewHolder extends RecyclerView.ViewHolder {
    public ImageView ivCancel;
    public GPUImageView ivPhoto;
    public TextView tvCardType;

    public PhotoViewHolder(View view) {
        super(view);
        this.ivPhoto = (GPUImageView) view.findViewById(R.id.ivPhoto);
        this.ivCancel = (ImageView) view.findViewById(R.id.ivCancel);
        this.tvCardType = (TextView) view.findViewById(R.id.tvCardType);
    }
}
