package p000;

import android.view.View;
import com.jakewharton.rxbinding2.view.ViewAttachDetachedEvent;

/* renamed from: s9 */
/* loaded from: classes5.dex */
public final class C13897s9 extends ViewAttachDetachedEvent {

    /* renamed from: a */
    public final View f79804a;

    public C13897s9(View view) {
        if (view != null) {
            this.f79804a = view;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViewAttachDetachedEvent) {
            return this.f79804a.equals(((ViewAttachDetachedEvent) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.f79804a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ViewAttachDetachedEvent{view=" + this.f79804a + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewAttachEvent
    public View view() {
        return this.f79804a;
    }
}