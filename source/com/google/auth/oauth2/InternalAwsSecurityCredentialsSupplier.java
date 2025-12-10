package com.google.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.json.GenericJson;
import com.google.auth.http.HttpTransportFactory;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class InternalAwsSecurityCredentialsSupplier implements AwsSecurityCredentialsSupplier {
    static final String AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID";
    static final String AWS_DEFAULT_REGION = "AWS_DEFAULT_REGION";
    static final String AWS_IMDSV2_SESSION_TOKEN_HEADER = "x-aws-ec2-metadata-token";
    static final String AWS_IMDSV2_SESSION_TOKEN_TTL = "300";
    static final String AWS_IMDSV2_SESSION_TOKEN_TTL_HEADER = "x-aws-ec2-metadata-token-ttl-seconds";
    static final String AWS_REGION = "AWS_REGION";
    static final String AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY";
    static final String AWS_SESSION_TOKEN = "AWS_SESSION_TOKEN";
    private static final long serialVersionUID = 4438370785261365013L;
    private final AwsCredentialSource awsCredentialSource;
    private InterfaceC0599IS environmentProvider;
    private transient HttpTransportFactory transportFactory;

    public InternalAwsSecurityCredentialsSupplier(AwsCredentialSource awsCredentialSource, InterfaceC0599IS interfaceC0599IS, HttpTransportFactory httpTransportFactory) {
        this.environmentProvider = interfaceC0599IS;
        this.awsCredentialSource = awsCredentialSource;
        this.transportFactory = httpTransportFactory;
    }

    private boolean canRetrieveRegionFromEnvironment() {
        for (String str : ImmutableList.m40996of(AWS_REGION, AWS_DEFAULT_REGION)) {
            String env = this.environmentProvider.getEnv(str);
            if (env != null && env.trim().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean canRetrieveSecurityCredentialsFromEnvironment() {
        /*
            r3 = this;
            java.lang.String r0 = "AWS_ACCESS_KEY_ID"
            java.lang.String r1 = "AWS_SECRET_ACCESS_KEY"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m40996of(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            IS r2 = r3.environmentProvider
            java.lang.String r1 = r2.getEnv(r1)
            if (r1 == 0) goto L2a
            java.lang.String r1 = r1.trim()
            int r1 = r1.length()
            if (r1 != 0) goto Lc
        L2a:
            r0 = 0
            return r0
        L2c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.auth.oauth2.InternalAwsSecurityCredentialsSupplier.canRetrieveSecurityCredentialsFromEnvironment():boolean");
    }

    private String retrieveResource(String str, String str2, Map<String, Object> map) throws IOException {
        return retrieveResource(str, str2, "GET", map, null);
    }

    @VisibleForTesting
    public Map<String, Object> createMetadataRequestHeaders(AwsCredentialSource awsCredentialSource) throws IOException {
        HashMap hashMap = new HashMap();
        if (awsCredentialSource.imdsv2SessionTokenUrl != null) {
            hashMap.put(AWS_IMDSV2_SESSION_TOKEN_HEADER, retrieveResource(awsCredentialSource.imdsv2SessionTokenUrl, "Session Token", "PUT", new HashMap<String, Object>() { // from class: com.google.auth.oauth2.InternalAwsSecurityCredentialsSupplier.1
                {
                    put(InternalAwsSecurityCredentialsSupplier.AWS_IMDSV2_SESSION_TOKEN_TTL_HEADER, InternalAwsSecurityCredentialsSupplier.AWS_IMDSV2_SESSION_TOKEN_TTL);
                }
            }, null));
        }
        return hashMap;
    }

    @Override // com.google.auth.oauth2.AwsSecurityCredentialsSupplier
    public AwsSecurityCredentials getCredentials(ExternalAccountSupplierContext externalAccountSupplierContext) throws IOException {
        if (canRetrieveSecurityCredentialsFromEnvironment()) {
            return new AwsSecurityCredentials(this.environmentProvider.getEnv(AWS_ACCESS_KEY_ID), this.environmentProvider.getEnv(AWS_SECRET_ACCESS_KEY), this.environmentProvider.getEnv(AWS_SESSION_TOKEN));
        }
        Map<String, Object> createMetadataRequestHeaders = createMetadataRequestHeaders(this.awsCredentialSource);
        String str = this.awsCredentialSource.url;
        if (str != null && !str.isEmpty()) {
            String retrieveResource = retrieveResource(this.awsCredentialSource.url, "IAM role", createMetadataRequestHeaders);
            GenericJson genericJson = (GenericJson) CJ0.f695f.createJsonParser(retrieveResource(this.awsCredentialSource.url + RemoteSettings.FORWARD_SLASH_STRING + retrieveResource, "credentials", createMetadataRequestHeaders)).parseAndClose((Class<Object>) GenericJson.class);
            return new AwsSecurityCredentials((String) genericJson.get("AccessKeyId"), (String) genericJson.get("SecretAccessKey"), (String) genericJson.get("Token"));
        }
        throw new IOException("Unable to determine the AWS IAM role name. The credential source does not contain the url field.");
    }

    @Override // com.google.auth.oauth2.AwsSecurityCredentialsSupplier
    public String getRegion(ExternalAccountSupplierContext externalAccountSupplierContext) throws IOException {
        if (canRetrieveRegionFromEnvironment()) {
            String env = this.environmentProvider.getEnv(AWS_REGION);
            if (env != null && env.trim().length() > 0) {
                return env;
            }
            return this.environmentProvider.getEnv(AWS_DEFAULT_REGION);
        }
        Map<String, Object> createMetadataRequestHeaders = createMetadataRequestHeaders(this.awsCredentialSource);
        String str = this.awsCredentialSource.regionUrl;
        if (str != null && !str.isEmpty()) {
            String retrieveResource = retrieveResource(this.awsCredentialSource.regionUrl, "region", createMetadataRequestHeaders);
            return retrieveResource.substring(0, retrieveResource.length() - 1);
        }
        throw new IOException("Unable to determine the AWS region. The credential source does not contain the region URL.");
    }

    @VisibleForTesting
    public boolean shouldUseMetadataServer() {
        if (canRetrieveRegionFromEnvironment() && canRetrieveSecurityCredentialsFromEnvironment()) {
            return false;
        }
        return true;
    }

    private String retrieveResource(String str, String str2, String str3, Map<String, Object> map, @Nullable HttpContent httpContent) throws IOException {
        try {
            HttpRequest buildRequest = this.transportFactory.create().createRequestFactory().buildRequest(str3, new GenericUrl(str), httpContent);
            HttpHeaders headers = buildRequest.getHeaders();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                headers.set(entry.getKey(), entry.getValue());
            }
            return buildRequest.execute().parseAsString();
        } catch (IOException e) {
            throw new IOException(String.format("Failed to retrieve AWS %s.", str2), e);
        }
    }
}
