package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ReedSolomonEncoder {

    /* renamed from: a */
    public final GenericGF f57790a;

    /* renamed from: b */
    public final List f57791b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f57790a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.f57791b = arrayList;
        arrayList.add(new O50(genericGF, new int[]{1}));
    }

    /* renamed from: a */
    public final O50 m34136a(int i) {
        if (i >= this.f57791b.size()) {
            List list = this.f57791b;
            O50 o50 = (O50) list.get(list.size() - 1);
            for (int size = this.f57791b.size(); size <= i; size++) {
                GenericGF genericGF = this.f57790a;
                o50 = o50.m67115i(new O50(genericGF, new int[]{1, genericGF.m34145c((size - 1) + genericGF.getGeneratorBase())}));
                this.f57791b.add(o50);
            }
        }
        return (O50) this.f57791b.get(i);
    }

    public void encode(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                O50 m34136a = m34136a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] m67119e = new O50(this.f57790a, iArr2).m67114j(i, 1).m67122b(m34136a)[1].m67119e();
                int length2 = i - m67119e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(m67119e, 0, iArr, length + length2, m67119e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
