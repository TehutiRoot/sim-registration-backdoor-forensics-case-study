package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk
/* loaded from: classes3.dex */
public final class AuthProxy {
    @KeepForSdk
    public static final Api<AuthProxyOptions> API;
    @KeepForSdk
    public static final ProxyApi ProxyApi;

    /* renamed from: a */
    public static final Api.ClientKey f44449a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f44450b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44449a = clientKey;
        C21779qa2 c21779qa2 = new C21779qa2();
        f44450b = c21779qa2;
        API = new Api<>("Auth.PROXY_API", c21779qa2, clientKey);
        ProxyApi = new zzar();
    }
}
