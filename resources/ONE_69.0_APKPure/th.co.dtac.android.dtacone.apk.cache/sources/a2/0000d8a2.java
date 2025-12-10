package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20736k92 implements GoogleApiClient.ConnectionCallbacks {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f67888a;

    /* renamed from: b */
    public final /* synthetic */ StatusPendingResult f67889b;

    /* renamed from: c */
    public final /* synthetic */ zabe f67890c;

    public C20736k92(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f67890c = zabeVar;
        this.f67888a = atomicReference;
        this.f67889b = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        StatusPendingResult statusPendingResult = this.f67889b;
        this.f67890c.m48508j((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.f67888a.get()), statusPendingResult, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}