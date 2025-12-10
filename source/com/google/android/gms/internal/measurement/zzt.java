package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzt extends zzai {

    /* renamed from: a */
    public final zzr f46386a;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.f46386a = zzrVar;
        this.zze.put("log", new C21914rJ2(this, false, true));
        this.zze.put(NotificationCompat.GROUP_KEY_SILENT, new CI2(this, NotificationCompat.GROUP_KEY_SILENT));
        ((zzai) this.zze.get(NotificationCompat.GROUP_KEY_SILENT)).zzr("log", new C21914rJ2(this, true, true));
        this.zze.put("unmonitored", new MI2(this, "unmonitored"));
        ((zzai) this.zze.get("unmonitored")).zzr("log", new C21914rJ2(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.zzf;
    }
}
