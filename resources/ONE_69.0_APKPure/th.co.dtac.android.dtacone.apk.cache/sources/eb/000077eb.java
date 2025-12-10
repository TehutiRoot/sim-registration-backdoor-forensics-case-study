package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabf;

/* renamed from: b92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19179b92 extends AbstractC22120s92 {

    /* renamed from: b */
    public final /* synthetic */ ConnectionResult f39015b;

    /* renamed from: c */
    public final /* synthetic */ C19525d92 f39016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19179b92(C19525d92 c19525d92, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.f39016c = c19525d92;
        this.f39015b = connectionResult;
    }

    @Override // p000.AbstractC22120s92
    /* renamed from: a */
    public final void mo22860a() {
        this.f39016c.f61124c.m48539d(this.f39015b);
    }
}