package com.google.gson.internal;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class NumberLimits {
    /* renamed from: a */
    public static void m37542a(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        m37542a(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: " + str);
    }

    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        m37542a(str);
        return new BigInteger(str);
    }
}
