package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zak;

/* renamed from: j92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20508j92 implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final int f67188a;

    /* renamed from: b */
    public final GoogleApiClient f67189b;

    /* renamed from: c */
    public final GoogleApiClient.OnConnectionFailedListener f67190c;

    /* renamed from: d */
    public final /* synthetic */ zak f67191d;

    public C20508j92(zak zakVar, int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f67191d = zakVar;
        this.f67188a = i;
        this.f67189b = googleApiClient;
        this.f67190c = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f67191d.zah(connectionResult, this.f67188a);
    }
}
