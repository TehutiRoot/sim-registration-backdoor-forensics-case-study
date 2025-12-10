package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: qh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21863qh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f77276e;

    /* renamed from: f */
    public final /* synthetic */ zzee f77277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21863qh2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f77277f = zzeeVar;
        this.f77276e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f77277f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setConditionalUserProperty(this.f77276e, this.f46208a);
    }
}