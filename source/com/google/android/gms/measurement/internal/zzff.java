package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;

/* loaded from: classes3.dex */
public final class zzff implements ServiceConnection {

    /* renamed from: a */
    public final String f48338a;

    /* renamed from: b */
    public final /* synthetic */ zzfg f48339b;

    public zzff(zzfg zzfgVar, String str) {
        this.f48339b = zzfgVar;
        this.f48338a = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.f48339b.f48340a.zzay().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.f48339b.f48340a.zzay().zzj().zza("Install Referrer Service connected");
                this.f48339b.f48340a.zzaz().zzp(new Kn2(this, zzb, this));
                return;
            } catch (RuntimeException e) {
                this.f48339b.f48340a.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        this.f48339b.f48340a.zzay().zzk().zza("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f48339b.f48340a.zzay().zzj().zza("Install Referrer Service disconnected");
    }
}
