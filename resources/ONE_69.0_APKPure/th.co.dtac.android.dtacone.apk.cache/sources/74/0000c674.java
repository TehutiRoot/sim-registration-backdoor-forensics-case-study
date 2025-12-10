package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent;

/* renamed from: f8 */
/* loaded from: classes5.dex */
public final class C10200f8 extends AdapterViewItemSelectionEvent {

    /* renamed from: a */
    public final AdapterView f61781a;

    /* renamed from: b */
    public final View f61782b;

    /* renamed from: c */
    public final int f61783c;

    /* renamed from: d */
    public final long f61784d;

    public C10200f8(AdapterView adapterView, View view, int i, long j) {
        if (adapterView != null) {
            this.f61781a = adapterView;
            if (view != null) {
                this.f61782b = view;
                this.f61783c = i;
                this.f61784d = j;
                return;
            }
            throw new NullPointerException("Null selectedView");
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemSelectionEvent)) {
            return false;
        }
        AdapterViewItemSelectionEvent adapterViewItemSelectionEvent = (AdapterViewItemSelectionEvent) obj;
        if (this.f61781a.equals(adapterViewItemSelectionEvent.view()) && this.f61782b.equals(adapterViewItemSelectionEvent.selectedView()) && this.f61783c == adapterViewItemSelectionEvent.position() && this.f61784d == adapterViewItemSelectionEvent.mo31548id()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f61784d;
        return ((((((this.f61781a.hashCode() ^ 1000003) * 1000003) ^ this.f61782b.hashCode()) * 1000003) ^ this.f61783c) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent
    /* renamed from: id */
    public long mo31548id() {
        return this.f61784d;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent
    public int position() {
        return this.f61783c;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent
    public View selectedView() {
        return this.f61782b;
    }

    public String toString() {
        return "AdapterViewItemSelectionEvent{view=" + this.f61781a + ", selectedView=" + this.f61782b + ", position=" + this.f61783c + ", id=" + this.f61784d + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewSelectionEvent
    public AdapterView view() {
        return this.f61781a;
    }
}