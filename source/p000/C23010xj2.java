package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: xj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23010xj2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f108478e;

    /* renamed from: f */
    public final /* synthetic */ String f108479f;

    /* renamed from: g */
    public final /* synthetic */ Object f108480g;

    /* renamed from: h */
    public final /* synthetic */ boolean f108481h;

    /* renamed from: i */
    public final /* synthetic */ zzee f108482i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23010xj2(zzee zzeeVar, String str, String str2, Object obj, boolean z) {
        super(zzeeVar, true);
        this.f108482i = zzeeVar;
        this.f108478e = str;
        this.f108479f = str2;
        this.f108480g = obj;
        this.f108481h = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f108482i.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setUserProperty(this.f108478e, this.f108479f, ObjectWrapper.wrap(this.f108480g), this.f108481h, this.f46196a);
    }
}
