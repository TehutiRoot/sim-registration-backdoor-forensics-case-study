package com.google.android.gms.common.internal.service;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public final class Common {
    @NonNull
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;
    @NonNull
    @KeepForSdk
    public static final Api.ClientKey<zah> CLIENT_KEY;

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f45139a;
    public static final zae zaa;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        C21709q82 c21709q82 = new C21709q82();
        f45139a = c21709q82;
        API = new Api<>("Common.API", c21709q82, clientKey);
        zaa = new zae();
    }
}
