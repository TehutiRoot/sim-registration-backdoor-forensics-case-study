package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: gi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20136gi2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f62251e;

    /* renamed from: f */
    public final /* synthetic */ zzee f62252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20136gi2(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f62252f = zzeeVar;
        this.f62251e = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f62252f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).endAdUnitExposure(this.f62251e, this.f46209b);
    }
}