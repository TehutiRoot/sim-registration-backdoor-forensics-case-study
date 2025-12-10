package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.Y */
/* loaded from: classes3.dex */
public final class RunnableC6716Y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48130a;

    /* renamed from: b */
    public final /* synthetic */ String f48131b;

    /* renamed from: c */
    public final /* synthetic */ String f48132c;

    /* renamed from: d */
    public final /* synthetic */ zzq f48133d;

    /* renamed from: e */
    public final /* synthetic */ boolean f48134e;

    /* renamed from: f */
    public final /* synthetic */ zzjs f48135f;

    public RunnableC6716Y(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.f48135f = zzjsVar;
        this.f48130a = atomicReference;
        this.f48131b = str2;
        this.f48132c = str3;
        this.f48133d = zzqVar;
        this.f48134e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f48130a) {
            try {
                zzjsVar = this.f48135f;
                zzeeVar = zzjsVar.f48434c;
            } catch (RemoteException e) {
                this.f48135f.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.f48131b, e);
                this.f48130a.set(Collections.emptyList());
                atomicReference = this.f48130a;
            }
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.f48131b, this.f48132c);
                this.f48130a.set(Collections.emptyList());
                this.f48130a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.f48133d);
                this.f48130a.set(zzeeVar.zzh(this.f48131b, this.f48132c, this.f48134e, this.f48133d));
            } else {
                this.f48130a.set(zzeeVar.zzi(null, this.f48131b, this.f48132c, this.f48134e));
            }
            this.f48135f.m46230g();
            atomicReference = this.f48130a;
            atomicReference.notify();
        }
    }
}
