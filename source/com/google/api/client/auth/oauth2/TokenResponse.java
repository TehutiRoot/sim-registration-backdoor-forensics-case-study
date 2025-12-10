package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Preconditions;

/* loaded from: classes4.dex */
public class TokenResponse extends GenericJson {

    /* renamed from: d */
    public String f51757d;

    /* renamed from: e */
    public String f51758e;

    /* renamed from: f */
    public Long f51759f;

    /* renamed from: g */
    public String f51760g;

    /* renamed from: h */
    public String f51761h;

    public String getAccessToken() {
        return this.f51757d;
    }

    public Long getExpiresInSeconds() {
        return this.f51759f;
    }

    public String getRefreshToken() {
        return this.f51760g;
    }

    public String getScope() {
        return this.f51761h;
    }

    public String getTokenType() {
        return this.f51758e;
    }

    public TokenResponse setAccessToken(String str) {
        this.f51757d = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public TokenResponse setExpiresInSeconds(Long l) {
        this.f51759f = l;
        return this;
    }

    public TokenResponse setRefreshToken(String str) {
        this.f51760g = str;
        return this;
    }

    public TokenResponse setScope(String str) {
        this.f51761h = str;
        return this;
    }

    public TokenResponse setTokenType(String str) {
        this.f51758e = (String) Preconditions.checkNotNull(str);
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public TokenResponse set(String str, Object obj) {
        return (TokenResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public TokenResponse clone() {
        return (TokenResponse) super.clone();
    }
}
