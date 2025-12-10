package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public abstract class zzbu extends zzbt {
    private boolean zza;

    public zzbu(zzbx zzbxVar) {
        super(zzbxVar);
    }

    public final void zzV() {
        if (zzX()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzW() {
        zzd();
        this.zza = true;
    }

    public final boolean zzX() {
        return this.zza;
    }

    public abstract void zzd();
}