package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzjh {
    public static long zzb(zzjq zzjqVar) throws IOException {
        By2 by2 = new By2();
        try {
            zzjqVar.writeTo(by2);
            by2.close();
            return by2.f576a;
        } catch (Throwable th2) {
            by2.close();
            throw th2;
        }
    }
}
