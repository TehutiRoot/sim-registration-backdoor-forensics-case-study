package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.W */
/* loaded from: classes3.dex */
public final class RunnableC6703W implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48132a;

    /* renamed from: b */
    public final /* synthetic */ String f48133b;

    /* renamed from: c */
    public final /* synthetic */ String f48134c;

    /* renamed from: d */
    public final /* synthetic */ zzq f48135d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48136e;

    public RunnableC6703W(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.f48136e = zzjsVar;
        this.f48132a = atomicReference;
        this.f48133b = str2;
        this.f48134c = str3;
        this.f48135d = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f48132a) {
            try {
                zzjsVar = this.f48136e;
                zzeeVar = zzjsVar.f48446c;
            } catch (RemoteException e) {
                this.f48136e.zzs.zzay().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.f48133b, e);
                this.f48132a.set(Collections.emptyList());
                atomicReference = this.f48132a;
            }
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.f48133b, this.f48134c);
                this.f48132a.set(Collections.emptyList());
                this.f48132a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.f48135d);
                this.f48132a.set(zzeeVar.zzf(this.f48133b, this.f48134c, this.f48135d));
            } else {
                this.f48132a.set(zzeeVar.zzg(null, this.f48133b, this.f48134c));
            }
            this.f48136e.m46215g();
            atomicReference = this.f48132a;
            atomicReference.notify();
        }
    }
}