package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

@KeepForSdk
/* loaded from: classes3.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* renamed from: a */
    public final int f44750a;

    /* renamed from: b */
    public final Api f44751b;

    /* renamed from: c */
    public final Api.ApiOptions f44752c;

    /* renamed from: d */
    public final String f44753d;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.f44751b = api;
        this.f44752c = apiOptions;
        this.f44753d = str;
        this.f44750a = Objects.hashCode(api, apiOptions, str);
    }

    @NonNull
    @KeepForSdk
    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(@NonNull Api<O> api, @Nullable O o, @Nullable String str) {
        return new ApiKey<>(api, o, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        if (!Objects.equal(this.f44751b, apiKey.f44751b) || !Objects.equal(this.f44752c, apiKey.f44752c) || !Objects.equal(this.f44753d, apiKey.f44753d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f44750a;
    }

    @NonNull
    public final String zaa() {
        return this.f44751b.zad();
    }
}