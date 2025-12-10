package p000;

/* renamed from: oc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21441oc2 {
    /* renamed from: a */
    public static int m25901a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: b */
    public static void m25900b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String obj3 = obj.toString();
            throw new NullPointerException("null value in entry: " + obj3 + "=null");
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
