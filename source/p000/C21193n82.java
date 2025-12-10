package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21193n82 implements GoogleApiClient.ConnectionCallbacks {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f72135a;

    /* renamed from: b */
    public final /* synthetic */ StatusPendingResult f72136b;

    /* renamed from: c */
    public final /* synthetic */ zabe f72137c;

    public C21193n82(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f72137c = zabeVar;
        this.f72135a = atomicReference;
        this.f72136b = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        StatusPendingResult statusPendingResult = this.f72136b;
        this.f72137c.m48511j((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.f72135a.get()), statusPendingResult, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
