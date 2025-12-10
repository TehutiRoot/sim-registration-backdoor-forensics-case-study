package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.Y */
/* loaded from: classes3.dex */
public final class RunnableC6705Y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48142a;

    /* renamed from: b */
    public final /* synthetic */ String f48143b;

    /* renamed from: c */
    public final /* synthetic */ String f48144c;

    /* renamed from: d */
    public final /* synthetic */ zzq f48145d;

    /* renamed from: e */
    public final /* synthetic */ boolean f48146e;

    /* renamed from: f */
    public final /* synthetic */ zzjs f48147f;

    public RunnableC6705Y(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.f48147f = zzjsVar;
        this.f48142a = atomicReference;
        this.f48143b = str2;
        this.f48144c = str3;
        this.f48145d = zzqVar;
        this.f48146e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f48142a) {
            try {
                zzjsVar = this.f48147f;
                zzeeVar = zzjsVar.f48446c;
            } catch (RemoteException e) {
                this.f48147f.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.f48143b, e);
                this.f48142a.set(Collections.emptyList());
                atomicReference = this.f48142a;
            }
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.f48143b, this.f48144c);
                this.f48142a.set(Collections.emptyList());
                this.f48142a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.f48145d);
                this.f48142a.set(zzeeVar.zzh(this.f48143b, this.f48144c, this.f48146e, this.f48145d));
            } else {
                this.f48142a.set(zzeeVar.zzi(null, this.f48143b, this.f48144c, this.f48146e));
            }
            this.f48147f.m46215g();
            atomicReference = this.f48142a;
            atomicReference.notify();
        }
    }
}