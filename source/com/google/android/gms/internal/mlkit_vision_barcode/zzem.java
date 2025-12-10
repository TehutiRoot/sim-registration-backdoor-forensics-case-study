package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzem extends AbstractC17808Il2 {
    public static zzev zza(Object obj) {
        return new C18192Ol2(obj);
    }

    public static void zzb(zzev zzevVar, zzek zzekVar, Executor executor) {
        zzevVar.zzj(new RunnableC21984rl2(zzevVar, zzekVar), executor);
    }

    public static zzev zzc(zzup zzupVar, Executor executor) {
        RunnableFutureC6539D runnableFutureC6539D = new RunnableFutureC6539D(zzupVar);
        runnableFutureC6539D.run();
        return runnableFutureC6539D;
    }
}
