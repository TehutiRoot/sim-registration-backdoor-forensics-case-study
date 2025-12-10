package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class CursorWindowCompat {

    /* renamed from: androidx.core.database.CursorWindowCompat$a */
    /* loaded from: classes2.dex */
    public static class C3964a {
        @DoNotInline
        /* renamed from: a */
        public static CursorWindow m57341a(String str) {
            return new CursorWindow(str);
        }
    }

    /* renamed from: androidx.core.database.CursorWindowCompat$b */
    /* loaded from: classes2.dex */
    public static class C3965b {
        @DoNotInline
        /* renamed from: a */
        public static CursorWindow m57340a(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3965b.m57340a(str, j);
        }
        return C3964a.m57341a(str);
    }
}