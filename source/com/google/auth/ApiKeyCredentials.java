package com.google.auth;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ApiKeyCredentials extends Credentials {
    static final String API_KEY_HEADER_KEY = "x-goog-api-key";
    private final String apiKey;

    public ApiKeyCredentials(String str) {
        this.apiKey = str;
    }

    public static ApiKeyCredentials create(String str) {
        if (str != null && !str.isEmpty()) {
            return new ApiKeyCredentials(str);
        }
        throw new IllegalArgumentException("API key cannot be null or blank");
    }

    @Override // com.google.auth.Credentials
    public String getAuthenticationType() {
        return "API-Key";
    }

    @Override // com.google.auth.Credentials
    public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
        return Collections.singletonMap(API_KEY_HEADER_KEY, Collections.singletonList(this.apiKey));
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadata() {
        return true;
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadataOnly() {
        return true;
    }

    @Override // com.google.auth.Credentials
    public void refresh() throws IOException {
    }
}
