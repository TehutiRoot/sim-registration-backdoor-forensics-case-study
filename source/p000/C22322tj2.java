package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: tj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22322tj2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Long f107176e;

    /* renamed from: f */
    public final /* synthetic */ String f107177f;

    /* renamed from: g */
    public final /* synthetic */ String f107178g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f107179h;

    /* renamed from: i */
    public final /* synthetic */ boolean f107180i;

    /* renamed from: j */
    public final /* synthetic */ boolean f107181j;

    /* renamed from: k */
    public final /* synthetic */ zzee f107182k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22322tj2(zzee zzeeVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzeeVar, true);
        this.f107182k = zzeeVar;
        this.f107176e = l;
        this.f107177f = str;
        this.f107178g = str2;
        this.f107179h = bundle;
        this.f107180i = z;
        this.f107181j = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        long longValue;
        zzcc zzccVar;
        Long l = this.f107176e;
        if (l == null) {
            longValue = this.f46196a;
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        zzccVar = this.f107182k.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logEvent(this.f107177f, this.f107178g, this.f107179h, this.f107180i, this.f107181j, j);
    }
}
