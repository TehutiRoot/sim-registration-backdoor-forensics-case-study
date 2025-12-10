package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import java.util.Collection;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class AuthorizationRequestUrl extends GenericUrl {

    /* renamed from: k */
    public String f51708k;

    /* renamed from: l */
    public String f51709l;

    /* renamed from: m */
    public String f51710m;

    /* renamed from: n */
    public String f51711n;

    /* renamed from: o */
    public String f51712o;

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
        return this.f51711n;
    }

    public final String getRedirectUri() {
        return this.f51709l;
    }

    public final String getResponseTypes() {
        return this.f51708k;
    }

    public final String getScopes() {
        return this.f51710m;
    }

    public final String getState() {
        return this.f51712o;
    }

    public AuthorizationRequestUrl setClientId(String str) {
        this.f51711n = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AuthorizationRequestUrl setRedirectUri(String str) {
        this.f51709l = str;
        return this;
    }

    public AuthorizationRequestUrl setResponseTypes(Collection<String> collection) {
        this.f51708k = Joiner.m41698on(TokenParser.f74560SP).join(collection);
        return this;
    }

    public AuthorizationRequestUrl setScopes(Collection<String> collection) {
        String str;
        if (collection != null && collection.iterator().hasNext()) {
            str = Joiner.m41698on(TokenParser.f74560SP).join(collection);
        } else {
            str = null;
        }
        this.f51710m = str;
        return this;
    }

    public AuthorizationRequestUrl setState(String str) {
        this.f51712o = str;
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
