package com.google.android.gms.internal.mlkit_vision_face;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzcn extends AbstractC22555uh2 {
    public static int zza(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), (int) LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }
}