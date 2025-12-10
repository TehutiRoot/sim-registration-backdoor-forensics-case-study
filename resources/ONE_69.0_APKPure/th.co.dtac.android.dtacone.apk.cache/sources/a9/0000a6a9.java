package com.google.auth.oauth2;

import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class AwsSecurityCredentials {

    /* renamed from: a */
    public final String f52417a;

    /* renamed from: b */
    public final String f52418b;

    /* renamed from: c */
    public final String f52419c;

    public AwsSecurityCredentials(String str, String str2, @Nullable String str3) {
        this.f52417a = str;
        this.f52418b = str2;
        this.f52419c = str3;
    }

    public String getAccessKeyId() {
        return this.f52417a;
    }

    public String getSecretAccessKey() {
        return this.f52418b;
    }

    @Nullable
    public String getSessionToken() {
        return this.f52419c;
    }
}