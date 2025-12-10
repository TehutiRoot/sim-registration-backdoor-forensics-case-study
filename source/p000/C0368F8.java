package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding2.view.MenuItemActionViewExpandEvent;

/* renamed from: F8 */
/* loaded from: classes5.dex */
public final class C0368F8 extends MenuItemActionViewExpandEvent {

    /* renamed from: a */
    public final MenuItem f1513a;

    public C0368F8(MenuItem menuItem) {
        if (menuItem != null) {
            this.f1513a = menuItem;
            return;
        }
        throw new NullPointerException("Null menuItem");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MenuItemActionViewExpandEvent) {
            return this.f1513a.equals(((MenuItemActionViewExpandEvent) obj).menuItem());
        }
        return false;
    }

    public int hashCode() {
        return this.f1513a.hashCode() ^ 1000003;
    }

    @Override // com.jakewharton.rxbinding2.view.MenuItemActionViewEvent
    public MenuItem menuItem() {
        return this.f1513a;
    }

    public String toString() {
        return "MenuItemActionViewExpandEvent{menuItem=" + this.f1513a + "}";
    }
}
