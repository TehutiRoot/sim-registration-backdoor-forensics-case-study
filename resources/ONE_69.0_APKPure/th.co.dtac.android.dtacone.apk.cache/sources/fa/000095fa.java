package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzem extends AbstractC17647Fm2 {
    public static zzev zza(Object obj) {
        return new C18037Lm2(obj);
    }

    public static void zzb(zzev zzevVar, zzek zzekVar, Executor executor) {
        zzevVar.zzj(new RunnableC21532om2(zzevVar, zzekVar), executor);
    }

    public static zzev zzc(zzup zzupVar, Executor executor) {
        RunnableFutureC6528D runnableFutureC6528D = new RunnableFutureC6528D(zzupVar);
        runnableFutureC6528D.run();
        return runnableFutureC6528D;
    }
}