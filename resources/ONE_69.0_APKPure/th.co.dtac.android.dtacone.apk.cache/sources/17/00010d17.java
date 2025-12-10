package p000;

import android.content.ComponentName;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzjs;

/* renamed from: sB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC22126sB2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f79817a;

    /* renamed from: b */
    public final /* synthetic */ zzjr f79818b;

    public RunnableC22126sB2(zzjr zzjrVar, ComponentName componentName) {
        this.f79818b = zzjrVar;
        this.f79817a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs.m46207o(this.f79818b.f48444c, this.f79817a);
    }
}