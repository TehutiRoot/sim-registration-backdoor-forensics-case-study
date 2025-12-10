package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cs */
/* loaded from: classes5.dex */
public class C9315cs implements keys {
    private static int ThreeDS2Service = 1;
    public static char[] get = {'4', 'n', 'n', 'p', 'K', '1', 'H', 'O', '7', 'C', 'j', 'k', 'm', 'k', 'f', 'g', 'h', 'm', 'c', 'A', Matrix.MATRIX_TYPE_RANDOM_UT, '|', 'M'};
    private static int valueOf;
    private final InterfaceC9652ns values = C9653nt.ThreeDS2ServiceInstance(C9315cs.class);

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        int i = ThreeDS2Service + 29;
        valueOf = i % 128;
        if (i % 2 != 0) {
            Boolean bool = Boolean.TRUE;
            new Object[0][1] = bool;
            threeDS2ServiceInstance.ThreeDS2ServiceInstance(bool);
        } else {
            threeDS2ServiceInstance.ThreeDS2ServiceInstance(Boolean.TRUE);
        }
        int i2 = valueOf + 93;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        throw null;
    }
}
