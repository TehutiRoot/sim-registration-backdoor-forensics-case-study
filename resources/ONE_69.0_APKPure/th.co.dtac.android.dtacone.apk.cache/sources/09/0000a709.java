package com.google.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpBackOffIOExceptionHandler;
import com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.GenericData;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.SecureSessionAgent;
import com.google.common.collect.Iterables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes4.dex */
public class SecureSessionAgent {

    /* renamed from: b */
    public static final Set f52514b = new HashSet(Arrays.asList(500, 502, 503));

    /* renamed from: c */
    public static final String f52515c = ComputeEngineCredentials.getMetadataServerUrl() + "/computeMetadata/v1/instance/platform-security/auto-mtls-configuration";

    /* renamed from: a */
    public transient HttpTransportFactory f52516a;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public HttpTransportFactory f52517a;

        public SecureSessionAgent build() {
            return new SecureSessionAgent(this);
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52517a;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52517a = httpTransportFactory;
            return this;
        }
    }

    public SecureSessionAgent(Builder builder) {
        this.f52516a = builder.getHttpTransportFactory();
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m41613c(HttpResponse httpResponse) {
        return f52514b.contains(Integer.valueOf(httpResponse.getStatusCode()));
    }

    public static SecureSessionAgent create() {
        return newBuilder().build();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* renamed from: b */
    public final SecureSessionAgentConfig m41614b() {
        String str;
        String str2 = "";
        if (this.f52516a == null) {
            this.f52516a = (HttpTransportFactory) Iterables.getFirst(ServiceLoader.load(HttpTransportFactory.class), IJ0.f2656e);
        }
        try {
            HttpRequest buildGetRequest = this.f52516a.create().createRequestFactory().buildGetRequest(new GenericUrl(f52515c));
            buildGetRequest.setParser(new JsonObjectParser(IJ0.f2657f));
            buildGetRequest.getHeaders().set("Metadata-Flavor", (Object) "Google");
            buildGetRequest.setThrowExceptionOnExecuteError(false);
            buildGetRequest.setNumberOfRetries(3);
            ExponentialBackOff build = new ExponentialBackOff.Builder().setInitialIntervalMillis(1000).setRandomizationFactor(0.1d).setMultiplier(2.0d).build();
            buildGetRequest.setUnsuccessfulResponseHandler(new HttpBackOffUnsuccessfulResponseHandler(build).setBackOffRequired(new HttpBackOffUnsuccessfulResponseHandler.BackOffRequired() { // from class: jG1
                @Override // com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired
                public final boolean isRequired(HttpResponse httpResponse) {
                    boolean m41613c;
                    m41613c = SecureSessionAgent.m41613c(httpResponse);
                    return m41613c;
                }
            }));
            buildGetRequest.setIOExceptionHandler(new HttpBackOffIOExceptionHandler(build));
            try {
                HttpResponse execute = buildGetRequest.execute();
                if (execute.getContent() == null) {
                    return SecureSessionAgentConfig.createBuilder().build();
                }
                Map map = (Map) ((GenericData) execute.parseAs((Class<Object>) GenericData.class)).get("s2a");
                if (map == null) {
                    return SecureSessionAgentConfig.createBuilder().build();
                }
                try {
                    str = IJ0.m68025j(map, "plaintext_address", "Error parsing S2A Config from MDS JSON response.");
                } catch (IOException unused) {
                    str = "";
                }
                try {
                    str2 = IJ0.m68025j(map, "mtls_address", "Error parsing S2A Config from MDS JSON response.");
                } catch (IOException unused2) {
                }
                return SecureSessionAgentConfig.createBuilder().setPlaintextAddress(str).setMtlsAddress(str2).build();
            } catch (IOException unused3) {
                return SecureSessionAgentConfig.createBuilder().build();
            }
        } catch (IOException unused4) {
            return SecureSessionAgentConfig.createBuilder().build();
        }
    }

    public SecureSessionAgentConfig getConfig() {
        return m41614b();
    }
}