package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class SQLiteCursorCompat {

    /* renamed from: androidx.core.database.sqlite.SQLiteCursorCompat$a */
    /* loaded from: classes2.dex */
    public static class C3984a {
        @DoNotInline
        /* renamed from: a */
        public static void m57389a(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            C3984a.m57389a(sQLiteCursor, z);
        }
    }
}
