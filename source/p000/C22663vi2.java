package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: vi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22663vi2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f107757e;

    /* renamed from: f */
    public final /* synthetic */ zzbz f107758f;

    /* renamed from: g */
    public final /* synthetic */ zzee f107759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22663vi2(zzee zzeeVar, Bundle bundle, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f107759g = zzeeVar;
        this.f107757e = bundle;
        this.f107758f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f107759g.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).performAction(this.f107757e, this.f107758f, this.f46196a);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f107758f.zzd(null);
    }
}
