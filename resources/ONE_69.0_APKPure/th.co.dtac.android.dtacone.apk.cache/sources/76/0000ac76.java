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
    public static class C8103a extends AbstractC21829qU1 {

        /* renamed from: a */
        public static final C8103a f53995a = new C8103a();

        @Override // p000.AbstractC21829qU1
        /* renamed from: f */
        public BigDecimal mo23631a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }

        @Override // p000.AbstractC21829qU1
        /* renamed from: g */
        public double mo23629c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        @Override // p000.AbstractC21829qU1
        /* renamed from: h */
        public int mo23628d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // p000.AbstractC21829qU1
        /* renamed from: i */
        public BigDecimal mo23627e(double d, RoundingMode roundingMode) {
            return new BigDecimal(d);
        }
    }

    public static double roundToDouble(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return C8103a.f53995a.m23630b(bigDecimal, roundingMode);
    }
}