package p000;

/* renamed from: ie2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20415ie2 {
    /* renamed from: a */
    public static int m30619a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
