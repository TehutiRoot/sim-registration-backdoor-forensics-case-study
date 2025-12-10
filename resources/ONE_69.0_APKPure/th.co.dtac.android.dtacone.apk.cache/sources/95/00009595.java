package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.D */
/* loaded from: classes3.dex */
public final class RunnableFutureC6528D extends AbstractC6527C implements RunnableFuture {

    /* renamed from: h */
    public volatile zzeu f46531h;

    public RunnableFutureC6528D(zzup zzupVar) {
        this.f46531h = new zzex(this, zzupVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.f46531h;
        if (zzeuVar != null) {
            zzeuVar.run();
        }
        this.f46531h = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    public final String zze() {
        zzeu zzeuVar = this.f46531h;
        if (zzeuVar != null) {
            String obj = zzeuVar.toString();
            return "task=[" + obj + "]";
        }
        return super.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    public final void zzk() {
        zzeu zzeuVar;
        if (zzn() && (zzeuVar = this.f46531h) != null) {
            zzeuVar.zze();
        }
        this.f46531h = null;
    }
}