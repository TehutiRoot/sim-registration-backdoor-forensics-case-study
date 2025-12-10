package com.google.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpBackOffIOExceptionHandler;
import com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.GenericData;
import com.google.auth.CredentialTypeForMetrics;
import com.google.auth.Credentials;
import com.google.auth.ServiceAccountSigner;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.AbstractC7376e;
import com.google.auth.oauth2.MetricsUtils;
import com.google.common.p014io.BaseEncoding;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.auth.oauth2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7376e {

    /* renamed from: a */
    public static final Set f52672a = new HashSet(Arrays.asList(500, 502, 503, 504));

    /* renamed from: a */
    public static /* synthetic */ boolean m41490a(HttpResponse httpResponse) {
        return m41487d(httpResponse);
    }

    /* renamed from: b */
    public static IdToken m41489b(String str, Credentials credentials, HttpTransport httpTransport, String str2, boolean z, Map map, CredentialTypeForMetrics credentialTypeForMetrics) {
        GenericUrl genericUrl = new GenericUrl(String.format("https://iamcredentials.googleapis.com/v1/projects/-/serviceAccounts/%s:generateIdToken", str));
        GenericData genericData = new GenericData();
        genericData.set("audience", str2);
        genericData.set("includeEmail", Boolean.valueOf(z));
        for (Map.Entry entry : map.entrySet()) {
            genericData.set((String) entry.getKey(), entry.getValue());
        }
        JsonFactory jsonFactory = CJ0.f695f;
        HttpRequest buildPostRequest = httpTransport.createRequestFactory(new HttpCredentialsAdapter(credentials)).buildPostRequest(genericUrl, new JsonHttpContent(jsonFactory, genericData));
        buildPostRequest.setParser(new JsonObjectParser(jsonFactory));
        buildPostRequest.setThrowExceptionOnExecuteError(false);
        MetricsUtils.m41639d(buildPostRequest, MetricsUtils.m41641b(MetricsUtils.RequestType.ID_TOKEN_REQUEST, credentialTypeForMetrics));
        HttpResponse execute = buildPostRequest.execute();
        int statusCode = execute.getStatusCode();
        if (statusCode >= 400 && statusCode < 500) {
            throw new IOException(String.format("Error code %s trying to getIDToken: %s", Integer.valueOf(statusCode), CJ0.m68789j(CJ0.m68792g((GenericData) execute.parseAs((Class<Object>) GenericData.class), Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Error parsing error message response. "), "message", "Error parsing error message response. ")));
        }
        if (statusCode == 200) {
            if (execute.getContent() != null) {
                return IdToken.create(CJ0.m68789j((GenericJson) execute.parseAs((Class<Object>) GenericJson.class), "token", "Error parsing error message response. "));
            }
            throw new IOException("Empty content from generateIDToken server request.");
        }
        throw new IOException(String.format("Unexpected Error code %s trying to getIDToken: %s", Integer.valueOf(statusCode), execute.parseAsString()));
    }

    /* renamed from: c */
    public static String m41488c(String str, String str2, Map map, HttpRequestFactory httpRequestFactory) {
        GenericUrl genericUrl = new GenericUrl(String.format("https://iamcredentials.googleapis.com/v1/projects/-/serviceAccounts/%s:signBlob", str));
        GenericData genericData = new GenericData();
        genericData.set("payload", str2);
        for (Map.Entry entry : map.entrySet()) {
            genericData.set((String) entry.getKey(), entry.getValue());
        }
        JsonFactory jsonFactory = CJ0.f695f;
        HttpRequest buildPostRequest = httpRequestFactory.buildPostRequest(genericUrl, new JsonHttpContent(jsonFactory, genericData));
        buildPostRequest.setParser(new JsonObjectParser(jsonFactory));
        buildPostRequest.setThrowExceptionOnExecuteError(false);
        buildPostRequest.setNumberOfRetries(3);
        ExponentialBackOff build = new ExponentialBackOff.Builder().setInitialIntervalMillis(1000).setRandomizationFactor(0.1d).setMultiplier(2.0d).build();
        buildPostRequest.setUnsuccessfulResponseHandler(new HttpBackOffUnsuccessfulResponseHandler(build).setBackOffRequired(new HttpBackOffUnsuccessfulResponseHandler.BackOffRequired() { // from class: cc0
            @Override // com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired
            public final boolean isRequired(HttpResponse httpResponse) {
                return AbstractC7376e.m41490a(httpResponse);
            }
        }));
        buildPostRequest.setIOExceptionHandler(new HttpBackOffIOExceptionHandler(build));
        HttpResponse execute = buildPostRequest.execute();
        int statusCode = execute.getStatusCode();
        if (statusCode >= 400 && statusCode < 500) {
            throw new IOException(String.format("Error code %s trying to sign provided bytes: %s", Integer.valueOf(statusCode), CJ0.m68789j(CJ0.m68792g((GenericData) execute.parseAs((Class<Object>) GenericData.class), Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Error parsing error message response. "), "message", "Error parsing error message response. ")));
        }
        if (statusCode == 200) {
            if (execute.getContent() != null) {
                return CJ0.m68789j((GenericData) execute.parseAs((Class<Object>) GenericData.class), "signedBlob", "Error parsing signature response. ");
            }
            throw new IOException("Empty content from sign blob server request.");
        }
        throw new IOException(String.format("Unexpected Error code %s trying to sign provided bytes: %s", Integer.valueOf(statusCode), execute.parseAsString()));
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m41487d(HttpResponse httpResponse) {
        return f52672a.contains(Integer.valueOf(httpResponse.getStatusCode()));
    }

    /* renamed from: e */
    public static byte[] m41486e(String str, Credentials credentials, HttpTransport httpTransport, byte[] bArr, Map map) {
        BaseEncoding base64 = BaseEncoding.base64();
        try {
            return base64.decode(m41488c(str, base64.encode(bArr), map, httpTransport.createRequestFactory(new HttpCredentialsAdapter(credentials))));
        } catch (IOException e) {
            throw new ServiceAccountSigner.SigningException("Failed to sign the provided bytes", e);
        }
    }
}
