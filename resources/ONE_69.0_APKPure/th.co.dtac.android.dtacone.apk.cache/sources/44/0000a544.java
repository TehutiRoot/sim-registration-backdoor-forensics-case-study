package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Preconditions;

/* loaded from: classes4.dex */
public class AuthorizationCodeResponseUrl extends GenericUrl {

    /* renamed from: k */
    public String f51713k;

    /* renamed from: l */
    public String f51714l;

    /* renamed from: m */
    public String f51715m;

    /* renamed from: n */
    public String f51716n;

    /* renamed from: o */
    public String f51717o;

    public AuthorizationCodeResponseUrl(String str) {
        super(str);
        boolean z;
        boolean z2;
        if (this.f51713k == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f51715m == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z != z2);
    }

    public final String getCode() {
        return this.f51713k;
    }

    public final String getError() {
        return this.f51715m;
    }

    public final String getErrorDescription() {
        return this.f51716n;
    }

    public final String getErrorUri() {
        return this.f51717o;
    }

    public final String getState() {
        return this.f51714l;
    }

    public AuthorizationCodeResponseUrl setCode(String str) {
        this.f51713k = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setError(String str) {
        this.f51715m = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorDescription(String str) {
        this.f51716n = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorUri(String str) {
        this.f51717o = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setState(String str) {
        this.f51714l = str;
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