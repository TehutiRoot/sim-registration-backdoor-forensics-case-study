package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class PopupMenuCompat {

    /* renamed from: androidx.core.widget.PopupMenuCompat$a */
    /* loaded from: classes2.dex */
    public static class C4206a {
        @DoNotInline
        /* renamed from: a */
        public static View.OnTouchListener m56430a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    @Nullable
    public static View.OnTouchListener getDragToOpenListener(@NonNull Object obj) {
        return C4206a.m56430a((PopupMenu) obj);
    }
}