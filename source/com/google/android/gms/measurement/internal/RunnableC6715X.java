package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.X */
/* loaded from: classes3.dex */
public final class RunnableC6715X implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f48125a;

    /* renamed from: b */
    public final /* synthetic */ String f48126b;

    /* renamed from: c */
    public final /* synthetic */ zzq f48127c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48128d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48129e;

    public RunnableC6715X(zzjs zzjsVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48129e = zzjsVar;
        this.f48125a = str;
        this.f48126b = str2;
        this.f48127c = zzqVar;
        this.f48128d = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjs zzjsVar = this.f48129e;
                zzeeVar = zzjsVar.f48434c;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.f48125a, this.f48126b);
                    zzfyVar = this.f48129e.zzs;
                } else {
                    Preconditions.checkNotNull(this.f48127c);
                    arrayList = zzlh.zzH(zzeeVar.zzf(this.f48125a, this.f48126b, this.f48127c));
                    this.f48129e.m46230g();
                    zzfyVar = this.f48129e.zzs;
                }
            } catch (RemoteException e) {
                this.f48129e.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.f48125a, this.f48126b, e);
                zzfyVar = this.f48129e.zzs;
            }
            zzfyVar.zzv().zzQ(this.f48128d, arrayList);
        } catch (Throwable th2) {
            this.f48129e.zzs.zzv().zzQ(this.f48128d, arrayList);
            throw th2;
        }
    }
}
