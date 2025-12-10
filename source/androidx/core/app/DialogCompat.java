package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class DialogCompat {

    /* renamed from: androidx.core.app.DialogCompat$a */
    /* loaded from: classes2.dex */
    public static class C3836a {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m57928a(Dialog dialog, int i) {
            return (T) dialog.requireViewById(i);
        }
    }

    @NonNull
    public static View requireViewById(@NonNull Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C3836a.m57928a(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
