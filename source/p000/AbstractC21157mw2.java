package p000;

import java.util.Objects;

/* renamed from: mw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21157mw2 {
    /* renamed from: a */
    public static void m26174a(Object obj, Object obj2) {
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
