package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Cg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17409Cg2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f796e;

    /* renamed from: f */
    public final /* synthetic */ String f797f;

    /* renamed from: g */
    public final /* synthetic */ zzbz f798g;

    /* renamed from: h */
    public final /* synthetic */ zzee f799h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17409Cg2(zzee zzeeVar, String str, String str2, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f799h = zzeeVar;
        this.f796e = str;
        this.f797f = str2;
        this.f798g = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f799h.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getConditionalUserProperties(this.f796e, this.f797f, this.f798g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f798g.zzd(null);
    }
}
