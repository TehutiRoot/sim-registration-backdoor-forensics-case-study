package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: vh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22728vh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f108180e;

    /* renamed from: f */
    public final /* synthetic */ String f108181f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f108182g;

    /* renamed from: h */
    public final /* synthetic */ zzee f108183h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22728vh2(zzee zzeeVar, String str, String str2, Bundle bundle) {
        super(zzeeVar, true);
        this.f108183h = zzeeVar;
        this.f108180e = str;
        this.f108181f = str2;
        this.f108182g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f108183h.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).clearConditionalUserProperty(this.f108180e, this.f108181f, this.f108182g);
    }
}