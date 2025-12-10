package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent;

/* renamed from: e8 */
/* loaded from: classes5.dex */
public final class C10129e8 extends AdapterViewItemLongClickEvent {

    /* renamed from: a */
    public final AdapterView f61412a;

    /* renamed from: b */
    public final View f61413b;

    /* renamed from: c */
    public final int f61414c;

    /* renamed from: d */
    public final long f61415d;

    public C10129e8(AdapterView adapterView, View view, int i, long j) {
        if (adapterView != null) {
            this.f61412a = adapterView;
            if (view != null) {
                this.f61413b = view;
                this.f61414c = i;
                this.f61415d = j;
                return;
            }
            throw new NullPointerException("Null clickedView");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    public View clickedView() {
        return this.f61413b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemLongClickEvent)) {
            return false;
        }
        AdapterViewItemLongClickEvent adapterViewItemLongClickEvent = (AdapterViewItemLongClickEvent) obj;
        if (this.f61412a.equals(adapterViewItemLongClickEvent.view()) && this.f61413b.equals(adapterViewItemLongClickEvent.clickedView()) && this.f61414c == adapterViewItemLongClickEvent.position() && this.f61415d == adapterViewItemLongClickEvent.mo31589id()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f61415d;
        return ((((((this.f61412a.hashCode() ^ 1000003) * 1000003) ^ this.f61413b.hashCode()) * 1000003) ^ this.f61414c) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    /* renamed from: id */
    public long mo31589id() {
        return this.f61415d;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    public int position() {
        return this.f61414c;
    }

    public String toString() {
        return "AdapterViewItemLongClickEvent{view=" + this.f61412a + ", clickedView=" + this.f61413b + ", position=" + this.f61414c + ", id=" + this.f61415d + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    public AdapterView view() {
        return this.f61412a;
    }
}
