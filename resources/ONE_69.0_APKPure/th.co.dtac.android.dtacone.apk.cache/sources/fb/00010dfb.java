package p000;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding2.view.ViewGroupHierarchyChildViewAddEvent;

/* renamed from: t9 */
/* loaded from: classes5.dex */
public final class C13963t9 extends ViewGroupHierarchyChildViewAddEvent {

    /* renamed from: a */
    public final ViewGroup f80099a;

    /* renamed from: b */
    public final View f80100b;

    public C13963t9(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            this.f80099a = viewGroup;
            if (view != null) {
                this.f80100b = view;
                return;
            }
            throw new NullPointerException("Null child");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public View child() {
        return this.f80100b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewGroupHierarchyChildViewAddEvent)) {
            return false;
        }
        ViewGroupHierarchyChildViewAddEvent viewGroupHierarchyChildViewAddEvent = (ViewGroupHierarchyChildViewAddEvent) obj;
        if (this.f80099a.equals(viewGroupHierarchyChildViewAddEvent.view()) && this.f80100b.equals(viewGroupHierarchyChildViewAddEvent.child())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f80099a.hashCode() ^ 1000003) * 1000003) ^ this.f80100b.hashCode();
    }

    public String toString() {
        return "ViewGroupHierarchyChildViewAddEvent{view=" + this.f80099a + ", child=" + this.f80100b + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public ViewGroup view() {
        return this.f80099a;
    }
}