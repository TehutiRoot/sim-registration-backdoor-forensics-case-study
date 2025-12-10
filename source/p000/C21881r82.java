package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

/* renamed from: r82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21881r82 implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final /* synthetic */ StatusPendingResult f77186a;

    public C21881r82(zabe zabeVar, StatusPendingResult statusPendingResult) {
        this.f77186a = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f77186a.setResult(new Status(8));
    }
}
