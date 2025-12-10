package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes2.dex */
public class C4963f {

    /* renamed from: b */
    public int f37189b;

    /* renamed from: c */
    public int f37190c;

    /* renamed from: d */
    public int f37191d;

    /* renamed from: e */
    public int f37192e;

    /* renamed from: h */
    public boolean f37195h;

    /* renamed from: i */
    public boolean f37196i;

    /* renamed from: a */
    public boolean f37188a = true;

    /* renamed from: f */
    public int f37193f = 0;

    /* renamed from: g */
    public int f37194g = 0;

    /* renamed from: a */
    public boolean m53003a(RecyclerView.State state) {
        int i = this.f37190c;
        if (i >= 0 && i < state.getItemCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public View m53002b(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.f37190c);
        this.f37190c += this.f37191d;
        return viewForPosition;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f37189b + ", mCurrentPosition=" + this.f37190c + ", mItemDirection=" + this.f37191d + ", mLayoutDirection=" + this.f37192e + ", mStartLine=" + this.f37193f + ", mEndLine=" + this.f37194g + '}';
    }
}
