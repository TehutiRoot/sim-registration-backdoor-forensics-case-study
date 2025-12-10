package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public class LocationServices {
    @NonNull
    public static final Api<Api.ApiOptions.NoOptions> API;
    @NonNull
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi;
    @NonNull
    @Deprecated
    public static final GeofencingApi GeofencingApi;
    @NonNull
    @Deprecated
    public static final SettingsApi SettingsApi;

    /* renamed from: a */
    public static final Api.ClientKey f47770a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f47771b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f47770a = clientKey;
        C17595Fe2 c17595Fe2 = new C17595Fe2();
        f47771b = c17595Fe2;
        API = new Api<>("LocationServices.API", c17595Fe2, clientKey);
        FusedLocationApi = new com.google.android.gms.internal.location.zzz();
        GeofencingApi = new com.google.android.gms.internal.location.zzaf();
        SettingsApi = new com.google.android.gms.internal.location.zzbm();
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Activity activity) {
        return new FusedLocationProviderClient(activity);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Activity activity) {
        return new GeofencingClient(activity);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Activity activity) {
        return new SettingsClient(activity);
    }

    public static com.google.android.gms.internal.location.zzbe zza(GoogleApiClient googleApiClient) {
        boolean z;
        boolean z2 = false;
        if (googleApiClient != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) googleApiClient.getClient(f47770a);
        if (zzbeVar != null) {
            z2 = true;
        }
        Preconditions.checkState(z2, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzbeVar;
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Context context) {
        return new FusedLocationProviderClient(context);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Context context) {
        return new GeofencingClient(context);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Context context) {
        return new SettingsClient(context);
    }
}
