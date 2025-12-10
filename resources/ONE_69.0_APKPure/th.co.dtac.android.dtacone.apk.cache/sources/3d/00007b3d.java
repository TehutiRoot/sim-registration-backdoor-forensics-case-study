package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzer;
import java.util.Map;

/* renamed from: cn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC19459cn2 implements Runnable {

    /* renamed from: a */
    public final InterfaceC18492Sm2 f40227a;

    /* renamed from: b */
    public final int f40228b;

    /* renamed from: c */
    public final Throwable f40229c;

    /* renamed from: d */
    public final byte[] f40230d;

    /* renamed from: e */
    public final String f40231e;

    /* renamed from: f */
    public final Map f40232f;

    public /* synthetic */ RunnableC19459cn2(String str, InterfaceC18492Sm2 interfaceC18492Sm2, int i, Throwable th2, byte[] bArr, Map map, zzer zzerVar) {
        Preconditions.checkNotNull(interfaceC18492Sm2);
        this.f40227a = interfaceC18492Sm2;
        this.f40228b = i;
        this.f40229c = th2;
        this.f40230d = bArr;
        this.f40231e = str;
        this.f40232f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40227a.mo51716a(this.f40231e, this.f40228b, this.f40229c, this.f40230d, this.f40232f);
    }
}