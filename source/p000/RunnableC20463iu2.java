package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzid;

/* renamed from: iu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20463iu2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f67098a;

    /* renamed from: b */
    public final /* synthetic */ String f67099b;

    /* renamed from: c */
    public final /* synthetic */ long f67100c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f67101d;

    /* renamed from: e */
    public final /* synthetic */ boolean f67102e;

    /* renamed from: f */
    public final /* synthetic */ boolean f67103f;

    /* renamed from: g */
    public final /* synthetic */ boolean f67104g;

    /* renamed from: h */
    public final /* synthetic */ String f67105h;

    /* renamed from: i */
    public final /* synthetic */ zzid f67106i;

    public RunnableC20463iu2(zzid zzidVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f67106i = zzidVar;
        this.f67098a = str;
        this.f67099b = str2;
        this.f67100c = j;
        this.f67101d = bundle;
        this.f67102e = z;
        this.f67103f = z2;
        this.f67104g = z3;
        this.f67105h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67106i.zzI(this.f67098a, this.f67099b, this.f67100c, this.f67101d, this.f67102e, this.f67103f, this.f67104g, this.f67105h);
    }
}
