package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: sj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22215sj2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f79970e;

    /* renamed from: f */
    public final /* synthetic */ zzbz f79971f;

    /* renamed from: g */
    public final /* synthetic */ zzee f79972g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22215sj2(zzee zzeeVar, Bundle bundle, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f79972g = zzeeVar;
        this.f79970e = bundle;
        this.f79971f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f79972g.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).performAction(this.f79970e, this.f79971f, this.f46208a);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f79971f.zzd(null);
    }
}