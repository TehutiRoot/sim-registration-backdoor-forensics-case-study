package com.google.android.gms.internal.vision;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzfc extends AbstractC21019lo2 {
    public static int zza(int i, int i2, int i3) {
        boolean z;
        if (i2 <= 1073741823) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.min(Math.max(i, i2), (int) LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        }
        throw new IllegalArgumentException(zzdg.zza("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), Integer.valueOf((int) LockFreeTaskQueueCore.MAX_CAPACITY_MASK)));
    }
}