package p000;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: ph0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC21688ph0 {
    /* renamed from: a */
    public static /* synthetic */ BigDecimal m23780a(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}