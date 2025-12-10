package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.W */
/* loaded from: classes3.dex */
public final class RunnableC6714W implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48120a;

    /* renamed from: b */
    public final /* synthetic */ String f48121b;

    /* renamed from: c */
    public final /* synthetic */ String f48122c;

    /* renamed from: d */
    public final /* synthetic */ zzq f48123d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48124e;

    public RunnableC6714W(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.f48124e = zzjsVar;
        this.f48120a = atomicReference;
        this.f48121b = str2;
        this.f48122c = str3;
        this.f48123d = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f48120a) {
            try {
                zzjsVar = this.f48124e;
                zzeeVar = zzjsVar.f48434c;
            } catch (RemoteException e) {
                this.f48124e.zzs.zzay().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.f48121b, e);
                this.f48120a.set(Collections.emptyList());
                atomicReference = this.f48120a;
            }
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.f48121b, this.f48122c);
                this.f48120a.set(Collections.emptyList());
                this.f48120a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.f48123d);
                this.f48120a.set(zzeeVar.zzf(this.f48121b, this.f48122c, this.f48123d));
            } else {
                this.f48120a.set(zzeeVar.zzg(null, this.f48121b, this.f48122c));
            }
            this.f48124e.m46230g();
            atomicReference = this.f48120a;
            atomicReference.notify();
        }
    }
}
