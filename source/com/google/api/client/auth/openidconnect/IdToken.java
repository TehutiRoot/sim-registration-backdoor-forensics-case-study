package com.google.api.client.auth.openidconnect;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Beta
/* loaded from: classes4.dex */
public class IdToken extends JsonWebSignature {

    @Beta
    /* loaded from: classes4.dex */
    public static class Payload extends JsonWebToken.Payload {

        /* renamed from: l */
        public Long f51762l;

        /* renamed from: m */
        public String f51763m;

        /* renamed from: n */
        public String f51764n;

        /* renamed from: o */
        public String f51765o;

        /* renamed from: p */
        public String f51766p;

        /* renamed from: q */
        public List f51767q;

        public final String getAccessTokenHash() {
            return this.f51765o;
        }

        public final Long getAuthorizationTimeSeconds() {
            return this.f51762l;
        }

        public final String getAuthorizedParty() {
            return this.f51763m;
        }

        public final String getClassReference() {
            return this.f51766p;
        }

        public final List<String> getMethodsReferences() {
            return this.f51767q;
        }

        public final String getNonce() {
            return this.f51764n;
        }

        public Payload setAccessTokenHash(String str) {
            this.f51765o = str;
            return this;
        }

        public Payload setAuthorizationTimeSeconds(Long l) {
            this.f51762l = l;
            return this;
        }

        public Payload setAuthorizedParty(String str) {
            this.f51763m = str;
            return this;
        }

        public Payload setClassReference(String str) {
            this.f51766p = str;
            return this;
        }

        public Payload setMethodsReferences(List<String> list) {
            this.f51767q = list;
            return this;
        }

        public Payload setNonce(String str) {
            this.f51764n = str;
            return this;
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setAudience(Object obj) {
            return (Payload) super.setAudience(obj);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setExpirationTimeSeconds(Long l) {
            return (Payload) super.setExpirationTimeSeconds(l);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setIssuedAtTimeSeconds(Long l) {
            return (Payload) super.setIssuedAtTimeSeconds(l);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setIssuer(String str) {
            return (Payload) super.setIssuer(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setJwtId(String str) {
            return (Payload) super.setJwtId(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setNotBeforeTimeSeconds(Long l) {
            return (Payload) super.setNotBeforeTimeSeconds(l);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setSubject(String str) {
            return (Payload) super.setSubject(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setType(String str) {
            return (Payload) super.setType(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload, com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload, com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Payload clone() {
            return (Payload) super.clone();
        }
    }

    public IdToken(JsonWebSignature.Header header, Payload payload, byte[] bArr, byte[] bArr2) {
        super(header, payload, bArr, bArr2);
    }

    public static IdToken parse(JsonFactory jsonFactory, String str) throws IOException {
        JsonWebSignature parse = JsonWebSignature.parser(jsonFactory).setPayloadClass(Payload.class).parse(str);
        return new IdToken(parse.getHeader(), (Payload) parse.getPayload(), parse.getSignatureBytes(), parse.getSignedContentBytes());
    }

    public final boolean verifyAudience(Collection<String> collection) {
        List<String> audienceAsList = getPayload().getAudienceAsList();
        if (audienceAsList.isEmpty()) {
            return false;
        }
        return collection.containsAll(audienceAsList);
    }

    public final boolean verifyExpirationTime(long j, long j2) {
        if (j <= (getPayload().getExpirationTimeSeconds().longValue() + j2) * 1000) {
            return true;
        }
        return false;
    }

    public final boolean verifyIssuedAtTime(long j, long j2) {
        if (j >= (getPayload().getIssuedAtTimeSeconds().longValue() - j2) * 1000) {
            return true;
        }
        return false;
    }

    public final boolean verifyIssuer(String str) {
        return verifyIssuer(Collections.singleton(str));
    }

    public final boolean verifyTime(long j, long j2) {
        if (verifyExpirationTime(j, j2) && verifyIssuedAtTime(j, j2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.client.json.webtoken.JsonWebToken
    public Payload getPayload() {
        return (Payload) super.getPayload();
    }

    public final boolean verifyIssuer(Collection<String> collection) {
        return collection.contains(getPayload().getIssuer());
    }
}
