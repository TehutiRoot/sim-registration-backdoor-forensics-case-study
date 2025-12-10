package com.google.android.gms.measurement.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes3.dex */
public final class RunnableC6711c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f48155a;

    /* renamed from: b */
    public final /* synthetic */ String f48156b;

    /* renamed from: c */
    public final /* synthetic */ Object f48157c;

    /* renamed from: d */
    public final /* synthetic */ Object f48158d;

    /* renamed from: e */
    public final /* synthetic */ Object f48159e;

    /* renamed from: f */
    public final /* synthetic */ zzeo f48160f;

    public RunnableC6711c(zzeo zzeoVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f48160f = zzeoVar;
        this.f48155a = i;
        this.f48156b = str;
        this.f48157c = obj;
        this.f48158d = obj2;
        this.f48159e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        Bo2 zzm = this.f48160f.zzs.zzm();
        if (zzm.m31583a()) {
            zzeo zzeoVar = this.f48160f;
            c = zzeoVar.f48315b;
            if (c == 0) {
                if (zzeoVar.zzs.zzf().zzy()) {
                    zzeo zzeoVar2 = this.f48160f;
                    zzeoVar2.zzs.zzaw();
                    zzeoVar2.f48315b = 'C';
                } else {
                    zzeo zzeoVar3 = this.f48160f;
                    zzeoVar3.zzs.zzaw();
                    zzeoVar3.f48315b = 'c';
                }
            }
            zzeo zzeoVar4 = this.f48160f;
            j = zzeoVar4.f48316c;
            if (j < 0) {
                zzeoVar4.zzs.zzf().zzh();
                zzeoVar4.f48316c = 73000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f48155a);
            zzeo zzeoVar5 = this.f48160f;
            c2 = zzeoVar5.f48315b;
            j2 = zzeoVar5.f48316c;
            String str = "2" + charAt + c2 + j2 + ":" + zzeo.m46303d(true, this.f48156b, this.f48157c, this.f48158d, this.f48159e);
            if (str.length() > 1024) {
                str = this.f48156b.substring(0, 1024);
            }
            zzfb zzfbVar = zzm.f518c;
            if (zzfbVar != null) {
                zzfbVar.zzb(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f48160f.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}