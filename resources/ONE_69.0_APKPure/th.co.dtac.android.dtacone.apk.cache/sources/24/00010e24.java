package p000;

import kotlin.jvm.internal.FloatCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: tJ */
/* loaded from: classes2.dex */
public abstract class AbstractC13974tJ {
    /* renamed from: a */
    public static final int m22708a(long j, long j2) {
        boolean m22705d = m22705d(j);
        if (m22705d != m22705d(j2)) {
            if (m22705d) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(m22706c(j) - m22706c(j2));
    }

    /* renamed from: c */
    public static final float m22706c(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: d */
    public static final boolean m22705d(long j) {
        if (((int) (j & BodyPartID.bodyIdMax)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static long m22707b(long j) {
        return j;
    }
}