package com.google.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.api.client.json.GenericJson;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.ExternalAccountCredentials;
import com.google.auth.oauth2.StsTokenExchangeRequest;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class AwsCredentials extends ExternalAccountCredentials {
    static final String AWS_METRICS_HEADER_VALUE = "aws";
    static final String DEFAULT_REGIONAL_CREDENTIAL_VERIFICATION_URL = "https://sts.{region}.amazonaws.com?Action=GetCallerIdentity&Version=2011-06-15";
    private static final long serialVersionUID = -3670131891574618105L;
    private final AwsSecurityCredentialsSupplier awsSecurityCredentialsSupplier;
    private final String metricsHeaderValue;
    @Nullable
    private final String regionalCredentialVerificationUrl;
    @Nullable
    private final String regionalCredentialVerificationUrlOverride;
    private final ExternalAccountSupplierContext supplierContext;

    /* loaded from: classes4.dex */
    public static class Builder extends ExternalAccountCredentials.Builder {

        /* renamed from: d */
        public AwsSecurityCredentialsSupplier f52403d;

        /* renamed from: e */
        public String f52404e;

        public Builder() {
        }

        @CanIgnoreReturnValue
        public Builder setAwsSecurityCredentialsSupplier(AwsSecurityCredentialsSupplier awsSecurityCredentialsSupplier) {
            this.f52403d = awsSecurityCredentialsSupplier;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCredentialSource(AwsCredentialSource awsCredentialSource) {
            super.setCredentialSource((ExternalAccountCredentials.CredentialSource) awsCredentialSource);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRegionalCredentialVerificationUrlOverride(String str) {
            this.f52404e = str;
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

        public Builder(AwsCredentials awsCredentials) {
            super(awsCredentials);
            if (this.credentialSource == null) {
                this.f52403d = awsCredentials.awsSecurityCredentialsSupplier;
            }
            this.f52404e = awsCredentials.regionalCredentialVerificationUrlOverride;
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
        public AwsCredentials build() {
            return new AwsCredentials(this);
        }

        @Override // com.google.auth.oauth2.ExternalAccountCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setSubjectTokenType(ExternalAccountCredentials.SubjectTokenTypes subjectTokenTypes) {
            super.setSubjectTokenType(subjectTokenTypes);
            return this;
        }
    }

    public AwsCredentials(Builder builder) {
        super(builder);
        this.supplierContext = ExternalAccountSupplierContext.newBuilder().m41659b(getAudience()).m41658c(getSubjectTokenType()).m41660a();
        if (builder.f52403d != null && builder.credentialSource != null) {
            throw new IllegalArgumentException("AwsCredentials cannot have both an awsSecurityCredentialsSupplier and a credentialSource.");
        }
        if (builder.f52403d == null && builder.credentialSource == null) {
            throw new IllegalArgumentException("An awsSecurityCredentialsSupplier or a credentialSource must be provided.");
        }
        AwsCredentialSource awsCredentialSource = (AwsCredentialSource) builder.credentialSource;
        String str = builder.f52404e;
        this.regionalCredentialVerificationUrlOverride = str;
        if (str != null) {
            this.regionalCredentialVerificationUrl = str;
        } else if (awsCredentialSource != null) {
            this.regionalCredentialVerificationUrl = awsCredentialSource.regionalCredentialVerificationUrl;
        } else {
            this.regionalCredentialVerificationUrl = DEFAULT_REGIONAL_CREDENTIAL_VERIFICATION_URL;
        }
        if (builder.f52403d != null) {
            this.awsSecurityCredentialsSupplier = builder.f52403d;
            this.metricsHeaderValue = "programmatic";
            return;
        }
        this.awsSecurityCredentialsSupplier = new InternalAwsSecurityCredentialsSupplier(awsCredentialSource, getEnvironmentProvider(), this.transportFactory);
        this.metricsHeaderValue = AWS_METRICS_HEADER_VALUE;
    }

    private String buildSubjectToken(C7368a c7368a) throws UnsupportedEncodingException {
        Map m41540b = c7368a.m41540b();
        ArrayList arrayList = new ArrayList();
        for (String str : m41540b.keySet()) {
            arrayList.add(formatTokenHeaderForSts(str, (String) m41540b.get(str)));
        }
        arrayList.add(formatTokenHeaderForSts("Authorization", c7368a.m41541a()));
        arrayList.add(formatTokenHeaderForSts("x-goog-cloud-target-resource", getAudience()));
        GenericJson genericJson = new GenericJson();
        genericJson.setFactory(CJ0.f695f);
        genericJson.put("headers", (Object) arrayList);
        genericJson.put(FirebaseAnalytics.Param.METHOD, (Object) c7368a.m41539c());
        genericJson.put(ImagesContract.URL, (Object) this.regionalCredentialVerificationUrl.replace("{region}", c7368a.m41538d()));
        return URLEncoder.encode(genericJson.toString(), "UTF-8");
    }

    private static GenericJson formatTokenHeaderForSts(String str, String str2) {
        GenericJson genericJson = new GenericJson();
        genericJson.setFactory(CJ0.f695f);
        genericJson.put(Action.KEY_ATTRIBUTE, (Object) str);
        genericJson.put("value", (Object) str2);
        return genericJson;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public GoogleCredentials createScoped(Collection<String> collection) {
        return new AwsCredentials(newBuilder(this).setScopes(collection));
    }

    @VisibleForTesting
    public AwsSecurityCredentialsSupplier getAwsSecurityCredentialsSupplier() {
        return this.awsSecurityCredentialsSupplier;
    }

    @Override // com.google.auth.oauth2.ExternalAccountCredentials
    public String getCredentialSourceType() {
        return this.metricsHeaderValue;
    }

    @VisibleForTesting
    public String getEnv(String str) {
        return System.getenv(str);
    }

    @VisibleForTesting
    public String getRegionalCredentialVerificationUrl() {
        return this.regionalCredentialVerificationUrl;
    }

    @Nullable
    public String getRegionalCredentialVerificationUrlOverride() {
        return this.regionalCredentialVerificationUrlOverride;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        StsTokenExchangeRequest.Builder audience = StsTokenExchangeRequest.m41593n(retrieveSubjectToken(), getSubjectTokenType()).setAudience(getAudience());
        Collection<String> scopes = getScopes();
        if (scopes != null && !scopes.isEmpty()) {
            audience.setScopes(new ArrayList(scopes));
        }
        return exchangeExternalCredentialForAccessToken(audience.build());
    }

    @Override // com.google.auth.oauth2.ExternalAccountCredentials
    public String retrieveSubjectToken() throws IOException {
        String region = this.awsSecurityCredentialsSupplier.getRegion(this.supplierContext);
        AwsSecurityCredentials credentials = this.awsSecurityCredentialsSupplier.getCredentials(this.supplierContext);
        HashMap hashMap = new HashMap();
        hashMap.put("x-goog-cloud-target-resource", getAudience());
        return buildSubjectToken(C7371b.m41521g(credentials, "POST", this.regionalCredentialVerificationUrl.replace("{region}", region), region).m41517b(hashMap).m41518a().m41520h());
    }

    public static Builder newBuilder(AwsCredentials awsCredentials) {
        return new Builder(awsCredentials);
    }
}
