package p000;

import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;

/* renamed from: KX1 */
/* loaded from: classes5.dex */
public final class KX1 {

    /* renamed from: c */
    public static final int[] f3345c = {1, 1, 2};

    /* renamed from: a */
    public final IX1 f3346a = new IX1();

    /* renamed from: b */
    public final JX1 f3347b = new JX1();

    /* renamed from: a */
    public Result m67706a(int i, BitArray bitArray, int i2) {
        int[] m34023d = UPCEANReader.m34023d(bitArray, i2, false, f3345c);
        try {
            return this.f3347b.m67865b(i, bitArray, m34023d);
        } catch (ReaderException unused) {
            return this.f3346a.m68006b(i, bitArray, m34023d);
        }
    }
}