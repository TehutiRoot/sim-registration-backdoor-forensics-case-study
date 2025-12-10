package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

/* renamed from: o92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21428o92 implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final /* synthetic */ StatusPendingResult f72693a;

    public C21428o92(zabe zabeVar, StatusPendingResult statusPendingResult) {
        this.f72693a = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f72693a.setResult(new Status(8));
    }
}