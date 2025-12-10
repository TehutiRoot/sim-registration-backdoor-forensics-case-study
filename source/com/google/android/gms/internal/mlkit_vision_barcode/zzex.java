package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
final class zzex extends zzeu {
    final /* synthetic */ RunnableFutureC6539D zza;
    private final zzup zzb;

    public zzex(RunnableFutureC6539D runnableFutureC6539D, zzup zzupVar) {
        this.zza = runnableFutureC6539D;
        this.zzb = zzupVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final void zzc(Throwable th2) {
        this.zza.zzl(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final /* synthetic */ void zzd(Object obj) {
        this.zza.zzm(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final boolean zzf() {
        return this.zza.isDone();
    }
}
