package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Tg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18497Tg2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f6074e;

    /* renamed from: f */
    public final /* synthetic */ zzee f6075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18497Tg2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f6075f = zzeeVar;
        this.f6074e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f6075f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setConsentThirdParty(this.f6074e, this.f46196a);
    }
}
