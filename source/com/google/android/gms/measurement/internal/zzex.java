package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzex {

    /* renamed from: a */
    public final String f48315a;

    /* renamed from: b */
    public final boolean f48316b;

    /* renamed from: c */
    public boolean f48317c;

    /* renamed from: d */
    public boolean f48318d;

    /* renamed from: e */
    public final /* synthetic */ En2 f48319e;

    public zzex(En2 en2, String str, boolean z) {
        this.f48319e = en2;
        Preconditions.checkNotEmpty(str);
        this.f48315a = str;
        this.f48316b = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor edit = this.f48319e.m68457b().edit();
        edit.putBoolean(this.f48315a, z);
        edit.apply();
        this.f48318d = z;
    }

    @WorkerThread
    public final boolean zzb() {
        if (!this.f48317c) {
            this.f48317c = true;
            this.f48318d = this.f48319e.m68457b().getBoolean(this.f48315a, this.f48316b);
        }
        return this.f48318d;
    }
}
