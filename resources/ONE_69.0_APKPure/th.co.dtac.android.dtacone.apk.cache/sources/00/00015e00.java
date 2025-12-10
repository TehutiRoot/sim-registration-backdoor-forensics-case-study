package p000;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding2.view.ViewGroupHierarchyChildViewRemoveEvent;

/* renamed from: u9 */
/* loaded from: classes5.dex */
public final class C16815u9 extends ViewGroupHierarchyChildViewRemoveEvent {

    /* renamed from: a */
    public final ViewGroup f107630a;

    /* renamed from: b */
    public final View f107631b;

    public C16815u9(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            this.f107630a = viewGroup;
            if (view != null) {
                this.f107631b = view;
                return;
            }
            throw new NullPointerException("Null child");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public View child() {
        return this.f107631b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewGroupHierarchyChildViewRemoveEvent)) {
            return false;
        }
        ViewGroupHierarchyChildViewRemoveEvent viewGroupHierarchyChildViewRemoveEvent = (ViewGroupHierarchyChildViewRemoveEvent) obj;
        if (this.f107630a.equals(viewGroupHierarchyChildViewRemoveEvent.view()) && this.f107631b.equals(viewGroupHierarchyChildViewRemoveEvent.child())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f107630a.hashCode() ^ 1000003) * 1000003) ^ this.f107631b.hashCode();
    }

    public String toString() {
        return "ViewGroupHierarchyChildViewRemoveEvent{view=" + this.f107630a + ", child=" + this.f107631b + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewGroupHierarchyChangeEvent
    public ViewGroup view() {
        return this.f107630a;
    }
}