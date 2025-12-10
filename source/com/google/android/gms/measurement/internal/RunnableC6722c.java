package com.google.android.gms.measurement.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes3.dex */
public final class RunnableC6722c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f48143a;

    /* renamed from: b */
    public final /* synthetic */ String f48144b;

    /* renamed from: c */
    public final /* synthetic */ Object f48145c;

    /* renamed from: d */
    public final /* synthetic */ Object f48146d;

    /* renamed from: e */
    public final /* synthetic */ Object f48147e;

    /* renamed from: f */
    public final /* synthetic */ zzeo f48148f;

    public RunnableC6722c(zzeo zzeoVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f48148f = zzeoVar;
        this.f48143a = i;
        this.f48144b = str;
        this.f48145c = obj;
        this.f48146d = obj2;
        this.f48147e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        En2 zzm = this.f48148f.zzs.zzm();
        if (zzm.m30739a()) {
            zzeo zzeoVar = this.f48148f;
            c = zzeoVar.f48303b;
            if (c == 0) {
                if (zzeoVar.zzs.zzf().zzy()) {
                    zzeo zzeoVar2 = this.f48148f;
                    zzeoVar2.zzs.zzaw();
                    zzeoVar2.f48303b = 'C';
                } else {
                    zzeo zzeoVar3 = this.f48148f;
                    zzeoVar3.zzs.zzaw();
                    zzeoVar3.f48303b = 'c';
                }
            }
            zzeo zzeoVar4 = this.f48148f;
            j = zzeoVar4.f48304c;
            if (j < 0) {
                zzeoVar4.zzs.zzf().zzh();
                zzeoVar4.f48304c = 73000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f48143a);
            zzeo zzeoVar5 = this.f48148f;
            c2 = zzeoVar5.f48303b;
            j2 = zzeoVar5.f48304c;
            String str = "2" + charAt + c2 + j2 + ":" + zzeo.m46318d(true, this.f48144b, this.f48145c, this.f48146d, this.f48147e);
            if (str.length() > 1024) {
                str = this.f48144b.substring(0, 1024);
            }
            zzfb zzfbVar = zzm.f1400c;
            if (zzfbVar != null) {
                zzfbVar.zzb(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f48148f.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}
