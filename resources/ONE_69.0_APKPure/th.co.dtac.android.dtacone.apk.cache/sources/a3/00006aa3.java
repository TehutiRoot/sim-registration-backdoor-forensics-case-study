package androidx.core.p005os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.os.UserManagerCompat */
/* loaded from: classes2.dex */
public class UserManagerCompat {

    /* renamed from: androidx.core.os.UserManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4035a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57104a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean isUserUnlocked(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4035a.m57104a(context);
        }
        return true;
    }
}