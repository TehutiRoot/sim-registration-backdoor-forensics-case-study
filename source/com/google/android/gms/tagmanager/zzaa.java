package com.google.android.gms.tagmanager;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaa implements zzx {
    final /* synthetic */ zzak zza;

    public zzaa(zzak zzakVar) {
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.tagmanager.zzx
    public final String zza() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.tagmanager.zzx
    public final void zzb() {
        Log.w("GoogleTagManager", "Refresh ignored: container loaded as default only.");
    }

    @Override // com.google.android.gms.tagmanager.zzx
    public final void zzc(String str) {
        this.zza.zzo(str);
    }
}
