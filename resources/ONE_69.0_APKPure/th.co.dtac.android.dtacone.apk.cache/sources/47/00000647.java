package p000;

import java.util.Objects;

/* renamed from: Gd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17685Gd2 {
    /* renamed from: a */
    public static int m68264a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: b */
    public static void m68263b(Object obj, Object obj2) {
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