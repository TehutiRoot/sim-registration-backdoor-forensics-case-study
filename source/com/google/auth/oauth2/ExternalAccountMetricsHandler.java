package com.google.auth.oauth2;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ExternalAccountMetricsHandler implements Serializable {
    private static final String BYOID_METRICS_SECTION = "google-byoid-sdk";
    private static final String CONFIG_LIFETIME_KEY = "config-lifetime";
    private static final String IMPERSONATION_KEY = "sa-impersonation";
    private static final String SOURCE_KEY = "source";
    private final boolean configLifetime;
    private ExternalAccountCredentials credentials;
    private final boolean saImpersonation;

    public ExternalAccountMetricsHandler(ExternalAccountCredentials externalAccountCredentials) {
        boolean z;
        if (externalAccountCredentials.getServiceAccountImpersonationUrl() != null) {
            z = true;
        } else {
            z = false;
        }
        this.saImpersonation = z;
        this.configLifetime = externalAccountCredentials.getServiceAccountImpersonationOptions().customTokenLifetimeRequested;
        this.credentials = externalAccountCredentials;
    }

    public String getExternalAccountMetricsHeader() {
        return String.format("%s %s %s/%s %s/%s %s/%s", MetricsUtils.m41640c(), BYOID_METRICS_SECTION, "source", this.credentials.getCredentialSourceType(), IMPERSONATION_KEY, Boolean.valueOf(this.saImpersonation), CONFIG_LIFETIME_KEY, Boolean.valueOf(this.configLifetime));
    }
}
