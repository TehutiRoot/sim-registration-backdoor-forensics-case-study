package com.google.auth.oauth2;

import com.google.api.client.http.HttpRequest;
import com.google.auth.CredentialTypeForMetrics;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes4.dex */
public abstract class MetricsUtils {

    /* renamed from: a */
    public static final String f52479a = m41642a();

    /* renamed from: b */
    public static final String f52480b = System.getProperty("java.version");

    /* loaded from: classes4.dex */
    public enum RequestType {
        ACCESS_TOKEN_REQUEST("at"),
        ID_TOKEN_REQUEST("it"),
        METADATA_SERVER_PING("mds"),
        UNTRACKED("untracked");
        
        private final String label;

        RequestType(String str) {
            this.label = str;
        }

        public String getLabel() {
            return this.label;
        }
    }

    /* renamed from: a */
    public static String m41642a() {
        String str = "unknown-version";
        try {
            InputStream resourceAsStream = MetricsUtils.class.getResourceAsStream("/com/google/auth/oauth2/google-auth-library.properties");
            if (resourceAsStream != null) {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                str = properties.getProperty("google-auth-library.version");
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return str;
    }

    /* renamed from: b */
    public static String m41641b(RequestType requestType, CredentialTypeForMetrics credentialTypeForMetrics) {
        StringBuilder sb = new StringBuilder(m41640c());
        if (requestType != RequestType.UNTRACKED) {
            sb.append(String.format(" %s/%s", "auth-request-type", requestType.getLabel()));
        }
        if (credentialTypeForMetrics != CredentialTypeForMetrics.DO_NOT_SEND) {
            sb.append(String.format(" %s/%s", "cred-type", credentialTypeForMetrics.getLabel()));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m41640c() {
        return String.format("gl-java/%s auth/%s", f52480b, f52479a);
    }

    /* renamed from: d */
    public static void m41639d(HttpRequest httpRequest, String str) {
        httpRequest.getHeaders().set("x-goog-api-client", (Object) str);
    }
}
