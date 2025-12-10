package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Preconditions;

/* loaded from: classes4.dex */
public class TokenErrorResponse extends GenericJson {

    /* renamed from: d */
    public String f51756d;

    /* renamed from: e */
    public String f51757e;

    /* renamed from: f */
    public String f51758f;

    public final String getError() {
        return this.f51756d;
    }

    public final String getErrorDescription() {
        return this.f51757e;
    }

    public final String getErrorUri() {
        return this.f51758f;
    }

    public TokenErrorResponse setError(String str) {
        this.f51756d = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public TokenErrorResponse setErrorDescription(String str) {
        this.f51757e = str;
        return this;
    }

    public TokenErrorResponse setErrorUri(String str) {
        this.f51758f = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public TokenErrorResponse set(String str, Object obj) {
        return (TokenErrorResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public TokenErrorResponse clone() {
        return (TokenErrorResponse) super.clone();
    }
}