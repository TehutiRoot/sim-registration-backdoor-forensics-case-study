package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: kw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC20813kw2 extends Zp2 {

    /* renamed from: a */
    public final /* synthetic */ Ys2 f71484a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC20813kw2(Ys2 ys2) {
        super(null);
        this.f71484a = ys2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzl
    public final void zza(Status status) {
        this.f71484a.setResult((Ys2) status);
    }
}
