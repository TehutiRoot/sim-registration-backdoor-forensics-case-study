package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

/* loaded from: classes4.dex */
public final class GoogleClientSecrets extends GenericJson {

    /* renamed from: d */
    public Details f51810d;

    /* renamed from: e */
    public Details f51811e;

    public static GoogleClientSecrets load(JsonFactory jsonFactory, Reader reader) throws IOException {
        return (GoogleClientSecrets) jsonFactory.fromReader(reader, GoogleClientSecrets.class);
    }

    public Details getDetails() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f51811e == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f51810d == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = true;
        }
        Preconditions.checkArgument(z3);
        Details details = this.f51811e;
        if (details == null) {
            return this.f51810d;
        }
        return details;
    }

    public Details getInstalled() {
        return this.f51810d;
    }

    public Details getWeb() {
        return this.f51811e;
    }

    public GoogleClientSecrets setInstalled(Details details) {
        this.f51810d = details;
        return this;
    }

    public GoogleClientSecrets setWeb(Details details) {
        this.f51811e = details;
        return this;
    }

    /* loaded from: classes4.dex */
    public static final class Details extends GenericJson {

        /* renamed from: d */
        public String f51812d;

        /* renamed from: e */
        public String f51813e;

        /* renamed from: f */
        public List f51814f;

        /* renamed from: g */
        public String f51815g;

        /* renamed from: h */
        public String f51816h;

        public String getAuthUri() {
            return this.f51815g;
        }

        public String getClientId() {
            return this.f51812d;
        }

        public String getClientSecret() {
            return this.f51813e;
        }

        public List<String> getRedirectUris() {
            return this.f51814f;
        }

        public String getTokenUri() {
            return this.f51816h;
        }

        public Details setAuthUri(String str) {
            this.f51815g = str;
            return this;
        }

        public Details setClientId(String str) {
            this.f51812d = str;
            return this;
        }

        public Details setClientSecret(String str) {
            this.f51813e = str;
            return this;
        }

        public Details setRedirectUris(List<String> list) {
            this.f51814f = list;
            return this;
        }

        public Details setTokenUri(String str) {
            this.f51816h = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Details set(String str, Object obj) {
            return (Details) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Details clone() {
            return (Details) super.clone();
        }
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GoogleClientSecrets set(String str, Object obj) {
        return (GoogleClientSecrets) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GoogleClientSecrets clone() {
        return (GoogleClientSecrets) super.clone();
    }
}
