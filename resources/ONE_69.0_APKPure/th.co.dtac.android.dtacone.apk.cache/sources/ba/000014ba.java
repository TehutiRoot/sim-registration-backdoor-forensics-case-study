package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Vj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18678Vj2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f7068e;

    /* renamed from: f */
    public final /* synthetic */ zzee f7069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18678Vj2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f7069f = zzeeVar;
        this.f7068e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f7069f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setDefaultEventParameters(this.f7068e);
    }
}