package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes3.dex */
public final class C6717f implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f48174a;

    /* renamed from: b */
    public final /* synthetic */ zzfv f48175b;

    public C6717f(zzfv zzfvVar, String str) {
        this.f48175b = zzfvVar;
        Preconditions.checkNotNull(str);
        this.f48174a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f48175b.zzs.zzay().zzd().zzb(this.f48174a, th2);
    }
}