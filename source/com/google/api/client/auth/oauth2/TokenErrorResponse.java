package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Preconditions;

/* loaded from: classes4.dex */
public class TokenErrorResponse extends GenericJson {

    /* renamed from: d */
    public String f51744d;

    /* renamed from: e */
    public String f51745e;

    /* renamed from: f */
    public String f51746f;

    public final String getError() {
        return this.f51744d;
    }

    public final String getErrorDescription() {
        return this.f51745e;
    }

    public final String getErrorUri() {
        return this.f51746f;
    }

    public TokenErrorResponse setError(String str) {
        this.f51744d = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public TokenErrorResponse setErrorDescription(String str) {
        this.f51745e = str;
        return this;
    }

    public TokenErrorResponse setErrorUri(String str) {
        this.f51746f = str;
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
