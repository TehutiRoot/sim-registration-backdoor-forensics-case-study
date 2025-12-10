package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent;

/* renamed from: d8 */
/* loaded from: classes5.dex */
public final class C10043d8 extends AdapterViewItemClickEvent {

    /* renamed from: a */
    public final AdapterView f61108a;

    /* renamed from: b */
    public final View f61109b;

    /* renamed from: c */
    public final int f61110c;

    /* renamed from: d */
    public final long f61111d;

    public C10043d8(AdapterView adapterView, View view, int i, long j) {
        if (adapterView != null) {
            this.f61108a = adapterView;
            if (view != null) {
                this.f61109b = view;
                this.f61110c = i;
                this.f61111d = j;
                return;
            }
            throw new NullPointerException("Null clickedView");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    public View clickedView() {
        return this.f61109b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemClickEvent)) {
            return false;
        }
        AdapterViewItemClickEvent adapterViewItemClickEvent = (AdapterViewItemClickEvent) obj;
        if (this.f61108a.equals(adapterViewItemClickEvent.view()) && this.f61109b.equals(adapterViewItemClickEvent.clickedView()) && this.f61110c == adapterViewItemClickEvent.position() && this.f61111d == adapterViewItemClickEvent.mo31912id()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f61111d;
        return ((((((this.f61108a.hashCode() ^ 1000003) * 1000003) ^ this.f61109b.hashCode()) * 1000003) ^ this.f61110c) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    /* renamed from: id */
    public long mo31912id() {
        return this.f61111d;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    public int position() {
        return this.f61110c;
    }

    public String toString() {
        return "AdapterViewItemClickEvent{view=" + this.f61108a + ", clickedView=" + this.f61109b + ", position=" + this.f61110c + ", id=" + this.f61111d + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    public AdapterView view() {
        return this.f61108a;
    }
}