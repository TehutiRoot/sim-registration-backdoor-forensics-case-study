package p000;

import android.content.ComponentName;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzjs;

/* renamed from: vA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC22575vA2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f107601a;

    /* renamed from: b */
    public final /* synthetic */ zzjr f107602b;

    public RunnableC22575vA2(zzjr zzjrVar, ComponentName componentName) {
        this.f107602b = zzjrVar;
        this.f107601a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs.m46222o(this.f107602b.f48432c, this.f107601a);
    }
}
