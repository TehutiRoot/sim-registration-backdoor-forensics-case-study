package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p015ml.common.FirebaseMLException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzsc implements zzqc, zzqx {

    /* renamed from: a */
    public final zzsb f46018a;

    /* renamed from: b */
    public final GoogleApiClient f46019b;

    /* renamed from: c */
    public final /* synthetic */ zzrz f46020c;

    public zzsc(zzrz zzrzVar, FirebaseApp firebaseApp, boolean z) {
        this.f46020c = zzrzVar;
        if (z) {
            GoogleApiClient build = new GoogleApiClient.Builder(firebaseApp.getApplicationContext()).addApi(AuthProxy.API).build();
            this.f46019b = build;
            build.connect();
        } else {
            this.f46019b = null;
        }
        this.f46018a = zzsb.zza(firebaseApp, z, this.f46019b);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    public final void release() {
        GoogleApiClient googleApiClient = this.f46019b;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    @WorkerThread
    public final /* synthetic */ Object zza(zzqg zzqgVar) throws FirebaseMLException {
        zzsa zzsaVar = (zzsa) zzqgVar;
        return this.f46020c.zza(this.f46018a.zza(zzsaVar), zzsaVar.zzbtx);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    public final zzqx zzon() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final void zzow() throws FirebaseMLException {
        GoogleApiClient googleApiClient = this.f46019b;
        if (googleApiClient != null && !zzmg.equal(googleApiClient.blockingConnect(3L, TimeUnit.SECONDS), ConnectionResult.RESULT_SUCCESS)) {
            throw new FirebaseMLException("Failed to contact Google Play services", 14);
        }
    }
}
