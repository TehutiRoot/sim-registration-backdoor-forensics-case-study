package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Xi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18805Xi2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f7636e;

    /* renamed from: f */
    public final /* synthetic */ zzee f7637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18805Xi2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f7637f = zzeeVar;
        this.f7636e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f7637f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getCurrentScreenName(this.f7636e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f7636e.zzd(null);
    }
}