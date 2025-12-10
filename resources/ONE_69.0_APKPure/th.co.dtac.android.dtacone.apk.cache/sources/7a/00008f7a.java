package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzjh {
    public static long zzb(zzjq zzjqVar) throws IOException {
        C23301yz2 c23301yz2 = new C23301yz2();
        try {
            zzjqVar.writeTo(c23301yz2);
            c23301yz2.close();
            return c23301yz2.f109232a;
        } catch (Throwable th2) {
            c23301yz2.close();
            throw th2;
        }
    }
}