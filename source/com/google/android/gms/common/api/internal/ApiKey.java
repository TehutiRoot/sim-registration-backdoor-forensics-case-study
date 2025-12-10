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
    public final int f44738a;

    /* renamed from: b */
    public final Api f44739b;

    /* renamed from: c */
    public final Api.ApiOptions f44740c;

    /* renamed from: d */
    public final String f44741d;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.f44739b = api;
        this.f44740c = apiOptions;
        this.f44741d = str;
        this.f44738a = Objects.hashCode(api, apiOptions, str);
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
        if (!Objects.equal(this.f44739b, apiKey.f44739b) || !Objects.equal(this.f44740c, apiKey.f44740c) || !Objects.equal(this.f44741d, apiKey.f44741d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f44738a;
    }

    @NonNull
    public final String zaa() {
        return this.f44739b.zad();
    }
}
