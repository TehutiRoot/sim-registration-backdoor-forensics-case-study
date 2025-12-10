package com.google.android.gms.tagmanager;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdd extends zzdq {
    private static final String zza = com.google.android.gms.internal.gtm.zza.LESS_THAN.toString();

    public zzdd() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzdq
    public final boolean zzc(zzft zzftVar, zzft zzftVar2, Map map) {
        if (zzftVar.compareTo(zzftVar2) < 0) {
            return true;
        }
        return false;
    }
}