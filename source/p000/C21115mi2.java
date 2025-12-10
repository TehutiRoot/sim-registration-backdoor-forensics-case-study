package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: mi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21115mi2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f72015e;

    /* renamed from: f */
    public final /* synthetic */ String f72016f;

    /* renamed from: g */
    public final /* synthetic */ boolean f72017g;

    /* renamed from: h */
    public final /* synthetic */ zzbz f72018h;

    /* renamed from: i */
    public final /* synthetic */ zzee f72019i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21115mi2(zzee zzeeVar, String str, String str2, boolean z, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f72019i = zzeeVar;
        this.f72015e = str;
        this.f72016f = str2;
        this.f72017g = z;
        this.f72018h = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f72019i.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getUserProperties(this.f72015e, this.f72016f, this.f72017g, this.f72018h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f72018h.zzd(null);
    }
}
