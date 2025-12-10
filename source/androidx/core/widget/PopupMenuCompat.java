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
    public static class C4224a {
        @DoNotInline
        /* renamed from: a */
        public static View.OnTouchListener m56480a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    @Nullable
    public static View.OnTouchListener getDragToOpenListener(@NonNull Object obj) {
        return C4224a.m56480a((PopupMenu) obj);
    }
}
