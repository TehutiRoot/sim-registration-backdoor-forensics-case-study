package p000;

/* renamed from: Cl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17449Cl2 {
    /* renamed from: a */
    public static int m68919a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: b */
    public static int m68918b(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return m68919a(hashCode);
    }
}