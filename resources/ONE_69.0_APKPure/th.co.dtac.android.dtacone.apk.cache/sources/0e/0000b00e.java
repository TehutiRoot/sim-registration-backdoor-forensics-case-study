package com.google.firebase.crashlytics.internal.network;

/* loaded from: classes4.dex */
public class HttpResponse {

    /* renamed from: a */
    public final int f55378a;

    /* renamed from: b */
    public final String f55379b;

    public HttpResponse(int i, String str) {
        this.f55378a = i;
        this.f55379b = str;
    }

    public String body() {
        return this.f55379b;
    }

    public int code() {
        return this.f55378a;
    }
}