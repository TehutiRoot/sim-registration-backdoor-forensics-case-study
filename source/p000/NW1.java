package p000;

import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;

/* renamed from: NW1 */
/* loaded from: classes5.dex */
public final class NW1 {

    /* renamed from: c */
    public static final int[] f4129c = {1, 1, 2};

    /* renamed from: a */
    public final LW1 f4130a = new LW1();

    /* renamed from: b */
    public final MW1 f4131b = new MW1();

    /* renamed from: a */
    public Result m67209a(int i, BitArray bitArray, int i2) {
        int[] m34031d = UPCEANReader.m34031d(bitArray, i2, false, f4129c);
        try {
            return this.f4131b.m67372b(i, bitArray, m34031d);
        } catch (ReaderException unused) {
            return this.f4130a.m67512b(i, bitArray, m34031d);
        }
    }
}
