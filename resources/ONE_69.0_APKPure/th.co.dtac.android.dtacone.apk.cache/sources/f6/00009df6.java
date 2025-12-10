package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes3.dex */
public final class C6719g extends FutureTask implements Comparable {

    /* renamed from: a */
    public final long f48180a;

    /* renamed from: b */
    public final boolean f48181b;

    /* renamed from: c */
    public final String f48182c;

    /* renamed from: d */
    public final /* synthetic */ zzfv f48183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6719g(zzfv zzfvVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f48183d = zzfvVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzfv.f48365k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f48180a = andIncrement;
        this.f48182c = str;
        this.f48181b = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfvVar.zzs.zzay().zzd().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C6719g c6719g = (C6719g) obj;
        boolean z = this.f48181b;
        if (z != c6719g.f48181b) {
            if (z) {
                return -1;
            }
        } else {
            int i = (this.f48180a > c6719g.f48180a ? 1 : (this.f48180a == c6719g.f48180a ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i <= 0) {
                this.f48183d.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.f48180a));
                return 0;
            }
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        this.f48183d.zzs.zzay().zzd().zzb(this.f48182c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6719g(zzfv zzfvVar, Callable callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f48183d = zzfvVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzfv.f48365k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f48180a = andIncrement;
        this.f48182c = "Task exception on worker thread";
        this.f48181b = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfvVar.zzs.zzay().zzd().zza("Tasks index overflow");
        }
    }
}