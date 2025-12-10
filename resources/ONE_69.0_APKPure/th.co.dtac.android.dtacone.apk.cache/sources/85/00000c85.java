package p000;

import com.google.android.gms.measurement.internal.zzki;

/* renamed from: NC2 */
/* loaded from: classes3.dex */
public final class NC2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f4100a;

    /* renamed from: b */
    public final /* synthetic */ zzki f4101b;

    public NC2(zzki zzkiVar, long j) {
        this.f4101b = zzkiVar;
        this.f4100a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki.m46195e(this.f4101b, this.f4100a);
    }
}