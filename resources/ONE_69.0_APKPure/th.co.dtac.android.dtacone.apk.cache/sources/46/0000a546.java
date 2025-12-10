package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import java.util.Collection;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class AuthorizationRequestUrl extends GenericUrl {

    /* renamed from: k */
    public String f51720k;

    /* renamed from: l */
    public String f51721l;

    /* renamed from: m */
    public String f51722m;

    /* renamed from: n */
    public String f51723n;

    /* renamed from: o */
    public String f51724o;

    public AuthorizationRequestUrl(String str, String str2, Collection<String> collection) {
        super(str);
        boolean z;
        if (getFragment() == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        setClientId(str2);
        setResponseTypes(collection);
    }

    public final String getClientId() {
        return this.f51723n;
    }

    public final String getRedirectUri() {
        return this.f51721l;
    }

    public final String getResponseTypes() {
        return this.f51720k;
    }

    public final String getScopes() {
        return this.f51722m;
    }

    public final String getState() {
        return this.f51724o;
    }

    public AuthorizationRequestUrl setClientId(String str) {
        this.f51723n = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AuthorizationRequestUrl setRedirectUri(String str) {
        this.f51721l = str;
        return this;
    }

    public AuthorizationRequestUrl setResponseTypes(Collection<String> collection) {
        this.f51720k = Joiner.m41685on(TokenParser.f74644SP).join(collection);
        return this;
    }

    public AuthorizationRequestUrl setScopes(Collection<String> collection) {
        String str;
        if (collection != null && collection.iterator().hasNext()) {
            str = Joiner.m41685on(TokenParser.f74644SP).join(collection);
        } else {
            str = null;
        }
        this.f51722m = str;
        return this;
    }

    public AuthorizationRequestUrl setState(String str) {
        this.f51724o = str;
        return this;
    }

    @Override // com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData
    public AuthorizationRequestUrl set(String str, Object obj) {
        return (AuthorizationRequestUrl) super.set(str, obj);
    }

    @Override // com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData, java.util.AbstractMap
    public AuthorizationRequestUrl clone() {
        return (AuthorizationRequestUrl) super.clone();
    }
}