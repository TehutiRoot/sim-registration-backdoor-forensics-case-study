package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Lh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18022Lh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f3662e;

    /* renamed from: f */
    public final /* synthetic */ zzee f3663f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18022Lh2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f3663f = zzeeVar;
        this.f3662e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f3663f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setConsent(this.f3662e, this.f46208a);
    }
}