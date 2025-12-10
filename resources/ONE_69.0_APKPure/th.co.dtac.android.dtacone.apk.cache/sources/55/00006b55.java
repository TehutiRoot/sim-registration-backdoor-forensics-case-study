package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes2.dex */
public final class MenuCompat {

    /* renamed from: androidx.core.view.MenuCompat$a */
    /* loaded from: classes2.dex */
    public static class C4097a {
        @DoNotInline
        /* renamed from: a */
        public static void m56936a(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    public static void setGroupDividerEnabled(@NonNull Menu menu, boolean z) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C4097a.m56936a(menu, z);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}