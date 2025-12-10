package p000;

import android.widget.AbsListView;
import com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent;

/* renamed from: c8 */
/* loaded from: classes5.dex */
public final class C5410c8 extends AbsListViewScrollEvent {

    /* renamed from: a */
    public final AbsListView f39337a;

    /* renamed from: b */
    public final int f39338b;

    /* renamed from: c */
    public final int f39339c;

    /* renamed from: d */
    public final int f39340d;

    /* renamed from: e */
    public final int f39341e;

    public C5410c8(AbsListView absListView, int i, int i2, int i3, int i4) {
        if (absListView != null) {
            this.f39337a = absListView;
            this.f39338b = i;
            this.f39339c = i2;
            this.f39340d = i3;
            this.f39341e = i4;
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
        if (this.f39337a.equals(absListViewScrollEvent.view()) && this.f39338b == absListViewScrollEvent.scrollState() && this.f39339c == absListViewScrollEvent.firstVisibleItem() && this.f39340d == absListViewScrollEvent.visibleItemCount() && this.f39341e == absListViewScrollEvent.totalItemCount()) {
            return true;
        }
        return false;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int firstVisibleItem() {
        return this.f39339c;
    }

    public int hashCode() {
        return ((((((((this.f39337a.hashCode() ^ 1000003) * 1000003) ^ this.f39338b) * 1000003) ^ this.f39339c) * 1000003) ^ this.f39340d) * 1000003) ^ this.f39341e;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int scrollState() {
        return this.f39338b;
    }

    public String toString() {
        return "AbsListViewScrollEvent{view=" + this.f39337a + ", scrollState=" + this.f39338b + ", firstVisibleItem=" + this.f39339c + ", visibleItemCount=" + this.f39340d + ", totalItemCount=" + this.f39341e + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int totalItemCount() {
        return this.f39341e;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public AbsListView view() {
        return this.f39337a;
    }

    @Override // com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent
    public int visibleItemCount() {
        return this.f39340d;
    }
}