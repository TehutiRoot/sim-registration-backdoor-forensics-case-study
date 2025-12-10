package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: jj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20658jj2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f67385e;

    /* renamed from: f */
    public final /* synthetic */ String f67386f;

    /* renamed from: g */
    public final /* synthetic */ boolean f67387g;

    /* renamed from: h */
    public final /* synthetic */ zzbz f67388h;

    /* renamed from: i */
    public final /* synthetic */ zzee f67389i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20658jj2(zzee zzeeVar, String str, String str2, boolean z, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f67389i = zzeeVar;
        this.f67385e = str;
        this.f67386f = str2;
        this.f67387g = z;
        this.f67388h = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f67389i.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getUserProperties(this.f67385e, this.f67386f, this.f67387g, this.f67388h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f67388h.zzd(null);
    }
}