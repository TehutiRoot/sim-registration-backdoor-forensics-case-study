package p000;

import android.view.View;
import com.jakewharton.rxbinding2.view.ViewAttachAttachedEvent;

/* renamed from: r9 */
/* loaded from: classes5.dex */
public final class C13234r9 extends ViewAttachAttachedEvent {

    /* renamed from: a */
    public final View f77417a;

    public C13234r9(View view) {
        if (view != null) {
            this.f77417a = view;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViewAttachAttachedEvent) {
            return this.f77417a.equals(((ViewAttachAttachedEvent) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.f77417a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ViewAttachAttachedEvent{view=" + this.f77417a + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewAttachEvent
    public View view() {
        return this.f77417a;
    }
}