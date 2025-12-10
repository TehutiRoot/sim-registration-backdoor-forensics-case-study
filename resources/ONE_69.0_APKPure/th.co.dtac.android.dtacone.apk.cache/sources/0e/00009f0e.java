package com.google.android.gms.tagmanager;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzan extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.CONTAINS.toString();

    public zzan() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    public final boolean zzc(String str, String str2, Map map) {
        return str.contains(str2);
    }
}