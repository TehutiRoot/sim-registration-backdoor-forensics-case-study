package com.jakewharton.rxbinding3.view;

import android.view.MenuItem;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lcom/jakewharton/rxbinding3/view/MenuItemActionViewExpandEvent;", "Lcom/jakewharton/rxbinding3/view/MenuItemActionViewEvent;", "Landroid/view/MenuItem;", "menuItem", "<init>", "(Landroid/view/MenuItem;)V", "component1", "()Landroid/view/MenuItem;", "copy", "(Landroid/view/MenuItem;)Lcom/jakewharton/rxbinding3/view/MenuItemActionViewExpandEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/MenuItem;", "getMenuItem", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class MenuItemActionViewExpandEvent extends MenuItemActionViewEvent {

    /* renamed from: a */
    public final MenuItem f58274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuItemActionViewExpandEvent(@NotNull MenuItem menuItem) {
        super(null);
        Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
        this.f58274a = menuItem;
    }

    public static /* synthetic */ MenuItemActionViewExpandEvent copy$default(MenuItemActionViewExpandEvent menuItemActionViewExpandEvent, MenuItem menuItem, int i, Object obj) {
        if ((i & 1) != 0) {
            menuItem = menuItemActionViewExpandEvent.getMenuItem();
        }
        return menuItemActionViewExpandEvent.copy(menuItem);
    }

    @NotNull
    public final MenuItem component1() {
        return getMenuItem();
    }

    @NotNull
    public final MenuItemActionViewExpandEvent copy(@NotNull MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
        return new MenuItemActionViewExpandEvent(menuItem);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof MenuItemActionViewExpandEvent) && Intrinsics.areEqual(getMenuItem(), ((MenuItemActionViewExpandEvent) obj).getMenuItem());
        }
        return true;
    }

    @Override // com.jakewharton.rxbinding3.view.MenuItemActionViewEvent
    @NotNull
    public MenuItem getMenuItem() {
        return this.f58274a;
    }

    public int hashCode() {
        MenuItem menuItem = getMenuItem();
        if (menuItem != null) {
            return menuItem.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "MenuItemActionViewExpandEvent(menuItem=" + getMenuItem() + ")";
    }
}