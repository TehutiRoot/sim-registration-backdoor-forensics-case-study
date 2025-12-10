package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.X */
/* loaded from: classes3.dex */
public final class RunnableC6704X implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f48137a;

    /* renamed from: b */
    public final /* synthetic */ String f48138b;

    /* renamed from: c */
    public final /* synthetic */ zzq f48139c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48140d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48141e;

    public RunnableC6704X(zzjs zzjsVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48141e = zzjsVar;
        this.f48137a = str;
        this.f48138b = str2;
        this.f48139c = zzqVar;
        this.f48140d = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjs zzjsVar = this.f48141e;
                zzeeVar = zzjsVar.f48446c;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.f48137a, this.f48138b);
                    zzfyVar = this.f48141e.zzs;
                } else {
                    Preconditions.checkNotNull(this.f48139c);
                    arrayList = zzlh.zzH(zzeeVar.zzf(this.f48137a, this.f48138b, this.f48139c));
                    this.f48141e.m46215g();
                    zzfyVar = this.f48141e.zzs;
                }
            } catch (RemoteException e) {
                this.f48141e.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.f48137a, this.f48138b, e);
                zzfyVar = this.f48141e.zzs;
            }
            zzfyVar.zzv().zzQ(this.f48140d, arrayList);
        } catch (Throwable th2) {
            this.f48141e.zzs.zzv().zzQ(this.f48140d, arrayList);
            throw th2;
        }
    }
}