package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent;

/* renamed from: d8 */
/* loaded from: classes5.dex */
public final class C10051d8 extends AdapterViewItemClickEvent {

    /* renamed from: a */
    public final AdapterView f61069a;

    /* renamed from: b */
    public final View f61070b;

    /* renamed from: c */
    public final int f61071c;

    /* renamed from: d */
    public final long f61072d;

    public C10051d8(AdapterView adapterView, View view, int i, long j) {
        if (adapterView != null) {
            this.f61069a = adapterView;
            if (view != null) {
                this.f61070b = view;
                this.f61071c = i;
                this.f61072d = j;
                return;
            }
            throw new NullPointerException("Null clickedView");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    public View clickedView() {
        return this.f61070b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemClickEvent)) {
            return false;
        }
        AdapterViewItemClickEvent adapterViewItemClickEvent = (AdapterViewItemClickEvent) obj;
        if (this.f61069a.equals(adapterViewItemClickEvent.view()) && this.f61070b.equals(adapterViewItemClickEvent.clickedView()) && this.f61071c == adapterViewItemClickEvent.position() && this.f61072d == adapterViewItemClickEvent.mo31919id()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f61072d;
        return ((((((this.f61069a.hashCode() ^ 1000003) * 1000003) ^ this.f61070b.hashCode()) * 1000003) ^ this.f61071c) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    /* renamed from: id */
    public long mo31919id() {
        return this.f61072d;
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    public int position() {
        return this.f61071c;
    }

    public String toString() {
        return "AdapterViewItemClickEvent{view=" + this.f61069a + ", clickedView=" + this.f61070b + ", position=" + this.f61071c + ", id=" + this.f61072d + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent
    public AdapterView view() {
        return this.f61069a;
    }
}
