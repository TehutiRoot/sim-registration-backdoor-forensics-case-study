package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: k92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20680k92 {

    /* renamed from: a */
    public final int f67815a;

    /* renamed from: b */
    public final ConnectionResult f67816b;

    public C20680k92(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.f67816b = connectionResult;
        this.f67815a = i;
    }

    /* renamed from: a */
    public final int m28987a() {
        return this.f67815a;
    }

    /* renamed from: b */
    public final ConnectionResult m28986b() {
        return this.f67816b;
    }
}
