package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Qh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18347Qh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f5285e;

    /* renamed from: f */
    public final /* synthetic */ zzee f5286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18347Qh2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f5286f = zzeeVar;
        this.f5285e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f5286f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setConsentThirdParty(this.f5285e, this.f46208a);
    }
}