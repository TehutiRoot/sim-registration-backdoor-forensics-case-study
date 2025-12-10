package com.google.auth.oauth2;

import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class AwsSecurityCredentials {

    /* renamed from: a */
    public final String f52405a;

    /* renamed from: b */
    public final String f52406b;

    /* renamed from: c */
    public final String f52407c;

    public AwsSecurityCredentials(String str, String str2, @Nullable String str3) {
        this.f52405a = str;
        this.f52406b = str2;
        this.f52407c = str3;
    }

    public String getAccessKeyId() {
        return this.f52405a;
    }

    public String getSecretAccessKey() {
        return this.f52406b;
    }

    @Nullable
    public String getSessionToken() {
        return this.f52407c;
    }
}
