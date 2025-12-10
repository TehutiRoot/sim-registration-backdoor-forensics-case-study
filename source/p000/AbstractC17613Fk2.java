package p000;

/* renamed from: Fk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17613Fk2 {
    /* renamed from: a */
    public static int m68366a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: b */
    public static int m68365b(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return m68366a(hashCode);
    }
}
