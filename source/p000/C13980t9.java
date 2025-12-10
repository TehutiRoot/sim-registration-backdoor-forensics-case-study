package p000;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding2.view.ViewGroupHierarchyChildViewAddEvent;

/* renamed from: t9 */
/* loaded from: classes5.dex */
public final class C13980t9 extends ViewGroupHierarchyChildViewAddEvent {

    /* renamed from: a */
    public final ViewGroup f80019a;

    /* renamed from: b */
    public final View f80020b;

    public C13980t9(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            this.f80019a = viewGroup;
            if (view != null) {
                this.f80020b = view;
                return;
            }
            throw new NullPointerException("Null child");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public View child() {
        return this.f80020b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewGroupHierarchyChildViewAddEvent)) {
            return false;
        }
        ViewGroupHierarchyChildViewAddEvent viewGroupHierarchyChildViewAddEvent = (ViewGroupHierarchyChildViewAddEvent) obj;
        if (this.f80019a.equals(viewGroupHierarchyChildViewAddEvent.view()) && this.f80020b.equals(viewGroupHierarchyChildViewAddEvent.child())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f80019a.hashCode() ^ 1000003) * 1000003) ^ this.f80020b.hashCode();
    }

    public String toString() {
        return "ViewGroupHierarchyChildViewAddEvent{view=" + this.f80019a + ", child=" + this.f80020b + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public ViewGroup view() {
        return this.f80019a;
    }
}
