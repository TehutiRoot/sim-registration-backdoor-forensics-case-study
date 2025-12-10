package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.math.BigDecimal;
import java.math.RoundingMode;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public class BigDecimalMath {

    /* renamed from: com.google.common.math.BigDecimalMath$a */
    /* loaded from: classes4.dex */
    public static class C8114a extends AbstractC22280tT1 {

        /* renamed from: a */
        public static final C8114a f53983a = new C8114a();

        @Override // p000.AbstractC22280tT1
        /* renamed from: f */
        public BigDecimal mo22415a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }

        @Override // p000.AbstractC22280tT1
        /* renamed from: g */
        public double mo22413c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        @Override // p000.AbstractC22280tT1
        /* renamed from: h */
        public int mo22412d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // p000.AbstractC22280tT1
        /* renamed from: i */
        public BigDecimal mo22411e(double d, RoundingMode roundingMode) {
            return new BigDecimal(d);
        }
    }

    public static double roundToDouble(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return C8114a.f53983a.m22414b(bigDecimal, roundingMode);
    }
}
