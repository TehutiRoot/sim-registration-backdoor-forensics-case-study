package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes4.dex */
public class ClientId {

    /* renamed from: a */
    public final String f52420a;

    /* renamed from: b */
    public final String f52421b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f52422a;

        /* renamed from: b */
        public String f52423b;

        public Builder() {
        }

        public ClientId build() {
            return new ClientId(this.f52422a, this.f52423b);
        }

        public String getClientSecret() {
            return this.f52423b;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            this.f52422a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientSecret(String str) {
            this.f52423b = str;
            return this;
        }

        public Builder(ClientId clientId) {
            this.f52422a = clientId.getClientId();
            this.f52423b = clientId.getClientSecret();
        }
    }

    public static ClientId fromJson(Map<String, Object> map) throws IOException {
        Object obj = map.get("installed");
        if (obj == null) {
            obj = map.get("web");
        }
        if (obj != null && (obj instanceof Map)) {
            Map map2 = (Map) obj;
            String m68025j = IJ0.m68025j(map2, "client_id", "Error parsing Client ID JSON: ");
            if (m68025j != null && m68025j.length() != 0) {
                return new ClientId(m68025j, IJ0.m68026i(map2, "client_secret", "Error parsing Client ID JSON: "));
            }
            throw new IOException("Unable to parse ClientId. Field 'client_id' is required.");
        }
        throw new IOException("Unable to parse Client ID JSON. Expecting top-level field 'web' or 'installed' of collection type");
    }

    public static ClientId fromResource(Class<?> cls, String str) throws IOException {
        return fromStream(cls.getResourceAsStream(str));
    }

    public static ClientId fromStream(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return fromJson((GenericJson) new JsonObjectParser(IJ0.f2657f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* renamed from: of */
    public static ClientId m41666of(String str, String str2) {
        return new ClientId(str, str2);
    }

    public final String getClientId() {
        return this.f52420a;
    }

    public final String getClientSecret() {
        return this.f52421b;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public ClientId(String str, String str2) {
        this.f52420a = (String) Preconditions.checkNotNull(str);
        this.f52421b = str2;
    }
}