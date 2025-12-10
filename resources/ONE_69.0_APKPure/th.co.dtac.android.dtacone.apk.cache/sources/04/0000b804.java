package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ReedSolomonEncoder {

    /* renamed from: a */
    public final GenericGF f57802a;

    /* renamed from: b */
    public final List f57803b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f57802a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.f57803b = arrayList;
        arrayList.add(new S50(genericGF, new int[]{1}));
    }

    /* renamed from: a */
    public final S50 m34128a(int i) {
        if (i >= this.f57803b.size()) {
            List list = this.f57803b;
            S50 s50 = (S50) list.get(list.size() - 1);
            for (int size = this.f57803b.size(); size <= i; size++) {
                GenericGF genericGF = this.f57802a;
                s50 = s50.m66540i(new S50(genericGF, new int[]{1, genericGF.m34137c((size - 1) + genericGF.getGeneratorBase())}));
                this.f57803b.add(s50);
            }
        }
        return (S50) this.f57803b.get(i);
    }

    public void encode(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                S50 m34128a = m34128a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] m66544e = new S50(this.f57802a, iArr2).m66539j(i, 1).m66547b(m34128a)[1].m66544e();
                int length2 = i - m66544e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(m66544e, 0, iArr, length + length2, m66544e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}