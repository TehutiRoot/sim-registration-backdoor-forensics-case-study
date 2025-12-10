package com.google.firebase.crashlytics.internal.network;

/* loaded from: classes4.dex */
public class HttpResponse {

    /* renamed from: a */
    public final int f55366a;

    /* renamed from: b */
    public final String f55367b;

    public HttpResponse(int i, String str) {
        this.f55366a = i;
        this.f55367b = str;
    }

    public String body() {
        return this.f55367b;
    }

    public int code() {
        return this.f55366a;
    }
}
