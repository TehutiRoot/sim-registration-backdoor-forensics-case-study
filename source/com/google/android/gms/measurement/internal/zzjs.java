package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzjs extends AbstractC19410cn2 {

    /* renamed from: b */
    public final zzjr f48433b;

    /* renamed from: c */
    public zzee f48434c;

    /* renamed from: d */
    public volatile Boolean f48435d;

    /* renamed from: e */
    public final AbstractC20753kc2 f48436e;

    /* renamed from: f */
    public final DC2 f48437f;

    /* renamed from: g */
    public final List f48438g;

    /* renamed from: h */
    public final AbstractC20753kc2 f48439h;

    public zzjs(zzfy zzfyVar) {
        super(zzfyVar);
        this.f48438g = new ArrayList();
        this.f48437f = new DC2(zzfyVar.zzav());
        this.f48433b = new zzjr(this);
        this.f48436e = new C6707O(this, zzfyVar);
        this.f48439h = new C6709Q(this, zzfyVar);
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m46222o(zzjs zzjsVar, ComponentName componentName) {
        zzjsVar.zzg();
        if (zzjsVar.f48434c != null) {
            zzjsVar.f48434c = null;
            zzjsVar.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjsVar.zzg();
            zzjsVar.m46220q();
        }
    }

    /* renamed from: b */
    public final void m46235b(zzee zzeeVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i;
        zzg();
        zza();
        m46228i();
        this.zzs.zzf();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzs.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i = zzi.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzeeVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        this.zzs.zzay().zzd().zzb("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlc) {
                    try {
                        zzeeVar.zzt((zzlc) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.zzs.zzay().zzd().zzb("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzeeVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.zzs.zzay().zzd().zzb("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.zzs.zzay().zzd().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* renamed from: c */
    public final boolean m46234c() {
        zzg();
        zza();
        if (!m46233d() || this.zzs.zzv().zzm() >= ((Integer) zzeb.zzaf.zza(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m46233d() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjs.m46233d():boolean");
    }

    /* renamed from: e */
    public final zzq m46232e(boolean z) {
        Pair zza;
        this.zzs.zzaw();
        zzef zzh = this.zzs.zzh();
        String str = null;
        if (z) {
            zzeo zzay = this.zzs.zzay();
            if (zzay.zzs.zzm().f1400c != null && (zza = zzay.zzs.zzm().f1400c.zza()) != null && zza != En2.f1398w) {
                str = String.valueOf(zza.second) + ":" + ((String) zza.first);
            }
        }
        return zzh.m46329d(str);
    }

    /* renamed from: f */
    public final void m46231f() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.f48438g.size()));
        for (Runnable runnable : this.f48438g) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e);
            }
        }
        this.f48438g.clear();
        this.f48439h.m28909b();
    }

    /* renamed from: g */
    public final void m46230g() {
        zzg();
        this.f48437f.m68675b();
        AbstractC20753kc2 abstractC20753kc2 = this.f48436e;
        this.zzs.zzf();
        abstractC20753kc2.m28907d(((Long) zzeb.zzI.zza(null)).longValue());
    }

    /* renamed from: h */
    public final void m46229h(Runnable runnable) {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.f48438g.size();
        this.zzs.zzf();
        if (size >= 1000) {
            this.zzs.zzay().zzd().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f48438g.add(runnable);
        this.f48439h.m28907d(60000L);
        m46220q();
    }

    /* renamed from: i */
    public final boolean m46228i() {
        this.zzs.zzaw();
        return true;
    }

    /* renamed from: l */
    public final Boolean m46225l() {
        return this.f48435d;
    }

    /* renamed from: q */
    public final void m46220q() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (!m46233d()) {
            if (!this.zzs.zzf().m46353h()) {
                this.zzs.zzaw();
                List<ResolveInfo> queryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context zzau = this.zzs.zzau();
                    this.zzs.zzaw();
                    intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f48433b.zzb(intent);
                    return;
                }
                this.zzs.zzay().zzd().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        this.f48433b.zzc();
    }

    @WorkerThread
    public final void zzA(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        zzg();
        zza();
        m46228i();
        m46229h(new RunnableC6712U(this, true, m46232e(true), this.zzs.zzi().zzo(zzawVar), zzawVar, str));
    }

    @WorkerThread
    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            this.zzs.zzay().zzk().zza("Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzS(zzcfVar, new byte[0]);
            return;
        }
        m46229h(new RunnableC6708P(this, zzawVar, str, zzcfVar));
    }

    @WorkerThread
    public final void zzC() {
        zzg();
        zza();
        zzq m46232e = m46232e(false);
        m46228i();
        this.zzs.zzi().zzj();
        m46229h(new RunnableC6701I(this, m46232e));
    }

    @WorkerThread
    public final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzs.zzaw();
        m46229h(new RunnableC6713V(this, true, m46232e(true), this.zzs.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    @WorkerThread
    public final void zzF(boolean z) {
        zzg();
        zza();
        if (z) {
            m46228i();
            this.zzs.zzi().zzj();
        }
        if (m46234c()) {
            m46229h(new RunnableC6711T(this, m46232e(false)));
        }
    }

    @WorkerThread
    public final void zzG(zzik zzikVar) {
        zzg();
        zza();
        m46229h(new RunnableC6705M(this, zzikVar));
    }

    @WorkerThread
    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        m46229h(new RunnableC6706N(this, m46232e(false), bundle));
    }

    @WorkerThread
    public final void zzI() {
        zzg();
        zza();
        m46229h(new RunnableC6710S(this, m46232e(true)));
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzJ(zzee zzeeVar) {
        zzg();
        Preconditions.checkNotNull(zzeeVar);
        this.f48434c = zzeeVar;
        m46230g();
        m46231f();
    }

    @WorkerThread
    public final void zzK(zzlc zzlcVar) {
        zzg();
        zza();
        m46228i();
        m46229h(new RunnableC6699G(this, m46232e(true), this.zzs.zzi().zzp(zzlcVar), zzlcVar));
    }

    @WorkerThread
    public final boolean zzL() {
        zzg();
        zza();
        if (this.f48434c != null) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC19410cn2
    public final boolean zzf() {
        return false;
    }

    @WorkerThread
    public final void zzq() {
        zzg();
        zza();
        zzq m46232e = m46232e(true);
        this.zzs.zzi().zzk();
        m46229h(new RunnableC6704L(this, m46232e));
    }

    @WorkerThread
    public final void zzs() {
        zzg();
        zza();
        this.f48433b.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzau(), this.f48433b);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f48434c = null;
    }

    @WorkerThread
    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        m46229h(new RunnableC6703K(this, m46232e(false), zzcfVar));
    }

    @WorkerThread
    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        m46229h(new RunnableC6702J(this, atomicReference, m46232e(false)));
    }

    @WorkerThread
    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        m46229h(new RunnableC6715X(this, str, str2, m46232e(false), zzcfVar));
    }

    @WorkerThread
    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        m46229h(new RunnableC6714W(this, atomicReference, null, str2, str3, m46232e(false)));
    }

    @WorkerThread
    public final void zzx(AtomicReference atomicReference, boolean z) {
        zzg();
        zza();
        m46229h(new RunnableC6700H(this, atomicReference, m46232e(false), z));
    }

    @WorkerThread
    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z) {
        zzg();
        zza();
        m46229h(new RunnableC6698F(this, str, str2, m46232e(false), z, zzcfVar));
    }

    @WorkerThread
    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        zzg();
        zza();
        m46229h(new RunnableC6716Y(this, atomicReference, null, str2, str3, m46232e(false), z));
    }
}
