package p000;

/* renamed from: iL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20372iL2 {
    /* renamed from: a */
    public static int m30643a(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
