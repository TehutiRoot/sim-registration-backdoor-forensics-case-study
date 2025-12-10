package com.google.android.gms.identity.intents;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes3.dex */
public final class Address {
    @NonNull
    public static final Api<AddressOptions> API;

    /* renamed from: a */
    public static final Api.ClientKey f45397a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f45398b;

    /* loaded from: classes3.dex */
    public static final class AddressOptions implements Api.ApiOptions.HasOptions {
        public final int theme;

        public AddressOptions() {
            this.theme = 0;
        }

        public AddressOptions(int i) {
            this.theme = i;
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f45397a = clientKey;
        C6381a c6381a = new C6381a();
        f45398b = c6381a;
        API = new Api<>("Address.API", c6381a, clientKey);
    }

    public static void requestUserAddress(@NonNull GoogleApiClient googleApiClient, @NonNull UserAddressRequest userAddressRequest, int i) {
        googleApiClient.enqueue(new C17400Cd2(googleApiClient, userAddressRequest, i));
    }
}
