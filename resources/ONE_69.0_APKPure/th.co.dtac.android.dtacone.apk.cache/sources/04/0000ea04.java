package p000;

import java.lang.reflect.Array;

/* renamed from: m70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC21074m70 {
    /* renamed from: a */
    public static int[] m26733a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m26731c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: b */
    public static Object[] m26732b(Object[] objArr, int i, Object obj) {
        if (i + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m26731c(i));
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        objArr[i] = obj;
        return objArr;
    }

    /* renamed from: c */
    public static int m26731c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}