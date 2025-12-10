package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: qk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21872qk2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Long f77291e;

    /* renamed from: f */
    public final /* synthetic */ String f77292f;

    /* renamed from: g */
    public final /* synthetic */ String f77293g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f77294h;

    /* renamed from: i */
    public final /* synthetic */ boolean f77295i;

    /* renamed from: j */
    public final /* synthetic */ boolean f77296j;

    /* renamed from: k */
    public final /* synthetic */ zzee f77297k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21872qk2(zzee zzeeVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzeeVar, true);
        this.f77297k = zzeeVar;
        this.f77291e = l;
        this.f77292f = str;
        this.f77293g = str2;
        this.f77294h = bundle;
        this.f77295i = z;
        this.f77296j = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        long longValue;
        zzcc zzccVar;
        Long l = this.f77291e;
        if (l == null) {
            longValue = this.f46208a;
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        zzccVar = this.f77297k.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logEvent(this.f77292f, this.f77293g, this.f77294h, this.f77295i, this.f77296j, j);
    }
}