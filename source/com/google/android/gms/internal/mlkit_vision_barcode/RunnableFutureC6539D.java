package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.D */
/* loaded from: classes3.dex */
public final class RunnableFutureC6539D extends AbstractC6538C implements RunnableFuture {

    /* renamed from: h */
    public volatile zzeu f46519h;

    public RunnableFutureC6539D(zzup zzupVar) {
        this.f46519h = new zzex(this, zzupVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.f46519h;
        if (zzeuVar != null) {
            zzeuVar.run();
        }
        this.f46519h = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    public final String zze() {
        zzeu zzeuVar = this.f46519h;
        if (zzeuVar != null) {
            String obj = zzeuVar.toString();
            return "task=[" + obj + "]";
        }
        return super.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    public final void zzk() {
        zzeu zzeuVar;
        if (zzn() && (zzeuVar = this.f46519h) != null) {
            zzeuVar.zze();
        }
        this.f46519h = null;
    }
}
