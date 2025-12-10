package com.google.auth.oauth2;

import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.ExecutableHandler;
import com.google.auth.oauth2.ExternalAccountCredentials;
import com.google.auth.oauth2.StsTokenExchangeRequest;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class PluggableAuthCredentials extends ExternalAccountCredentials {
    static final String PLUGGABLE_AUTH_METRICS_HEADER_VALUE = "executable";
    private final PluggableAuthCredentialSource config;
    private final ExecutableHandler handler;

    /* loaded from: classes4.dex */
    public static class Builder extends ExternalAccountCredentials.Builder {

        /* renamed from: d */
        public ExecutableHandler f52508d;

        public Builder() {
        }

        @CanIgnoreReturnValue
        public Builder setCredentialSource(PluggableAuthCredentialSource pluggableAuthCredentialSource) {
            super.setCredentialSource((ExternalAccountCredentials.CredentialSource) pluggableAuthCredentialSource);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setExecutableHandler(ExecutableHandler executableHandler) {
            this.f52508d = executableHandler;
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

        public Builder(PluggableAuthCredentials pluggableAuthCredentials) {
            super(pluggableAuthCredentials);
            this.f52508d = pluggableAuthCredentials.handler;
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
        public PluggableAuthCredentials build() {
            return new PluggableAuthCredentials(this);
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setSubjectTokenType(ExternalAccountCredentials.SubjectTokenTypes subjectTokenTypes) {
            super.setSubjectTokenType(subjectTokenTypes);
            return this;
        }
    }

    /* renamed from: com.google.auth.oauth2.PluggableAuthCredentials$a */
    /* loaded from: classes4.dex */
    public class C7345a implements ExecutableHandler.ExecutableOptions {

        /* renamed from: a */
        public final /* synthetic */ String f52509a;

        /* renamed from: b */
        public final /* synthetic */ Map f52510b;

        /* renamed from: c */
        public final /* synthetic */ int f52511c;

        /* renamed from: d */
        public final /* synthetic */ String f52512d;

        public C7345a(String str, Map map, int i, String str2) {
            this.f52509a = str;
            this.f52510b = map;
            this.f52511c = i;
            this.f52512d = str2;
        }

        @Override // com.google.auth.oauth2.ExecutableHandler.ExecutableOptions
        public Map getEnvironmentMap() {
            return this.f52510b;
        }

        @Override // com.google.auth.oauth2.ExecutableHandler.ExecutableOptions
        public String getExecutableCommand() {
            return this.f52509a;
        }

        @Override // com.google.auth.oauth2.ExecutableHandler.ExecutableOptions
        public int getExecutableTimeoutMs() {
            return this.f52511c;
        }

        @Override // com.google.auth.oauth2.ExecutableHandler.ExecutableOptions
        public String getOutputFilePath() {
            return this.f52512d;
        }
    }

    public PluggableAuthCredentials(Builder builder) {
        super(builder);
        this.config = (PluggableAuthCredentialSource) builder.credentialSource;
        if (builder.f52508d != null) {
            this.handler = builder.f52508d;
        } else {
            this.handler = new C7366f(getEnvironmentProvider());
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
        return PLUGGABLE_AUTH_METRICS_HEADER_VALUE;
    }

    @VisibleForTesting
    @Nullable
    public ExecutableHandler getExecutableHandler() {
        return this.handler;
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
        String command = this.config.getCommand();
        String outputFilePath = this.config.getOutputFilePath();
        int timeoutMs = this.config.getTimeoutMs();
        HashMap hashMap = new HashMap();
        hashMap.put("GOOGLE_EXTERNAL_ACCOUNT_AUDIENCE", getAudience());
        hashMap.put("GOOGLE_EXTERNAL_ACCOUNT_TOKEN_TYPE", getSubjectTokenType());
        hashMap.put("GOOGLE_EXTERNAL_ACCOUNT_INTERACTIVE", "0");
        if (getServiceAccountEmail() != null) {
            hashMap.put("GOOGLE_EXTERNAL_ACCOUNT_IMPERSONATED_EMAIL", getServiceAccountEmail());
        }
        if (outputFilePath != null && !outputFilePath.isEmpty()) {
            hashMap.put("GOOGLE_EXTERNAL_ACCOUNT_OUTPUT_FILE", outputFilePath);
        }
        return this.handler.mo41472a(new C7345a(command, hashMap, timeoutMs, outputFilePath));
    }

    public static Builder newBuilder(PluggableAuthCredentials pluggableAuthCredentials) {
        return new Builder(pluggableAuthCredentials);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public PluggableAuthCredentials createScoped(Collection<String> collection) {
        return new PluggableAuthCredentials(newBuilder(this).setScopes(collection));
    }
}