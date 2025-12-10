package p000;

import com.google.android.gms.measurement.internal.zzki;

/* renamed from: UC2 */
/* loaded from: classes3.dex */
public final class UC2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f6568a;

    /* renamed from: b */
    public final /* synthetic */ zzki f6569b;

    public UC2(zzki zzkiVar, long j) {
        this.f6569b = zzkiVar;
        this.f6568a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki.m46196d(this.f6569b, this.f6568a);
    }
}