package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class zal {

    /* renamed from: a */
    public final SparseIntArray f45167a;

    /* renamed from: b */
    public GoogleApiAvailabilityLight f45168b;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i) {
        return this.f45167a.get(i, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int zab(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int zaa = zaa(context, minApkVersion);
        if (zaa == -1) {
            int i2 = 0;
            while (true) {
                if (i2 < this.f45167a.size()) {
                    int keyAt = this.f45167a.keyAt(i2);
                    if (keyAt > minApkVersion && this.f45167a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                zaa = this.f45168b.isGooglePlayServicesAvailable(context, minApkVersion);
            } else {
                zaa = i;
            }
            this.f45167a.put(minApkVersion, zaa);
        }
        return zaa;
    }

    public final void zac() {
        this.f45167a.clear();
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f45167a = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.f45168b = googleApiAvailabilityLight;
    }
}