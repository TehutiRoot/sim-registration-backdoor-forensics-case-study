package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzez {

    /* renamed from: a */
    public final String f48324a;

    /* renamed from: b */
    public final long f48325b;

    /* renamed from: c */
    public boolean f48326c;

    /* renamed from: d */
    public long f48327d;

    /* renamed from: e */
    public final /* synthetic */ En2 f48328e;

    public zzez(En2 en2, String str, long j) {
        this.f48328e = en2;
        Preconditions.checkNotEmpty(str);
        this.f48324a = str;
        this.f48325b = j;
    }

    @WorkerThread
    public final long zza() {
        if (!this.f48326c) {
            this.f48326c = true;
            this.f48327d = this.f48328e.m68457b().getLong(this.f48324a, this.f48325b);
        }
        return this.f48327d;
    }

    @WorkerThread
    public final void zzb(long j) {
        SharedPreferences.Editor edit = this.f48328e.m68457b().edit();
        edit.putLong(this.f48324a, j);
        edit.apply();
        this.f48327d = j;
    }
}
