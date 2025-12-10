package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: zh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23420zh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f109457e;

    /* renamed from: f */
    public final /* synthetic */ String f109458f;

    /* renamed from: g */
    public final /* synthetic */ zzbz f109459g;

    /* renamed from: h */
    public final /* synthetic */ zzee f109460h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23420zh2(zzee zzeeVar, String str, String str2, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f109460h = zzeeVar;
        this.f109457e = str;
        this.f109458f = str2;
        this.f109459g = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f109460h.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getConditionalUserProperties(this.f109457e, this.f109458f, this.f109459g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f109459g.zzd(null);
    }
}