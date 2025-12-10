package net.lucode.hackware.magicindicator.buildins.commonnavigator.abs;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

/* loaded from: classes6.dex */
public abstract class CommonNavigatorAdapter {

    /* renamed from: a */
    public final DataSetObservable f72323a = new DataSetObservable();

    public abstract int getCount();

    public abstract IPagerIndicator getIndicator(Context context);

    public abstract IPagerTitleView getTitleView(Context context, int i);

    public float getTitleWeight(Context context, int i) {
        return 1.0f;
    }

    public final void notifyDataSetChanged() {
        this.f72323a.notifyChanged();
    }

    public final void notifyDataSetInvalidated() {
        this.f72323a.notifyInvalidated();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f72323a.registerObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f72323a.unregisterObserver(dataSetObserver);
    }
}
