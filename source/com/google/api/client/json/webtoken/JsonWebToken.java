package com.google.api.client.json.webtoken;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class JsonWebToken {

    /* renamed from: a */
    public final Header f52214a;

    /* renamed from: b */
    public final Payload f52215b;

    public JsonWebToken(Header header, Payload payload) {
        this.f52214a = (Header) Preconditions.checkNotNull(header);
        this.f52215b = (Payload) Preconditions.checkNotNull(payload);
    }

    public Header getHeader() {
        return this.f52214a;
    }

    public Payload getPayload() {
        return this.f52215b;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("header", this.f52214a).add("payload", this.f52215b).toString();
    }

    /* loaded from: classes4.dex */
    public static class Header extends GenericJson {

        /* renamed from: d */
        public String f52216d;

        /* renamed from: e */
        public String f52217e;

        public final String getContentType() {
            return this.f52217e;
        }

        public final String getType() {
            return this.f52216d;
        }

        public Header setContentType(String str) {
            this.f52217e = str;
            return this;
        }

        public Header setType(String str) {
            this.f52216d = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Header clone() {
            return (Header) super.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static class Payload extends GenericJson {

        /* renamed from: d */
        public Long f52218d;

        /* renamed from: e */
        public Long f52219e;

        /* renamed from: f */
        public Long f52220f;

        /* renamed from: g */
        public String f52221g;

        /* renamed from: h */
        public Object f52222h;

        /* renamed from: i */
        public String f52223i;

        /* renamed from: j */
        public String f52224j;

        /* renamed from: k */
        public String f52225k;

        public final Object getAudience() {
            return this.f52222h;
        }

        public final List<String> getAudienceAsList() {
            Object obj = this.f52222h;
            if (obj == null) {
                return Collections.emptyList();
            }
            if (obj instanceof String) {
                return Collections.singletonList((String) obj);
            }
            return (List) obj;
        }

        public final Long getExpirationTimeSeconds() {
            return this.f52218d;
        }

        public final Long getIssuedAtTimeSeconds() {
            return this.f52220f;
        }

        public final String getIssuer() {
            return this.f52221g;
        }

        public final String getJwtId() {
            return this.f52223i;
        }

        public final Long getNotBeforeTimeSeconds() {
            return this.f52219e;
        }

        public final String getSubject() {
            return this.f52225k;
        }

        public final String getType() {
            return this.f52224j;
        }

        public Payload setAudience(Object obj) {
            this.f52222h = obj;
            return this;
        }

        public Payload setExpirationTimeSeconds(Long l) {
            this.f52218d = l;
            return this;
        }

        public Payload setIssuedAtTimeSeconds(Long l) {
            this.f52220f = l;
            return this;
        }

        public Payload setIssuer(String str) {
            this.f52221g = str;
            return this;
        }

        public Payload setJwtId(String str) {
            this.f52223i = str;
            return this;
        }

        public Payload setNotBeforeTimeSeconds(Long l) {
            this.f52219e = l;
            return this;
        }

        public Payload setSubject(String str) {
            this.f52225k = str;
            return this;
        }

        public Payload setType(String str) {
            this.f52224j = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Payload clone() {
            return (Payload) super.clone();
        }
    }
}
