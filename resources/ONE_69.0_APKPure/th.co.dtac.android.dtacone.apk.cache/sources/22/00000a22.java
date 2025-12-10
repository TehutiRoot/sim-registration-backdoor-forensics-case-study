package p000;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Kh1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17956Kh1 {
    /* renamed from: a */
    public static void m67689a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}