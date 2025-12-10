package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: yg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23173yg2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f108813e;

    /* renamed from: f */
    public final /* synthetic */ String f108814f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f108815g;

    /* renamed from: h */
    public final /* synthetic */ zzee f108816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23173yg2(zzee zzeeVar, String str, String str2, Bundle bundle) {
        super(zzeeVar, true);
        this.f108816h = zzeeVar;
        this.f108813e = str;
        this.f108814f = str2;
        this.f108815g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f108816h.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).clearConditionalUserProperty(this.f108813e, this.f108814f, this.f108815g);
    }
}
