package com.yarolegovich.discretescrollview.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.yarolegovich.discretescrollview.DiscreteScrollView;

/* loaded from: classes5.dex */
public class ScrollListenerAdapter<T extends RecyclerView.ViewHolder> implements DiscreteScrollView.ScrollStateChangeListener<T> {

    /* renamed from: a */
    public DiscreteScrollView.ScrollListener f60911a;

    public ScrollListenerAdapter(@NonNull DiscreteScrollView.ScrollListener<T> scrollListener) {
        this.f60911a = scrollListener;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ScrollListenerAdapter) {
            return this.f60911a.equals(((ScrollListenerAdapter) obj).f60911a);
        }
        return super.equals(obj);
    }

    @Override // com.yarolegovich.discretescrollview.DiscreteScrollView.ScrollStateChangeListener
    public void onScroll(float f, int i, int i2, @Nullable T t, @Nullable T t2) {
        this.f60911a.onScroll(f, i, i2, t, t2);
    }

    @Override // com.yarolegovich.discretescrollview.DiscreteScrollView.ScrollStateChangeListener
    public void onScrollEnd(@NonNull T t, int i) {
    }

    @Override // com.yarolegovich.discretescrollview.DiscreteScrollView.ScrollStateChangeListener
    public void onScrollStart(@NonNull T t, int i) {
    }
}
