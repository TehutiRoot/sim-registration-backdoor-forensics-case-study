package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C6331a;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zay;

/* renamed from: Aa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17286Aa2 implements zabz {

    /* renamed from: a */
    public final /* synthetic */ C6331a f131a;

    public /* synthetic */ C17286Aa2(C6331a c6331a, zay zayVar) {
        this.f131a = c6331a;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        C6331a.m48564j(this.f131a).lock();
        try {
            C6331a.m48562l(this.f131a, connectionResult);
            C6331a.m48558p(this.f131a);
        } finally {
            C6331a.m48564j(this.f131a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        C6331a.m48564j(this.f131a).lock();
        try {
            C6331a.m48562l(this.f131a, ConnectionResult.RESULT_SUCCESS);
            C6331a.m48558p(this.f131a);
        } finally {
            C6331a.m48564j(this.f131a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        C6331a.m48564j(this.f131a).lock();
        try {
            C6331a c6331a = this.f131a;
            if (C6331a.m48557q(c6331a)) {
                C6331a.m48561m(c6331a, false);
                C6331a.m48560n(this.f131a, i, z);
            } else {
                C6331a.m48561m(c6331a, true);
                C6331a.m48566h(this.f131a).onConnectionSuspended(i);
            }
            C6331a.m48564j(this.f131a).unlock();
        } catch (Throwable th2) {
            C6331a.m48564j(this.f131a).unlock();
            throw th2;
        }
    }
}