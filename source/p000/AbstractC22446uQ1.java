package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.internal.SystemPropsKt;

/* renamed from: uQ1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22446uQ1 {
    /* renamed from: a */
    public static final int m1275a(String str, int i, int i2, int i3) {
        return (int) SystemPropsKt.systemProp(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m1274b(String str, long j, long j2, long j3) {
        String systemProp = SystemPropsKt.systemProp(str);
        if (systemProp == null) {
            return j;
        }
        Long longOrNull = AbstractC20032gN1.toLongOrNull(systemProp);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + j3 + ", but is '" + longValue + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + systemProp + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    /* renamed from: c */
    public static final String m1273c(String str, String str2) {
        String systemProp = SystemPropsKt.systemProp(str);
        if (systemProp != null) {
            return systemProp;
        }
        return str2;
    }

    /* renamed from: d */
    public static final boolean m1272d(String str, boolean z) {
        String systemProp = SystemPropsKt.systemProp(str);
        if (systemProp != null) {
            return Boolean.parseBoolean(systemProp);
        }
        return z;
    }

    /* renamed from: e */
    public static /* synthetic */ int m1271e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, i, i2, i3);
    }

    /* renamed from: f */
    public static /* synthetic */ long m1270f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, j, j4, j3);
    }
}
