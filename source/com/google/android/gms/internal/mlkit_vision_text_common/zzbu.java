package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzbu {
    public static List zza(List list, zzu zzuVar) {
        if (list instanceof RandomAccess) {
            return new zzbr(list, zzuVar);
        }
        return new zzbt(list, zzuVar);
    }
}
