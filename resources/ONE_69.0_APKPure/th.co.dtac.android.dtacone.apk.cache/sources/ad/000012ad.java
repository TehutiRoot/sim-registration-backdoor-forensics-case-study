package p000;

import java.time.Duration;

/* renamed from: Tf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18534Tf0 {
    /* renamed from: a */
    public static long m66329a(Duration duration) {
        boolean isNegative;
        long nanos;
        try {
            nanos = duration.toNanos();
            return nanos;
        } catch (ArithmeticException unused) {
            isNegative = duration.isNegative();
            if (isNegative) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }
}