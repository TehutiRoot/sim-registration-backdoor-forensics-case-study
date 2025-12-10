package p000;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding2.view.ViewGroupHierarchyChildViewRemoveEvent;

/* renamed from: u9 */
/* loaded from: classes5.dex */
public final class C16799u9 extends ViewGroupHierarchyChildViewRemoveEvent {

    /* renamed from: a */
    public final ViewGroup f107292a;

    /* renamed from: b */
    public final View f107293b;

    public C16799u9(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            this.f107292a = viewGroup;
            if (view != null) {
                this.f107293b = view;
                return;
            }
            throw new NullPointerException("Null child");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public View child() {
        return this.f107293b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewGroupHierarchyChildViewRemoveEvent)) {
            return false;
        }
        ViewGroupHierarchyChildViewRemoveEvent viewGroupHierarchyChildViewRemoveEvent = (ViewGroupHierarchyChildViewRemoveEvent) obj;
        if (this.f107292a.equals(viewGroupHierarchyChildViewRemoveEvent.view()) && this.f107293b.equals(viewGroupHierarchyChildViewRemoveEvent.child())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f107292a.hashCode() ^ 1000003) * 1000003) ^ this.f107293b.hashCode();
    }

    public String toString() {
        return "ViewGroupHierarchyChildViewRemoveEvent{view=" + this.f107292a + ", child=" + this.f107293b + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public ViewGroup view() {
        return this.f107292a;
    }
}
