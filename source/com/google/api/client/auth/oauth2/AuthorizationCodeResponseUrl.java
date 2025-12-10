package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Preconditions;

/* loaded from: classes4.dex */
public class AuthorizationCodeResponseUrl extends GenericUrl {

    /* renamed from: k */
    public String f51701k;

    /* renamed from: l */
    public String f51702l;

    /* renamed from: m */
    public String f51703m;

    /* renamed from: n */
    public String f51704n;

    /* renamed from: o */
    public String f51705o;

    public AuthorizationCodeResponseUrl(String str) {
        super(str);
        boolean z;
        boolean z2;
        if (this.f51701k == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f51703m == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z != z2);
    }

    public final String getCode() {
        return this.f51701k;
    }

    public final String getError() {
        return this.f51703m;
    }

    public final String getErrorDescription() {
        return this.f51704n;
    }

    public final String getErrorUri() {
        return this.f51705o;
    }

    public final String getState() {
        return this.f51702l;
    }

    public AuthorizationCodeResponseUrl setCode(String str) {
        this.f51701k = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setError(String str) {
        this.f51703m = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorDescription(String str) {
        this.f51704n = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorUri(String str) {
        this.f51705o = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setState(String str) {
        this.f51702l = str;
        return this;
    }

    @Override // com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData
    public AuthorizationCodeResponseUrl set(String str, Object obj) {
        return (AuthorizationCodeResponseUrl) super.set(str, obj);
    }

    @Override // com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData, java.util.AbstractMap
    public AuthorizationCodeResponseUrl clone() {
        return (AuthorizationCodeResponseUrl) super.clone();
    }
}
