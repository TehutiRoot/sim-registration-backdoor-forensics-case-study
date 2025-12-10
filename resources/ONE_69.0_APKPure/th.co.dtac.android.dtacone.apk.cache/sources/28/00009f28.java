package com.google.android.gms.tagmanager;

import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzbs extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.EVENT.toString();
    private final zzet zzb;

    public zzbs(zzet zzetVar) {
        super(zza, new String[0]);
        this.zzb = zzetVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzb = this.zzb.zzb();
        if (zzb == null) {
            return zzfu.zza();
        }
        return zzfu.zzb(zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}