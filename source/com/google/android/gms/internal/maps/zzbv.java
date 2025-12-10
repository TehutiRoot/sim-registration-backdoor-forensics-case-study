package com.google.android.gms.internal.maps;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzbv {
    /* renamed from: a */
    public static int m47407a(Set set) {
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
