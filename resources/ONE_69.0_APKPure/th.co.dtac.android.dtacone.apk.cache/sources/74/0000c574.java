package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent;

/* renamed from: e8 */
/* loaded from: classes5.dex */
public final class C10126e8 extends AdapterViewItemLongClickEvent {

    /* renamed from: a */
    public final AdapterView f61479a;

    /* renamed from: b */
    public final View f61480b;

    /* renamed from: c */
    public final int f61481c;

    /* renamed from: d */
    public final long f61482d;

    public C10126e8(AdapterView adapterView, View view, int i, long j) {
        if (adapterView != null) {
            this.f61479a = adapterView;
            if (view != null) {
                this.f61480b = view;
                this.f61481c = i;
                this.f61482d = j;
                return;
            }
            throw new NullPointerException("Null clickedView");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    public View clickedView() {
        return this.f61480b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemLongClickEvent)) {
            return false;
        }
        AdapterViewItemLongClickEvent adapterViewItemLongClickEvent = (AdapterViewItemLongClickEvent) obj;
        if (this.f61479a.equals(adapterViewItemLongClickEvent.view()) && this.f61480b.equals(adapterViewItemLongClickEvent.clickedView()) && this.f61481c == adapterViewItemLongClickEvent.position() && this.f61482d == adapterViewItemLongClickEvent.mo31735id()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f61482d;
        return ((((((this.f61479a.hashCode() ^ 1000003) * 1000003) ^ this.f61480b.hashCode()) * 1000003) ^ this.f61481c) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    /* renamed from: id */
    public long mo31735id() {
        return this.f61482d;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    public int position() {
        return this.f61481c;
    }

    public String toString() {
        return "AdapterViewItemLongClickEvent{view=" + this.f61479a + ", clickedView=" + this.f61480b + ", position=" + this.f61481c + ", id=" + this.f61482d + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent
    public AdapterView view() {
        return this.f61479a;
    }
}