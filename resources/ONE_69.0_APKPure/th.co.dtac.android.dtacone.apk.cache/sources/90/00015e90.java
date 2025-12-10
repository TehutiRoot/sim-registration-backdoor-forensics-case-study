package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: uk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22564uk2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f107867e;

    /* renamed from: f */
    public final /* synthetic */ String f107868f;

    /* renamed from: g */
    public final /* synthetic */ Object f107869g;

    /* renamed from: h */
    public final /* synthetic */ boolean f107870h;

    /* renamed from: i */
    public final /* synthetic */ zzee f107871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22564uk2(zzee zzeeVar, String str, String str2, Object obj, boolean z) {
        super(zzeeVar, true);
        this.f107871i = zzeeVar;
        this.f107867e = str;
        this.f107868f = str2;
        this.f107869g = obj;
        this.f107870h = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f107871i.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setUserProperty(this.f107867e, this.f107868f, ObjectWrapper.wrap(this.f107869g), this.f107870h, this.f46208a);
    }
}