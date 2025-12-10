package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.F */
/* loaded from: classes3.dex */
public final class RunnableC6698F implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f48071a;

    /* renamed from: b */
    public final /* synthetic */ String f48072b;

    /* renamed from: c */
    public final /* synthetic */ zzq f48073c;

    /* renamed from: d */
    public final /* synthetic */ boolean f48074d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48075e;

    /* renamed from: f */
    public final /* synthetic */ zzjs f48076f;

    public RunnableC6698F(zzjs zzjsVar, String str, String str2, zzq zzqVar, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48076f = zzjsVar;
        this.f48071a = str;
        this.f48072b = str2;
        this.f48073c = zzqVar;
        this.f48074d = z;
        this.f48075e = zzcfVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:35:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2;
        zzee zzeeVar;
        Bundle bundle3 = new Bundle();
        try {
            try {
                zzjs zzjsVar = this.f48076f;
                zzeeVar = zzjsVar.f48434c;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.f48071a, this.f48072b);
                    this.f48076f.zzs.zzv().zzR(this.f48075e, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.f48073c);
                List<zzlc> zzh = zzeeVar.zzh(this.f48071a, this.f48072b, this.f48074d, this.f48073c);
                bundle = new Bundle();
                if (zzh != null) {
                    for (zzlc zzlcVar : zzh) {
                        String str = zzlcVar.zze;
                        if (str != null) {
                            bundle.putString(zzlcVar.zzb, str);
                        } else {
                            Long l = zzlcVar.zzd;
                            if (l != null) {
                                bundle.putLong(zzlcVar.zzb, l.longValue());
                            } else {
                                Double d = zzlcVar.zzg;
                                if (d != null) {
                                    bundle.putDouble(zzlcVar.zzb, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f48076f.m46230g();
                    this.f48076f.zzs.zzv().zzR(this.f48075e, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f48076f.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.f48071a, e);
                    this.f48076f.zzs.zzv().zzR(this.f48075e, bundle);
                }
            } catch (RemoteException e3) {
                bundle = bundle3;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                this.f48076f.zzs.zzv().zzR(this.f48075e, bundle3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bundle3 = bundle2;
            this.f48076f.zzs.zzv().zzR(this.f48075e, bundle3);
            throw th;
        }
    }
}
