package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* renamed from: yk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23185yk2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Activity f108843e;

    /* renamed from: f */
    public final /* synthetic */ zzbz f108844f;

    /* renamed from: g */
    public final /* synthetic */ C17741Hk2 f108845g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23185yk2(C17741Hk2 c17741Hk2, Activity activity, zzbz zzbzVar) {
        super(c17741Hk2.f2296a, true);
        this.f108845g = c17741Hk2;
        this.f108843e = activity;
        this.f108844f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f108845g.f2296a.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.f108843e), this.f108844f, this.f46197b);
    }
}
