package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class TooltipCompat {

    /* renamed from: androidx.appcompat.widget.TooltipCompat$a */
    /* loaded from: classes.dex */
    public static class C2260a {
        @DoNotInline
        /* renamed from: a */
        public static void m64110a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2260a.m64110a(view, charSequence);
        } else {
            HT1.m68088h(view, charSequence);
        }
    }
}
