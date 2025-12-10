package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.auth.Credentials;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.OAuth2Credentials;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class GoogleCredentials extends OAuth2Credentials implements QuotaProjectIdProvider {
    static final String GDCH_SERVICE_ACCOUNT_FILE_TYPE = "gdch_service_account";
    static final String QUOTA_PROJECT_ID_HEADER_KEY = "x-goog-user-project";
    static final String SERVICE_ACCOUNT_FILE_TYPE = "service_account";
    static final String USER_FILE_TYPE = "authorized_user";
    private static final C7374c defaultCredentialsProvider = new C7374c();
    private static final long serialVersionUID = -1522852442442473691L;
    private final boolean isExplicitUniverseDomain;
    protected final String quotaProjectId;
    private final String universeDomain;

    /* loaded from: classes4.dex */
    public static class Builder extends OAuth2Credentials.Builder {
        @Nullable
        protected String quotaProjectId;
        @Nullable
        protected String universeDomain;

        public Builder() {
        }

        public String getQuotaProjectId() {
            return this.quotaProjectId;
        }

        public String getUniverseDomain() {
            return this.universeDomain;
        }

        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            this.quotaProjectId = str;
            return this;
        }

        public Builder setUniverseDomain(String str) {
            this.universeDomain = str;
            return this;
        }

        public Builder(GoogleCredentials googleCredentials) {
            super(googleCredentials);
            this.quotaProjectId = googleCredentials.quotaProjectId;
            if (googleCredentials.isExplicitUniverseDomain) {
                this.universeDomain = googleCredentials.universeDomain;
            }
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        public GoogleCredentials build() {
            return new GoogleCredentials(this);
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        @CanIgnoreReturnValue
        public Builder setAccessToken(AccessToken accessToken) {
            super.setAccessToken(accessToken);
            return this;
        }

        public Builder(Builder builder) {
            setAccessToken(builder.getAccessToken());
            this.quotaProjectId = builder.quotaProjectId;
            this.universeDomain = builder.universeDomain;
        }
    }

    public GoogleCredentials() {
        this(new Builder());
    }

    public static Map<String, List<String>> addQuotaProjectIdToRequestMetadata(String str, Map<String, List<String>> map) {
        Preconditions.checkNotNull(map);
        HashMap hashMap = new HashMap(map);
        if (str != null && !map.containsKey(QUOTA_PROJECT_ID_HEADER_KEY)) {
            hashMap.put(QUOTA_PROJECT_ID_HEADER_KEY, Collections.singletonList(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static GoogleCredentials create(AccessToken accessToken) {
        return newBuilder().setAccessToken(accessToken).build();
    }

    public static GoogleCredentials fromStream(InputStream inputStream) throws IOException {
        return fromStream(inputStream, CJ0.f694e);
    }

    public static GoogleCredentials getApplicationDefault() throws IOException {
        return getApplicationDefault(CJ0.f694e);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public GoogleCredentials createDelegated(String str) {
        return this;
    }

    public GoogleCredentials createScoped(Collection<String> collection) {
        return this;
    }

    public boolean createScopedRequired() {
        return false;
    }

    public GoogleCredentials createWithCustomRetryStrategy(boolean z) {
        return this;
    }

    public GoogleCredentials createWithQuotaProject(String str) {
        return toBuilder().setQuotaProjectId(str).build();
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof GoogleCredentials)) {
            return false;
        }
        GoogleCredentials googleCredentials = (GoogleCredentials) obj;
        if (!Objects.equals(this.quotaProjectId, googleCredentials.quotaProjectId) || !Objects.equals(this.universeDomain, googleCredentials.universeDomain) || !Boolean.valueOf(this.isExplicitUniverseDomain).equals(Boolean.valueOf(googleCredentials.isExplicitUniverseDomain))) {
            return false;
        }
        return true;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public Map<String, List<String>> getAdditionalHeaders() {
        Map<String, List<String>> additionalHeaders = super.getAdditionalHeaders();
        String quotaProjectId = getQuotaProjectId();
        if (quotaProjectId != null) {
            return addQuotaProjectIdToRequestMetadata(quotaProjectId, additionalHeaders);
        }
        return additionalHeaders;
    }

    @Override // com.google.auth.oauth2.QuotaProjectIdProvider
    public String getQuotaProjectId() {
        return this.quotaProjectId;
    }

    @Override // com.google.auth.Credentials
    public String getUniverseDomain() throws IOException {
        return this.universeDomain;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(this.quotaProjectId, this.universeDomain, Boolean.valueOf(this.isExplicitUniverseDomain));
    }

    public boolean isDefaultUniverseDomain() throws IOException {
        return getUniverseDomain().equals(Credentials.GOOGLE_DEFAULT_UNIVERSE);
    }

    @VisibleForTesting
    public boolean isExplicitUniverseDomain() {
        return this.isExplicitUniverseDomain;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public String toString() {
        return toStringHelper().toString();
    }

    public MoreObjects.ToStringHelper toStringHelper() {
        return MoreObjects.toStringHelper(this).omitNullValues().add("quotaProjectId", this.quotaProjectId).add("universeDomain", this.universeDomain).add("isExplicitUniverseDomain", this.isExplicitUniverseDomain);
    }

    @Deprecated
    public GoogleCredentials(AccessToken accessToken, String str) {
        this(newBuilder().setAccessToken(accessToken).setQuotaProjectId(str));
    }

    public static GoogleCredentials create(String str, AccessToken accessToken) {
        return newBuilder().setAccessToken(accessToken).setUniverseDomain(str).build();
    }

    public static GoogleCredentials fromStream(InputStream inputStream, HttpTransportFactory httpTransportFactory) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(httpTransportFactory);
        GenericJson genericJson = (GenericJson) new JsonObjectParser(CJ0.f695f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class);
        String str = (String) genericJson.get("type");
        if (str != null) {
            if (USER_FILE_TYPE.equals(str)) {
                return UserCredentials.fromJson(genericJson, httpTransportFactory);
            }
            if (SERVICE_ACCOUNT_FILE_TYPE.equals(str)) {
                return ServiceAccountCredentials.fromJson(genericJson, httpTransportFactory);
            }
            if (GDCH_SERVICE_ACCOUNT_FILE_TYPE.equals(str)) {
                return GdchCredentials.fromJson(genericJson);
            }
            if ("external_account".equals(str)) {
                return ExternalAccountCredentials.fromJson(genericJson, httpTransportFactory);
            }
            if ("external_account_authorized_user".equals(str)) {
                return ExternalAccountAuthorizedUserCredentials.fromJson(genericJson, httpTransportFactory);
            }
            if ("impersonated_service_account".equals(str)) {
                return ImpersonatedCredentials.fromJson(genericJson, httpTransportFactory);
            }
            throw new IOException(String.format("Error reading credentials from stream, 'type' value '%s' not recognized. Valid values are '%s', '%s', '%s', '%s', '%s', '%s'.", str, USER_FILE_TYPE, SERVICE_ACCOUNT_FILE_TYPE, GDCH_SERVICE_ACCOUNT_FILE_TYPE, "external_account", "external_account_authorized_user", "impersonated_service_account"));
        }
        throw new IOException("Error reading credentials from stream, 'type' field not specified.");
    }

    public static GoogleCredentials getApplicationDefault(HttpTransportFactory httpTransportFactory) throws IOException {
        Preconditions.checkNotNull(httpTransportFactory);
        return defaultCredentialsProvider.m41515b(httpTransportFactory);
    }

    public GoogleCredentials createScoped(Collection<String> collection, Collection<String> collection2) {
        return this;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }

    public GoogleCredentials createScoped(String... strArr) {
        return createScoped(ImmutableList.copyOf(strArr));
    }

    @Deprecated
    public GoogleCredentials(AccessToken accessToken) {
        this(accessToken, null);
    }

    public GoogleCredentials(Builder builder) {
        super(builder.getAccessToken(), builder.getRefreshMargin(), builder.getExpirationMargin());
        this.quotaProjectId = builder.getQuotaProjectId();
        String str = builder.universeDomain;
        if (str != null && !str.trim().isEmpty()) {
            this.universeDomain = builder.getUniverseDomain();
            this.isExplicitUniverseDomain = true;
            return;
        }
        this.universeDomain = Credentials.GOOGLE_DEFAULT_UNIVERSE;
        this.isExplicitUniverseDomain = false;
    }

    @Deprecated
    public GoogleCredentials(AccessToken accessToken, Duration duration, Duration duration2) {
        this((Builder) newBuilder().setAccessToken(accessToken).setRefreshMargin(duration).setExpirationMargin(duration2));
    }
}
