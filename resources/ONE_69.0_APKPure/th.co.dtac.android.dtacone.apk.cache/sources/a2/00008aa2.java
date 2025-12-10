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
    public static final Api.ClientKey f44461a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f44462b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44461a = clientKey;
        C21326nb2 c21326nb2 = new C21326nb2();
        f44462b = c21326nb2;
        API = new Api<>("Auth.PROXY_API", c21326nb2, clientKey);
        ProxyApi = new zzar();
    }
}