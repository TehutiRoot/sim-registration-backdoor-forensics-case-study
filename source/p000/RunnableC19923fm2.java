package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzer;
import java.util.Map;

/* renamed from: fm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC19923fm2 implements Runnable {

    /* renamed from: a */
    public final InterfaceC18640Vl2 f61920a;

    /* renamed from: b */
    public final int f61921b;

    /* renamed from: c */
    public final Throwable f61922c;

    /* renamed from: d */
    public final byte[] f61923d;

    /* renamed from: e */
    public final String f61924e;

    /* renamed from: f */
    public final Map f61925f;

    public /* synthetic */ RunnableC19923fm2(String str, InterfaceC18640Vl2 interfaceC18640Vl2, int i, Throwable th2, byte[] bArr, Map map, zzer zzerVar) {
        Preconditions.checkNotNull(interfaceC18640Vl2);
        this.f61920a = interfaceC18640Vl2;
        this.f61921b = i;
        this.f61922c = th2;
        this.f61923d = bArr;
        this.f61924e = str;
        this.f61925f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61920a.mo31343a(this.f61924e, this.f61921b, this.f61922c, this.f61923d, this.f61925f);
    }
}
