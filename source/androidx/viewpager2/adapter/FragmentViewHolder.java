package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class FragmentViewHolder extends RecyclerView.ViewHolder {
    public FragmentViewHolder(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* renamed from: b */
    public static FragmentViewHolder m52428b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout);
    }

    /* renamed from: c */
    public FrameLayout m52427c() {
        return (FrameLayout) this.itemView;
    }
}
