package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzfb {

    /* renamed from: a */
    public final String f48329a;

    /* renamed from: b */
    public final String f48330b;

    /* renamed from: c */
    public final String f48331c;

    /* renamed from: d */
    public final long f48332d;

    /* renamed from: e */
    public final /* synthetic */ En2 f48333e;

    public /* synthetic */ zzfb(En2 en2, String str, long j, zzfa zzfaVar) {
        boolean z;
        this.f48333e = en2;
        Preconditions.checkNotEmpty("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f48329a = "health_monitor:start";
        this.f48330b = "health_monitor:count";
        this.f48331c = "health_monitor:value";
        this.f48332d = j;
    }

    /* renamed from: a */
    public final long m46313a() {
        return this.f48333e.m68457b().getLong(this.f48329a, 0L);
    }

    /* renamed from: b */
    public final void m46312b() {
        this.f48333e.zzg();
        long currentTimeMillis = this.f48333e.zzs.zzav().currentTimeMillis();
        SharedPreferences.Editor edit = this.f48333e.m68457b().edit();
        edit.remove(this.f48330b);
        edit.remove(this.f48331c);
        edit.putLong(this.f48329a, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
    public final Pair zza() {
        long abs;
        this.f48333e.zzg();
        this.f48333e.zzg();
        long m46313a = m46313a();
        if (m46313a == 0) {
            m46312b();
            abs = 0;
        } else {
            abs = Math.abs(m46313a - this.f48333e.zzs.zzav().currentTimeMillis());
        }
        long j = this.f48332d;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            m46312b();
            return null;
        }
        String string = this.f48333e.m68457b().getString(this.f48331c, null);
        long j2 = this.f48333e.m68457b().getLong(this.f48330b, 0L);
        m46312b();
        if (string != null && j2 > 0) {
            return new Pair(string, Long.valueOf(j2));
        }
        return En2.f1398w;
    }

    @WorkerThread
    public final void zzb(String str, long j) {
        this.f48333e.zzg();
        if (m46313a() == 0) {
            m46312b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f48333e.m68457b().getLong(this.f48330b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f48333e.m68457b().edit();
            edit.putString(this.f48331c, str);
            edit.putLong(this.f48330b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f48333e.zzs.zzv().m46106f().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f48333e.m68457b().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f48331c, str);
        }
        edit2.putLong(this.f48330b, j3);
        edit2.apply();
    }
}
