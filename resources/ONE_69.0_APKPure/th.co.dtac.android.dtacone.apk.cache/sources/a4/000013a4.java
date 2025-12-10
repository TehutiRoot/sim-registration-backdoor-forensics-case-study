package p000;

/* renamed from: Ue2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18598Ue2 {
    /* renamed from: a */
    public static void m66126a(Object obj, Object obj2) {
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