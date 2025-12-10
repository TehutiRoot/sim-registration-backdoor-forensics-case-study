package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent;

/* renamed from: f8 */
/* loaded from: classes5.dex */
public final class C10205f8 extends AdapterViewItemSelectionEvent {

    /* renamed from: a */
    public final AdapterView f61721a;

    /* renamed from: b */
    public final View f61722b;

    /* renamed from: c */
    public final int f61723c;

    /* renamed from: d */
    public final long f61724d;

    public C10205f8(AdapterView adapterView, View view, int i, long j) {
        if (adapterView != null) {
            this.f61721a = adapterView;
            if (view != null) {
                this.f61722b = view;
                this.f61723c = i;
                this.f61724d = j;
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
        if (this.f61721a.equals(adapterViewItemSelectionEvent.view()) && this.f61722b.equals(adapterViewItemSelectionEvent.selectedView()) && this.f61723c == adapterViewItemSelectionEvent.position() && this.f61724d == adapterViewItemSelectionEvent.mo31352id()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f61724d;
        return ((((((this.f61721a.hashCode() ^ 1000003) * 1000003) ^ this.f61722b.hashCode()) * 1000003) ^ this.f61723c) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent
    /* renamed from: id */
    public long mo31352id() {
        return this.f61724d;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent
    public int position() {
        return this.f61723c;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent
    public View selectedView() {
        return this.f61722b;
    }

    public String toString() {
        return "AdapterViewItemSelectionEvent{view=" + this.f61721a + ", selectedView=" + this.f61722b + ", position=" + this.f61723c + ", id=" + this.f61724d + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewSelectionEvent
    public AdapterView view() {
        return this.f61721a;
    }
}
