package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes3.dex */
public final class C6728f implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f48162a;

    /* renamed from: b */
    public final /* synthetic */ zzfv f48163b;

    public C6728f(zzfv zzfvVar, String str) {
        this.f48163b = zzfvVar;
        Preconditions.checkNotNull(str);
        this.f48162a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f48163b.zzs.zzay().zzd().zzb(this.f48162a, th2);
    }
}
