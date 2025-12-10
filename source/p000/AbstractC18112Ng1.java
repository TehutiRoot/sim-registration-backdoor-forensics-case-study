package p000;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Ng1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18112Ng1 {
    /* renamed from: a */
    public static void m67202a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
