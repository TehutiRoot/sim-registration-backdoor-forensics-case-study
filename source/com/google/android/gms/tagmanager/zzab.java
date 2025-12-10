package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzab {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzak zzb;
    private Long zzc;

    public zzab(zzak zzakVar, boolean z) {
        this.zzb = zzakVar;
        this.zza = z;
    }

    public final boolean zza(Container container) {
        Clock clock;
        zzal zzalVar;
        if (this.zza) {
            long lastRefreshTime = container.getLastRefreshTime();
            if (this.zzc == null) {
                zzalVar = this.zzb.zzi;
                this.zzc = Long.valueOf(zzalVar.zza());
            }
            clock = this.zzb.zza;
            if (lastRefreshTime + this.zzc.longValue() < clock.currentTimeMillis()) {
                return false;
            }
            return true;
        } else if (container.isDefault()) {
            return false;
        } else {
            return true;
        }
    }
}
