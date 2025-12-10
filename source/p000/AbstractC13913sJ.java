package p000;

import kotlin.jvm.internal.FloatCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: sJ */
/* loaded from: classes2.dex */
public abstract class AbstractC13913sJ {
    /* renamed from: a */
    public static final int m22642a(long j, long j2) {
        boolean m22639d = m22639d(j);
        if (m22639d != m22639d(j2)) {
            if (m22639d) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(m22640c(j) - m22640c(j2));
    }

    /* renamed from: c */
    public static final float m22640c(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: d */
    public static final boolean m22639d(long j) {
        if (((int) (j & BodyPartID.bodyIdMax)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static long m22641b(long j) {
        return j;
    }
}
