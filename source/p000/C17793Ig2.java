package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Ig2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17793Ig2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Activity f2571e;

    /* renamed from: f */
    public final /* synthetic */ String f2572f;

    /* renamed from: g */
    public final /* synthetic */ String f2573g;

    /* renamed from: h */
    public final /* synthetic */ zzee f2574h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17793Ig2(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.f2574h = zzeeVar;
        this.f2571e = activity;
        this.f2572f = str;
        this.f2573g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f2574h.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setCurrentScreen(ObjectWrapper.wrap(this.f2571e), this.f2572f, this.f2573g, this.f46196a);
    }
}
