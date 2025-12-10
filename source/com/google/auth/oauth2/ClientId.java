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
    public final String f52408a;

    /* renamed from: b */
    public final String f52409b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f52410a;

        /* renamed from: b */
        public String f52411b;

        public Builder() {
        }

        public ClientId build() {
            return new ClientId(this.f52410a, this.f52411b);
        }

        public String getClientSecret() {
            return this.f52411b;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            this.f52410a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientSecret(String str) {
            this.f52411b = str;
            return this;
        }

        public Builder(ClientId clientId) {
            this.f52410a = clientId.getClientId();
            this.f52411b = clientId.getClientSecret();
        }
    }

    public static ClientId fromJson(Map<String, Object> map) throws IOException {
        Object obj = map.get("installed");
        if (obj == null) {
            obj = map.get("web");
        }
        if (obj != null && (obj instanceof Map)) {
            Map map2 = (Map) obj;
            String m68789j = CJ0.m68789j(map2, "client_id", "Error parsing Client ID JSON: ");
            if (m68789j != null && m68789j.length() != 0) {
                return new ClientId(m68789j, CJ0.m68790i(map2, "client_secret", "Error parsing Client ID JSON: "));
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
        return fromJson((GenericJson) new JsonObjectParser(CJ0.f695f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* renamed from: of */
    public static ClientId m41679of(String str, String str2) {
        return new ClientId(str, str2);
    }

    public final String getClientId() {
        return this.f52408a;
    }

    public final String getClientSecret() {
        return this.f52409b;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public ClientId(String str, String str2) {
        this.f52408a = (String) Preconditions.checkNotNull(str);
        this.f52409b = str2;
    }
}
