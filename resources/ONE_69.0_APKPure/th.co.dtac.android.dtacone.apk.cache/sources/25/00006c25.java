package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class ListPopupWindowCompat {

    /* renamed from: androidx.core.widget.ListPopupWindowCompat$a */
    /* loaded from: classes2.dex */
    public static class C4200a {
        @DoNotInline
        /* renamed from: a */
        public static View.OnTouchListener m56469a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        return createDragToOpenListener((ListPopupWindow) obj, view);
    }

    @Nullable
    public static View.OnTouchListener createDragToOpenListener(@NonNull ListPopupWindow listPopupWindow, @NonNull View view) {
        return C4200a.m56469a(listPopupWindow, view);
    }
}