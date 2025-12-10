package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Ej2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17573Ej2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f1433e;

    /* renamed from: f */
    public final /* synthetic */ zzee f1434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17573Ej2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f1434f = zzeeVar;
        this.f1433e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f1434f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getAppInstanceId(this.f1433e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f1433e.zzd(null);
    }
}