package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzaa {
    /* renamed from: a */
    public static int m46829a(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
