package androidx.core.util;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ObjectsCompat {

    /* renamed from: androidx.core.util.ObjectsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4074a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57010a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m57009b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return C4074a.m57010a(obj, obj2);
    }

    public static int hash(@Nullable Object... objArr) {
        return C4074a.m57009b(objArr);
    }

    public static int hashCode(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    @Nullable
    public static String toString(@Nullable Object obj, @Nullable String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}