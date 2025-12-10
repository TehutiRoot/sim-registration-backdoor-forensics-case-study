package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class StartupLogger {
    /* renamed from: e */
    public static void m52739e(@NonNull String str, @Nullable Throwable th2) {
    }

    /* renamed from: i */
    public static void m52738i(@NonNull String str) {
    }

    /* renamed from: w */
    public static void m52737w(@NonNull String str) {
        Log.w("StartupLogger", str);
    }
}