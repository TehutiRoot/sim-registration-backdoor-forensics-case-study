package p000;

import android.widget.AbsListView;
import com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent;

/* renamed from: c8 */
/* loaded from: classes5.dex */
public final class C5424c8 extends AbsListViewScrollEvent {

    /* renamed from: a */
    public final AbsListView f39336a;

    /* renamed from: b */
    public final int f39337b;

    /* renamed from: c */
    public final int f39338c;

    /* renamed from: d */
    public final int f39339d;

    /* renamed from: e */
    public final int f39340e;

    public C5424c8(AbsListView absListView, int i, int i2, int i3, int i4) {
        if (absListView != null) {
            this.f39336a = absListView;
            this.f39337b = i;
            this.f39338c = i2;
            this.f39339d = i3;
            this.f39340e = i4;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbsListViewScrollEvent)) {
            return false;
        }
        AbsListViewScrollEvent absListViewScrollEvent = (AbsListViewScrollEvent) obj;
        if (this.f39336a.equals(absListViewScrollEvent.view()) && this.f39337b == absListViewScrollEvent.scrollState() && this.f39338c == absListViewScrollEvent.firstVisibleItem() && this.f39339d == absListViewScrollEvent.visibleItemCount() && this.f39340e == absListViewScrollEvent.totalItemCount()) {
            return true;
        }
        return false;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int firstVisibleItem() {
        return this.f39338c;
    }

    public int hashCode() {
        return ((((((((this.f39336a.hashCode() ^ 1000003) * 1000003) ^ this.f39337b) * 1000003) ^ this.f39338c) * 1000003) ^ this.f39339d) * 1000003) ^ this.f39340e;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int scrollState() {
        return this.f39337b;
    }

    public String toString() {
        return "AbsListViewScrollEvent{view=" + this.f39336a + ", scrollState=" + this.f39337b + ", firstVisibleItem=" + this.f39338c + ", visibleItemCount=" + this.f39339d + ", totalItemCount=" + this.f39340e + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int totalItemCount() {
        return this.f39340e;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public AbsListView view() {
        return this.f39336a;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int visibleItemCount() {
        return this.f39339d;
    }
}
