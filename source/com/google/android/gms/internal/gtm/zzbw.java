package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbw implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbx zza;

    public zzbw(zzbx zzbxVar) {
        this.zza = zzbxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        zzfd zzn = this.zza.zzn();
        if (zzn != null) {
            zzn.zzJ("Job execution failed", th2);
        }
    }
}
