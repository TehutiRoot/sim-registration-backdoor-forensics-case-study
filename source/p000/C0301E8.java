package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding2.view.MenuItemActionViewCollapseEvent;

/* renamed from: E8 */
/* loaded from: classes5.dex */
public final class C0301E8 extends MenuItemActionViewCollapseEvent {

    /* renamed from: a */
    public final MenuItem f1215a;

    public C0301E8(MenuItem menuItem) {
        if (menuItem != null) {
            this.f1215a = menuItem;
            return;
        }
        throw new NullPointerException("Null menuItem");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MenuItemActionViewCollapseEvent) {
            return this.f1215a.equals(((MenuItemActionViewCollapseEvent) obj).menuItem());
        }
        return false;
    }

    public int hashCode() {
        return this.f1215a.hashCode() ^ 1000003;
    }

    @Override // com.jakewharton.rxbinding2.view.MenuItemActionViewEvent
    public MenuItem menuItem() {
        return this.f1215a;
    }

    public String toString() {
        return "MenuItemActionViewCollapseEvent{menuItem=" + this.f1215a + "}";
    }
}
