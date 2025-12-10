package p000;

/* renamed from: Qe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18338Qe2 {
    /* renamed from: a */
    public static int m66750a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}