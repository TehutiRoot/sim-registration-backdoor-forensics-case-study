package p000;

import android.widget.AdapterView;
import com.jakewharton.rxbinding2.widget.AdapterViewNothingSelectionEvent;

/* renamed from: g8 */
/* loaded from: classes5.dex */
public final class C10279g8 extends AdapterViewNothingSelectionEvent {

    /* renamed from: a */
    public final AdapterView f62057a;

    public C10279g8(AdapterView adapterView) {
        if (adapterView != null) {
            this.f62057a = adapterView;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdapterViewNothingSelectionEvent) {
            return this.f62057a.equals(((AdapterViewNothingSelectionEvent) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.f62057a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AdapterViewNothingSelectionEvent{view=" + this.f62057a + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.AdapterViewSelectionEvent
    public AdapterView view() {
        return this.f62057a;
    }
}
