package com.google.auth.oauth2;

import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.ExternalAccountCredentials;
import com.google.auth.oauth2.IdentityPoolCredentialSource;
import com.google.auth.oauth2.StsTokenExchangeRequest;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public class IdentityPoolCredentials extends ExternalAccountCredentials {
    static final String FILE_METRICS_HEADER_VALUE = "file";
    static final String URL_METRICS_HEADER_VALUE = "url";
    private static final long serialVersionUID = 2471046175477275881L;
    private final String metricsHeaderValue;
    private final IdentityPoolSubjectTokenSupplier subjectTokenSupplier;
    private final ExternalAccountSupplierContext supplierContext;

    /* loaded from: classes4.dex */
    public static class Builder extends ExternalAccountCredentials.Builder {

        /* renamed from: d */
        public IdentityPoolSubjectTokenSupplier f52476d;

        public Builder() {
        }

        @CanIgnoreReturnValue
        public Builder setCredentialSource(IdentityPoolCredentialSource identityPoolCredentialSource) {
            super.setCredentialSource((ExternalAccountCredentials.CredentialSource) identityPoolCredentialSource);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ExternalAccountCredentials.Builder setScopes(Collection collection) {
            return setScopes((Collection<String>) collection);
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ExternalAccountCredentials.Builder setServiceAccountImpersonationOptions(Map map) {
            return setServiceAccountImpersonationOptions((Map<String, Object>) map);
        }

        @CanIgnoreReturnValue
        public Builder setSubjectTokenSupplier(IdentityPoolSubjectTokenSupplier identityPoolSubjectTokenSupplier) {
            this.f52476d = identityPoolSubjectTokenSupplier;
            return this;
        }

        public Builder(IdentityPoolCredentials identityPoolCredentials) {
            super(identityPoolCredentials);
            if (this.credentialSource == null) {
                this.f52476d = identityPoolCredentials.subjectTokenSupplier;
            }
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setAudience(String str) {
            super.setAudience(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            super.setClientId(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setClientSecret(String str) {
            super.setClientSecret(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            super.setHttpTransportFactory(httpTransportFactory);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setScopes(Collection<String> collection) {
            super.setScopes(collection);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setServiceAccountImpersonationOptions(Map<String, Object> map) {
            super.setServiceAccountImpersonationOptions(map);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setServiceAccountImpersonationUrl(String str) {
            super.setServiceAccountImpersonationUrl(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setTokenInfoUrl(String str) {
            super.setTokenInfoUrl(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setTokenUrl(String str) {
            super.setTokenUrl(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setWorkforcePoolUserProject(String str) {
            super.setWorkforcePoolUserProject(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder, com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            super.setQuotaProjectId(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setSubjectTokenType(String str) {
            super.setSubjectTokenType(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder, com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setUniverseDomain(String str) {
            super.setUniverseDomain(str);
            return this;
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder, com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public IdentityPoolCredentials build() {
            return new IdentityPoolCredentials(this);
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setSubjectTokenType(ExternalAccountCredentials.SubjectTokenTypes subjectTokenTypes) {
            super.setSubjectTokenType(subjectTokenTypes);
            return this;
        }
    }

    public IdentityPoolCredentials(Builder builder) {
        super(builder);
        IdentityPoolCredentialSource identityPoolCredentialSource = (IdentityPoolCredentialSource) builder.credentialSource;
        this.supplierContext = ExternalAccountSupplierContext.newBuilder().m41646b(getAudience()).m41645c(getSubjectTokenType()).m41647a();
        if (builder.f52476d != null && identityPoolCredentialSource != null) {
            throw new IllegalArgumentException("IdentityPoolCredentials cannot have both a subjectTokenSupplier and a credentialSource.");
        }
        if (builder.f52476d == null && identityPoolCredentialSource == null) {
            throw new IllegalArgumentException("A subjectTokenSupplier or a credentialSource must be provided.");
        }
        if (builder.f52476d != null) {
            this.subjectTokenSupplier = builder.f52476d;
            this.metricsHeaderValue = "programmatic";
        } else if (identityPoolCredentialSource.credentialSourceType == IdentityPoolCredentialSource.IdentityPoolCredentialSourceType.FILE) {
            this.subjectTokenSupplier = new FileIdentityPoolSubjectTokenSupplier(identityPoolCredentialSource);
            this.metricsHeaderValue = "file";
        } else {
            this.subjectTokenSupplier = new UrlIdentityPoolSubjectTokenSupplier(identityPoolCredentialSource, this.transportFactory);
            this.metricsHeaderValue = "url";
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public /* bridge */ /* synthetic */ GoogleCredentials createScoped(Collection collection) {
        return createScoped((Collection<String>) collection);
    }

    @Override // com.google.auth.oauth2.ExternalAccountCredentials
    public String getCredentialSourceType() {
        return this.metricsHeaderValue;
    }

    @VisibleForTesting
    public IdentityPoolSubjectTokenSupplier getIdentityPoolSubjectTokenSupplier() {
        return this.subjectTokenSupplier;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        StsTokenExchangeRequest.Builder audience = StsTokenExchangeRequest.m41580n(retrieveSubjectToken(), getSubjectTokenType()).setAudience(getAudience());
        Collection<String> scopes = getScopes();
        if (scopes != null && !scopes.isEmpty()) {
            audience.setScopes(new ArrayList(scopes));
        }
        return exchangeExternalCredentialForAccessToken(audience.build());
    }

    @Override // com.google.auth.oauth2.ExternalAccountCredentials
    public String retrieveSubjectToken() throws IOException {
        return this.subjectTokenSupplier.getSubjectToken(this.supplierContext);
    }

    public static Builder newBuilder(IdentityPoolCredentials identityPoolCredentials) {
        return new Builder(identityPoolCredentials);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public IdentityPoolCredentials createScoped(Collection<String> collection) {
        return new IdentityPoolCredentials(newBuilder(this).setScopes(collection));
    }
}