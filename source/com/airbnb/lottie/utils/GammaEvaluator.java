package com.airbnb.lottie.utils;

/* loaded from: classes3.dex */
public class GammaEvaluator {
    /* renamed from: a */
    public static float m50654a(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    public static float m50653b(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float m50654a = m50654a(((i >> 16) & 255) / 255.0f);
        float m50654a2 = m50654a(((i >> 8) & 255) / 255.0f);
        float m50654a3 = m50654a((i & 255) / 255.0f);
        float m50654a4 = m50654a(((i2 >> 16) & 255) / 255.0f);
        float m50654a5 = m50654a(((i2 >> 8) & 255) / 255.0f);
        float m50654a6 = m50654a3 + (f * (m50654a((i2 & 255) / 255.0f) - m50654a3));
        return (Math.round(m50653b(m50654a + ((m50654a4 - m50654a) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m50653b(m50654a2 + ((m50654a5 - m50654a2) * f)) * 255.0f) << 8) | Math.round(m50653b(m50654a6) * 255.0f);
    }
}
