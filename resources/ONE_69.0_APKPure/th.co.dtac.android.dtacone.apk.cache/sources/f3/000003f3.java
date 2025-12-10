package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding2.view.MenuItemActionViewCollapseEvent;

/* renamed from: E8 */
/* loaded from: classes5.dex */
public final class C0295E8 extends MenuItemActionViewCollapseEvent {

    /* renamed from: a */
    public final MenuItem f1263a;

    public C0295E8(MenuItem menuItem) {
        if (menuItem != null) {
            this.f1263a = menuItem;
            return;
        }
        throw new NullPointerException("Null menuItem");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MenuItemActionViewCollapseEvent) {
            return this.f1263a.equals(((MenuItemActionViewCollapseEvent) obj).menuItem());
        }
        return false;
    }

    public int hashCode() {
        return this.f1263a.hashCode() ^ 1000003;
    }

    @Override // com.jakewharton.rxbinding2.view.MenuItemActionViewEvent
    public MenuItem menuItem() {
        return this.f1263a;
    }

    public String toString() {
        return "MenuItemActionViewCollapseEvent{menuItem=" + this.f1263a + "}";
    }
}