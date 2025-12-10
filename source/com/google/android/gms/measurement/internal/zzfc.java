package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzfc {

    /* renamed from: a */
    public final String f48334a;

    /* renamed from: b */
    public boolean f48335b;

    /* renamed from: c */
    public String f48336c;

    /* renamed from: d */
    public final /* synthetic */ En2 f48337d;

    public zzfc(En2 en2, String str, String str2) {
        this.f48337d = en2;
        Preconditions.checkNotEmpty(str);
        this.f48334a = str;
    }

    @WorkerThread
    public final String zza() {
        if (!this.f48335b) {
            this.f48335b = true;
            this.f48336c = this.f48337d.m68457b().getString(this.f48334a, null);
        }
        return this.f48336c;
    }

    @WorkerThread
    public final void zzb(String str) {
        SharedPreferences.Editor edit = this.f48337d.m68457b().edit();
        edit.putString(this.f48334a, str);
        edit.apply();
        this.f48336c = str;
    }
}
