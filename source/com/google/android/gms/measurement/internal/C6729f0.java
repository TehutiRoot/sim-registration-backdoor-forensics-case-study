package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.measurement.zzoe;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.gms.measurement.internal.f0 */
/* loaded from: classes3.dex */
public final class C6729f0 {

    /* renamed from: a */
    public long f48164a;

    /* renamed from: b */
    public long f48165b;

    /* renamed from: c */
    public final AbstractC20753kc2 f48166c;

    /* renamed from: d */
    public final /* synthetic */ zzki f48167d;

    public C6729f0(zzki zzkiVar) {
        this.f48167d = zzkiVar;
        this.f48166c = new C6727e0(this, zzkiVar.zzs);
        long elapsedRealtime = zzkiVar.zzs.zzav().elapsedRealtime();
        this.f48164a = elapsedRealtime;
        this.f48165b = elapsedRealtime;
    }

    /* renamed from: a */
    public final void m46376a() {
        this.f48166c.m28909b();
        this.f48164a = 0L;
        this.f48165b = 0L;
    }

    /* renamed from: b */
    public final void m46375b(long j) {
        this.f48166c.m28909b();
    }

    /* renamed from: c */
    public final void m46374c(long j) {
        this.f48167d.zzg();
        this.f48166c.m28909b();
        this.f48164a = j;
        this.f48165b = j;
    }

    /* renamed from: d */
    public final boolean m46373d(boolean z, boolean z2, long j) {
        this.f48167d.zzg();
        this.f48167d.zza();
        zzoe.zzc();
        if (this.f48167d.zzs.zzf().zzs(null, zzeb.zzad)) {
            if (this.f48167d.zzs.zzJ()) {
                this.f48167d.zzs.zzm().f1411n.zzb(this.f48167d.zzs.zzav().currentTimeMillis());
            }
        } else {
            this.f48167d.zzs.zzm().f1411n.zzb(this.f48167d.zzs.zzav().currentTimeMillis());
        }
        long j2 = j - this.f48164a;
        if (!z && j2 < 1000) {
            this.f48167d.zzs.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f48165b;
            this.f48165b = j;
        }
        this.f48167d.zzs.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzlh.zzK(this.f48167d.zzs.zzs().zzj(!this.f48167d.zzs.zzf().zzu()), bundle, true);
        if (!z2) {
            this.f48167d.zzs.zzq().m46259c(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.f48164a = j;
        this.f48166c.m28909b();
        this.f48166c.m28907d(CoreConstants.MILLIS_IN_ONE_HOUR);
        return true;
    }
}
