package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Fh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17632Fh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Activity f1747e;

    /* renamed from: f */
    public final /* synthetic */ String f1748f;

    /* renamed from: g */
    public final /* synthetic */ String f1749g;

    /* renamed from: h */
    public final /* synthetic */ zzee f1750h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17632Fh2(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.f1750h = zzeeVar;
        this.f1747e = activity;
        this.f1748f = str;
        this.f1749g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f1750h.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setCurrentScreen(ObjectWrapper.wrap(this.f1747e), this.f1748f, this.f1749g, this.f46208a);
    }
}