package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Bh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17372Bh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f470e;

    /* renamed from: f */
    public final /* synthetic */ zzee f471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17372Bh2(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f471f = zzeeVar;
        this.f470e = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f471f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setUserId(this.f470e, this.f46208a);
    }
}