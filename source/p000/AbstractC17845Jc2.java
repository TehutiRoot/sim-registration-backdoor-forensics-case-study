package p000;

import java.util.Objects;

/* renamed from: Jc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17845Jc2 {
    /* renamed from: a */
    public static int m67732a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: b */
    public static void m67731b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Objects.toString(obj2);
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
