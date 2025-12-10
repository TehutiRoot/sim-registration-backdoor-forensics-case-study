package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.F */
/* loaded from: classes3.dex */
public final class RunnableC6687F implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f48083a;

    /* renamed from: b */
    public final /* synthetic */ String f48084b;

    /* renamed from: c */
    public final /* synthetic */ zzq f48085c;

    /* renamed from: d */
    public final /* synthetic */ boolean f48086d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48087e;

    /* renamed from: f */
    public final /* synthetic */ zzjs f48088f;

    public RunnableC6687F(zzjs zzjsVar, String str, String str2, zzq zzqVar, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48088f = zzjsVar;
        this.f48083a = str;
        this.f48084b = str2;
        this.f48085c = zzqVar;
        this.f48086d = z;
        this.f48087e = zzcfVar;
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
                zzjs zzjsVar = this.f48088f;
                zzeeVar = zzjsVar.f48446c;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.f48083a, this.f48084b);
                    this.f48088f.zzs.zzv().zzR(this.f48087e, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.f48085c);
                List<zzlc> zzh = zzeeVar.zzh(this.f48083a, this.f48084b, this.f48086d, this.f48085c);
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
                    this.f48088f.m46215g();
                    this.f48088f.zzs.zzv().zzR(this.f48087e, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f48088f.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.f48083a, e);
                    this.f48088f.zzs.zzv().zzR(this.f48087e, bundle);
                }
            } catch (RemoteException e3) {
                bundle = bundle3;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                this.f48088f.zzs.zzv().zzR(this.f48087e, bundle3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bundle3 = bundle2;
            this.f48088f.zzs.zzv().zzR(this.f48087e, bundle3);
            throw th;
        }
    }
}