package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzid;

/* renamed from: fv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20002fv2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f62005a;

    /* renamed from: b */
    public final /* synthetic */ String f62006b;

    /* renamed from: c */
    public final /* synthetic */ long f62007c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f62008d;

    /* renamed from: e */
    public final /* synthetic */ boolean f62009e;

    /* renamed from: f */
    public final /* synthetic */ boolean f62010f;

    /* renamed from: g */
    public final /* synthetic */ boolean f62011g;

    /* renamed from: h */
    public final /* synthetic */ String f62012h;

    /* renamed from: i */
    public final /* synthetic */ zzid f62013i;

    public RunnableC20002fv2(zzid zzidVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f62013i = zzidVar;
        this.f62005a = str;
        this.f62006b = str2;
        this.f62007c = j;
        this.f62008d = bundle;
        this.f62009e = z;
        this.f62010f = z2;
        this.f62011g = z3;
        this.f62012h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f62013i.zzI(this.f62005a, this.f62006b, this.f62007c, this.f62008d, this.f62009e, this.f62010f, this.f62011g, this.f62012h);
    }
}