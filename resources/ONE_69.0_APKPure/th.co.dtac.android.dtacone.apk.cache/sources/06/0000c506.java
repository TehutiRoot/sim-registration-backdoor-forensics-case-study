package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: di2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19617di2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f61342e;

    /* renamed from: f */
    public final /* synthetic */ zzee f61343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19617di2(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f61343f = zzeeVar;
        this.f61342e = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f61343f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).beginAdUnitExposure(this.f61342e, this.f46209b);
    }
}