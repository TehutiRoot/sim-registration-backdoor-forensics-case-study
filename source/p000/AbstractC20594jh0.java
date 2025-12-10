package p000;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: jh0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20594jh0 {
    /* renamed from: a */
    public static /* synthetic */ BigDecimal m29151a(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}
