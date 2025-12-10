package p000;

import com.google.android.gms.measurement.internal.zzid;

/* renamed from: nv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21386nv2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f72628a;

    /* renamed from: b */
    public final /* synthetic */ String f72629b;

    /* renamed from: c */
    public final /* synthetic */ Object f72630c;

    /* renamed from: d */
    public final /* synthetic */ long f72631d;

    /* renamed from: e */
    public final /* synthetic */ zzid f72632e;

    public RunnableC21386nv2(zzid zzidVar, String str, String str2, Object obj, long j) {
        this.f72632e = zzidVar;
        this.f72628a = str;
        this.f72629b = str2;
        this.f72630c = obj;
        this.f72631d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72632e.m46238i(this.f72628a, this.f72629b, this.f72630c, this.f72631d);
    }
}